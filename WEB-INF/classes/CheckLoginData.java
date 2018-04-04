import java.util.Vector;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckLoginData {
    String emailLogin;
    String passwordLogin;
    String confpasswordLogin;
        
    CheckLoginData (String emailLogin, String passwordLogin, String confpasswordLogin) {
        this.emailLogin = emailLogin;
        this.passwordLogin = passwordLogin;
        this.confpasswordLogin = confpasswordLogin;
    }

    public static CheckLoginData getLogin(Connection connection, String loginemail) {
        String sql = "Select Email, Password FROM Users";
        sql += " WHERE Email=?";
        System.out.println("getLogin: " + sql);
        CheckLoginData ulog = null;;
        try {
			//System.out.println("CheckLoginData Error 0");
            PreparedStatement pstmt = connection.prepareStatement(sql);
			//System.out.println("CheckLoginData Error 1");
            pstmt.setString(1, loginemail);
			//System.out.println("CheckLoginData Error 2");
            ResultSet result = pstmt.executeQuery();
			//System.out.println("CheckLoginData Error 3");
            if(result.next()) {
			//System.out.println("CheckLoginData Error 4");
                ulog = new CheckLoginData(
                    result.getString("Email"), 
                    result.getString("Password"), 
                    null 
                );
            }
			//System.out.println("CheckLoginData Error 5");
            result.close();
            pstmt.close();
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("Error in getLogin: " + sql + " Exception: " + e);
        }
        return ulog;
    }
	
}
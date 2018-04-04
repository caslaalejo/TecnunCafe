import java.util.Vector;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class NewUserData {
    String  userName;
    String userSurName;
    int    phoneNumber;
    String emailAddress;
    String passWord;
    String confirmpassWord;
    
    NewUserData(String userName, String userSurName, int phoneNumber, String emailAddress, String passWord, String confirmpassWord) {
        this.userName = userName;
        this.userSurName  = userSurName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.passWord = passWord;
        this.confirmpassWord = confirmpassWord;
    }

    public static int registerUser(Connection connection, NewUserData user) {
        String sql ="INSERT INTO Users VALUES(?,?,?,?,?,?)";

        System.out.println("registerUser: " + sql);
        int n = 0;
        try {
            PreparedStatement stmtUpdate= connection.prepareStatement(sql);
			Random rand = new Random(); 
			stmtUpdate.setInt(1, rand.nextInt(500));
            stmtUpdate.setString(2,user.userName);
            stmtUpdate.setString(3,user.userSurName);
            stmtUpdate.setInt(4,user.phoneNumber);
            stmtUpdate.setString(5,user.emailAddress);
            stmtUpdate.setString(6,user.passWord);
            n = stmtUpdate.executeUpdate();
            stmtUpdate.close();
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("Error in registerUser: " + sql + " Exception: " + e);
        }
        return n;
    }   

	public static int deleteUser(Connection connection, NewUserData user) {
        String sql ="DELETE FROM Users WHERE Email=?";

        System.out.println("registerUser: " + sql);
        int del = 0;
        try {
            PreparedStatement stmtUpdate= connection.prepareStatement(sql);
			stmtUpdate.setString(1, user.emailAddress);
            del = stmtUpdate.executeUpdate();
            stmtUpdate.close();
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("Error in deleteUser: " + sql + " Exception: " + e);
        }
        return del;
    }
}
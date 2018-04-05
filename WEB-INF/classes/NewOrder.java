//la clase NewOrder con el metodo insertOrder dnd hare la consulta para añadir a la BD

import java.util.Vector;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Hour;

public class NewOrder {
    int    orderId;
    Date    orderDate;
	Hour  hour;
    
    OrderData (int orderId, Date orderDate, Hour  hour ) {
        this.orderId    = orderId;
        this.orderDate = orderDate;
		this.hour = hour;
    }
	
	public static int Orderinsert(Connection connection) {
        String sql ="INSERT INTO Orders (Date, [Collection time]) "
            + "VALUES (?, ?)";
        System.out.println("orderinsert: " + sql);
        int n = 0;
        try {
            PreparedStatement stmtUpdate= connection.prepareStatement(sql);
            stmtUpdate.setInt(1,Orders.date);
            stmtUpdate.setDate(2, Orders.hour);

            n = stmtUpdate.executeUpdate();
            stmtUpdate.close();
			
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("Error in Orderinsert: " + sql + " Exception: " + e);
        }
		
        return n;
    }
}
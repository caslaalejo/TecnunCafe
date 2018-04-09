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
    String   orderDate;
	String  orderHour;
    
	OrderData (int orderId, String orderDate, String  orderHour ) {
        this.orderId    = orderId;
        this.orderDate = orderDate;
		this.orderHour = orderHour;
    }
	
	//nuevo constructor con dos objetos para que concuerde con lo del servlet
    OrderData ( Date orderDate, Hour  hour ) {
       
		this.orderDate = orderDate;
		this.orderHour = orderHour;
    }
    
	public static int Orderinsert(Connection connection, NewOrder order ) {   //aunque no tiene porque ser order, puede llamarse alejo. Lo importante es el tipo 
        String sql ="INSERT INTO Orders (Date, Time) "
            + "VALUES (?, ?)";
        System.out.println("orderinsert: " + sql);
        int n = 0;
        try {
            PreparedStatement stmtUpdate= connection.prepareStatement(sql);
            stmtUpdate.setString(1,order.orderDate);
            stmtUpdate.setString(2, order.orderHour);

            n = stmtUpdate.executeUpdate();
            stmtUpdate.close();
			
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("Error in Orderinsert: " + sql + " Exception: " + e);
        }
		
        return n;
    }
}
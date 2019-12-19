package ec.edu.ups.conexion;
import java.sql.*;

import javax.swing.JOptionPane;

import com.mysql.jdbc.SQLError;
import com.mysql.jdbc.Driver;

public class ConecxionBD {
  
   @SuppressWarnings("unused")
public static Connection getConnection() {
	   Connection con =null;
	   try {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://base-server.leon.com/sistemafacturacion";
		String user="root";
		String cont="";
		
		
		DriverManager.setLoginTimeout(10);
		
				
		con=DriverManager.getConnection(url, user, cont);
		int tiempo=con.getNetworkTimeout();
		//System.out.println(tiempo);

	} catch (ClassNotFoundException e) { 
		// TODO Auto-generated catch block
		JOptionPane.showMessageDialog(null, "error cargar bd");
		System.out.println("Error -------> al cargar el Driver");
		//e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		
		
		/*JOptionPane.showMessageDialog(null, "error cargar bd");
		System.out.println("Error-------> al cargar la BD");*/
		//e.printStackTrace();
	}
	   return con;
   }
}

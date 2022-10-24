package student_manage1;

import java.sql.Connection;
import java.sql.DriverManager;
public class cp1 {
	static Connection con;
	public static Connection createc() {
		
		try {
			
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the Connection
			String user = "root"; //user of mysql
			String password = "Gauri@2401"; //password of mysql
			String url = "jdbc:mysql://localhost:3306/student_manage1";
			con = DriverManager.getConnection(url,user,password);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
}


// program for jdbc 1 program 
import java.sql.*;
class firstjdbc {
	public static void main(String args[]){
		try{
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			//creating a connection
			String url="jdbc:mysql://localhost:3306/sai";
			String username="root";
			String password="Sai@042003";
			Connection con=DriverManager.getConnection(url,username,password);
			if(con.isClosed()){
				System.out.println("connection is closed");
			}else{
				System.out.println("connection created....");
			}


		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
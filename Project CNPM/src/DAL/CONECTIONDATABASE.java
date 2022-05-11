package DAL;

import java.sql.*;

public class CONECTIONDATABASE {
	protected Connection con = null;
	public CONECTIONDATABASE() {
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String dbURL = "jdbc:sqlserver://MSI;DatabaseName=QUANLYMAYTINHCNPM;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";
			String username ="MSI/Admin";
			String password="";
			con = DriverManager.getConnection(dbURL, username, password);
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
	public void closeConnection(){
		try{
			if(con!=null)
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

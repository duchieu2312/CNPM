package DAL;

import java.sql.*;
import java.util.*;
import DTO.USERSDTO;

public class USERSDAL extends CONECTIONDATABASE {

	public Vector<USERSDTO> getAllUser() {
		Vector <USERSDTO> arr = new Vector<USERSDTO>();
		try {
			String sql = "Select * from USERS";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				USERSDTO user = new USERSDTO();
				user.setUSER_ID(rs.getInt("User_id"));
				user.setUSER_DisplayName(rs.getString("DisplayName"));
				user.setUSER_UserName(rs.getString("UserName"));
				user.setUSER_Password(rs.getString("Password"));
				user.setUSER_idRole(rs.getInt("UserRole_id"));
				arr.add(user);
			}
		} catch (SQLException ex) {
			System.out.println(ex);
		} finally {
			closeConnection();
		}
		return arr;
	}

	 public USERSDTO dangNhap(USERSDTO User) {
        try {
            String sql = "SELECT * FROM USERS WHERE UserName=? AND Password=?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, User.getUSER_UserName());
            pre.setString(2, User.getUSER_Password());
            ResultSet rs = pre.executeQuery();
            USERSDTO UserLogin = null;
            if (rs.next()) {
                UserLogin = User;
                UserLogin.setUSER_DisplayName(rs.getString("DisplayName"));
                UserLogin.setUSER_ID(rs.getInt("User_id"));
                UserLogin.setUSER_idRole(rs.getInt("UserRole_id"));
            }
            return UserLogin;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
			closeConnection();
		}
        return User;
    }
    
}

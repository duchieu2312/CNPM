package DAL;
import java.sql.*;
import java.util.*;
import DTO.CUSTOMERDTO;

public class KiemTraKhachHangDAL extends CONECTIONDATABASE{
	public CUSTOMERDTO KiemTraKhachHang(CUSTOMERDTO KhachHang) {
	       try {
	            String sql = "SELECT * FROM CUSTOMER WHERE Phone = ?";
	            PreparedStatement pre = con.prepareStatement(sql);
	            pre.setString(1, KhachHang.getCUSTOMER_Phone());
	            ResultSet rs = pre.executeQuery();
	            String sql1 = "SELECT * FROM CUSTOMER";
				Statement stmt = con.createStatement();
				ResultSet rs1 = stmt.executeQuery(sql1);
	            CUSTOMERDTO KhachHangDaKiemTra  = null;
	            if (rs.next()) {
	                KhachHangDaKiemTra = KhachHang;
	                KhachHangDaKiemTra.setCUSTOMER_DisplayName(rs.getString("DisplayName"));
	                KhachHangDaKiemTra.setCUSTOMER_ID(rs.getInt("Customer_id"));
	                KhachHangDaKiemTra.setCUSTOMER_ContactDate(rs.getDate("ContactDate"));
	                KhachHangDaKiemTra.setCUSTOMER_Address(rs.getString("Address"));
	                KhachHangDaKiemTra.setCUSTOMER_Email(rs.getString("Email"));
	                KhachHangDaKiemTra.setCUSTOMER_MoreInfo(rs.getString("MoreInfo"));
	                return KhachHangDaKiemTra;
	            } 
	            return KhachHang;
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
				closeConnection();
			}
	       return KhachHang;
	}
}

package BLL;
import DTO.CUSTOMERDTO;


import javax.swing.JOptionPane;

import DAL.KiemTraKhachHangDAL;
public class KiemTraKhachHangBLL {
	public CUSTOMERDTO KiemTraKhachHang(String sdt) {
		CUSTOMERDTO KhachHang = new CUSTOMERDTO();
		KhachHang.setCUSTOMER_Phone(sdt);
		KiemTraKhachHangDAL KhachHangDaTonTai = new KiemTraKhachHangDAL();
		CUSTOMERDTO KhachHangTonTai = KhachHangDaTonTai.KiemTraKhachHang(KhachHang);
		if(KhachHangTonTai.getCUSTOMER_DisplayName() != null) {
			JOptionPane.showMessageDialog(null,"Khách hàng có tồn tại.");
			return KhachHangTonTai;
		}else{
			JOptionPane.showMessageDialog(null,"Khách hàng không tồn tại.");
			return KhachHangTonTai;
		}
	}
}	
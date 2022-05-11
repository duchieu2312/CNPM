package BLL;

import javax.swing.*;
import DAL.USERSDAL;
import DTO.USERSDTO;


public class USERSBLL {

    private final static int EMPTY_ERROR = 1;
    private final static int WRONG_ERROR = 2;
    public static USERSDTO UserLogin = null;

    public USERSDTO getTaiKhoanDangNhap(String user, String password) {
        if (kiemTraDangNhap(user, password) == EMPTY_ERROR) {
        	JOptionPane.showMessageDialog(null, "Khônh được để trống thông tin");
        	return null;
        }
        USERSDTO users = new USERSDTO();
        users.setUSER_UserName(user);
        users.setUSER_Password(password);

        USERSDAL USERDAL = new USERSDAL();
        USERSDTO account = USERDAL.dangNhap(users);
        UserLogin = account;

        if (account == null) {
        	JOptionPane.showMessageDialog(null, "Sai thông tin đăng nhập hoặc tài khoản không tồn tại");
        } else {
        	/*USERROLEBLL USERROLEBLL = new USERROLEBLL();
        	USERROLEBLL.kiemTraQuyen(account.getQuyen());*/
            JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
        }
        return account;
    }

    private int kiemTraDangNhap(String user, String password) {
        user = user.replaceAll("\\s+", "");
        password = password.replaceAll("\\s+", "");
        int result = 0;

        USERSDTO users = new USERSDTO();
        users.setUSER_UserName(user);
        users.setUSER_Password(password);

        USERSDAL USERDAL = new USERSDAL();
        USERSDTO account = USERDAL.dangNhap(users);

        if (user.length() <= 0 || password.length() <= 0) {
            result = EMPTY_ERROR;
        } else if (account == null) {
            result = WRONG_ERROR;
        }
        return result;
    }
	
}

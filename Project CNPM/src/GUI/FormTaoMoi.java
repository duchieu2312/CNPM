package GUI;

import java.awt.*;
import BLL.KiemTraKhachHangBLL;
import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import DTO.USERSDTO;
import DTO.CUSTOMERDTO;
public class FormTaoMoi {

	protected JFrame Frame;
	private JTextField txtSearch;
	private JTextField txtfSDT;
	private JTextField txtfTenKH;
	private JTextField txtfNgaySinhKH;
	private JTextField txtfSDTKH;
	private JTextField txtfDiaChiKH;
	private JTextField txtfMaKH;
	private JTextField txtfTenCongTyDaiDIen;
	private JTextField txtfQuocTichKH;
	private JTextField txtfGhiChu;
	private JTextField txtfEmail;
	private static USERSDTO userlogin;
	private JButton btnQuanLyNhanVien,btnDoanhThu,btnCaiDat;


	public FormTaoMoi(USERSDTO UserLogin) {
		initComponents();
		userlogin = UserLogin;
		PhanQuyenTaiKhoan(UserLogin);
	}

	private void initComponents() {
		Frame = new JFrame();
		Frame.setSize(1280,800);
		Frame.setLocationRelativeTo(null);
		Frame.setResizable(false);
		Frame.setUndecorated(true);
		Frame.getContentPane().setBackground(new Color(247, 248, 252));
		Frame.getContentPane().setLayout(null);
		
        /*
        ============================================================
                                SIDE MENU           
        ============================================================
         */
		
		JPanel pnSideMenu = new JPanel();
		pnSideMenu.setBounds(0, 0, 272, 800);
		pnSideMenu.setBackground(new Color(71, 121, 140));
		Frame.getContentPane().add(pnSideMenu);
		pnSideMenu.setLayout(null);

		JLabel logo = new JLabel();
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Logo2.png"));
		logo.setIcon(img);
		logo.setBounds(0, 0, 115, 102);
		pnSideMenu.add(logo);
		
		JLabel lblTitle = new JLabel();
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 30));
		lblTitle.setText("<html>HKLK<br>Computer</html>");
		lblTitle.setBounds(113, 0, 159, 102);
		pnSideMenu.add(lblTitle);
		
		JLabel lblQuanLyCuaHang = new JLabel("Quản lý cửa hàng");
		lblQuanLyCuaHang.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuanLyCuaHang.setFont(new Font("Arial", Font.BOLD, 28));
		lblQuanLyCuaHang.setForeground(new Color(255, 250, 250));
		lblQuanLyCuaHang.setBounds(0, 124, 272, 55);
		pnSideMenu.add(lblQuanLyCuaHang);
				
		JButton btnTongQuan = new JButton("Tổng quan");
		btnTongQuan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormTrangChu frm = new FormTrangChu(userlogin);
				frm.Frame.setVisible(true);
				Frame.dispose();
			}
		});
		btnTongQuan.setFocusable(false);
		btnTongQuan.setOpaque(true);
		btnTongQuan.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnTongQuan.setFont(new Font("Arial", Font.PLAIN, 22));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/1. overview.png"));
				Image newimg = icon.getImage().getScaledInstance(35,35, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnTongQuan.setIcon(icon);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnTongQuan.setFont(new Font("Arial", Font.PLAIN, 19));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/1. overview.png"));
				Image newimg = icon.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnTongQuan.setIcon(icon);
	         }
		});
		btnTongQuan.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTongQuan.setHorizontalAlignment(SwingConstants.LEFT);
		btnTongQuan.setFont(new Font("Arial", Font.PLAIN, 21));
		btnTongQuan.setForeground(new Color(255, 250, 250));
		btnTongQuan.setBackground(new Color(71, 121, 140));
		btnTongQuan.setBorder(new EmptyBorder(0, 16, 0, 0));
		btnTongQuan.setBounds(0, 228, 272, 55);
		ImageIcon iconTQ = new ImageIcon(this.getClass().getResource("/1. overview.png"));
		Image newimgTQ = iconTQ.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		iconTQ = new ImageIcon(newimgTQ);
		btnTongQuan.setIcon(iconTQ);
		pnSideMenu.add(btnTongQuan);
		
		JButton btnTaoMoi = new JButton("Tạo mới");
		btnTaoMoi.setFocusable(false);
		btnTaoMoi.setOpaque(true);
		btnTaoMoi.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnTaoMoi.setFont(new Font("Arial", Font.PLAIN, 22));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/2. activetickets.png"));
				Image newimg = icon.getImage().getScaledInstance(35,35, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnTaoMoi.setIcon(icon);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnTaoMoi.setFont(new Font("Arial", Font.PLAIN, 19));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/2. activetickets.png"));
				Image newimg = icon.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnTaoMoi.setIcon(icon);
	         }
		});
		btnTaoMoi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTaoMoi.setHorizontalAlignment(SwingConstants.LEFT);
		btnTaoMoi.setFont(new Font("Arial", Font.PLAIN, 21));
		btnTaoMoi.setForeground(new Color(255, 250, 250));
		btnTaoMoi.setBackground(new Color(89, 134, 151));
		btnTaoMoi.setBorder(new EmptyBorder(0, 16, 0, 0));
		btnTaoMoi.setBounds(0, 294, 272, 55);
		ImageIcon iconTM = new ImageIcon(this.getClass().getResource("/2. activetickets.png"));
		Image newimgTM= iconTM.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		iconTM = new ImageIcon(newimgTM);
		btnTaoMoi.setIcon(iconTM);
		pnSideMenu.add(btnTaoMoi);
	
		JButton btnThongBao = new JButton("Thông báo");
		btnThongBao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThongBao.setFocusable(false);
		btnThongBao.setOpaque(true);
		btnThongBao.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnThongBao.setFont(new Font("Arial", Font.PLAIN, 22));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/3. ideas.png"));
				Image newimg = icon.getImage().getScaledInstance(35,35, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnThongBao.setIcon(icon);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnThongBao.setFont(new Font("Arial", Font.PLAIN, 19));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/3. ideas.png"));
				Image newimg = icon.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnThongBao.setIcon(icon);
	         }
		});
		btnThongBao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnThongBao.setHorizontalAlignment(SwingConstants.LEFT);
		btnThongBao.setFont(new Font("Arial", Font.PLAIN, 21));
		btnThongBao.setForeground(new Color(255, 250, 250));
		btnThongBao.setBackground(new Color(71, 121, 140));
		btnThongBao.setBorder(new EmptyBorder(0, 16, 0, 0));
		btnThongBao.setBounds(0, 360, 272, 55);
		ImageIcon iconTB = new ImageIcon(this.getClass().getResource("/3. ideas.png"));
		Image newimgTB = iconTB.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		iconTB = new ImageIcon(newimgTB);
		btnThongBao.setIcon(iconTB);
		pnSideMenu.add(btnThongBao);
				
		JButton btnQuanLyKhachHang = new JButton("Quản lý khách hàng");
		btnQuanLyKhachHang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormQLKhachHang frm = new FormQLKhachHang(userlogin);
				frm.Frame.setVisible(true);
				Frame.dispose();
			}
		});
		btnQuanLyKhachHang.setFocusable(false);
		btnQuanLyKhachHang.setOpaque(true);
		btnQuanLyKhachHang.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnQuanLyKhachHang.setFont(new Font("Arial", Font.PLAIN, 22));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/4. contacts.png"));
				Image newimg = icon.getImage().getScaledInstance(35,35, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnQuanLyKhachHang.setIcon(icon);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnQuanLyKhachHang.setFont(new Font("Arial", Font.PLAIN, 19));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/4. contacts.png"));
				Image newimg = icon.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnQuanLyKhachHang.setIcon(icon);
	         }
		});
		btnQuanLyKhachHang.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnQuanLyKhachHang.setHorizontalAlignment(SwingConstants.LEFT);
		btnQuanLyKhachHang.setFont(new Font("Arial", Font.PLAIN, 21));
		btnQuanLyKhachHang.setForeground(new Color(255, 250, 250));
		btnQuanLyKhachHang.setBackground(new Color(71, 121, 140));
		btnQuanLyKhachHang.setBorder(new EmptyBorder(0, 16, 0, 0));
		btnQuanLyKhachHang.setBounds(0, 426, 272, 55);
		ImageIcon iconQLKH = new ImageIcon(this.getClass().getResource("/4. contacts.png"));
		Image newimgQLKH = iconQLKH.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		iconQLKH = new ImageIcon(newimgQLKH);
		btnQuanLyKhachHang.setIcon(iconQLKH);
		pnSideMenu.add(btnQuanLyKhachHang);
		
		btnQuanLyNhanVien = new JButton("Quản lý nhân viên");
		btnQuanLyNhanVien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnQuanLyNhanVien.setFocusable(false);
		btnQuanLyNhanVien.setOpaque(true);
		btnQuanLyNhanVien.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnQuanLyNhanVien.setFont(new Font("Arial", Font.PLAIN, 22));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/5. agents.png"));
				Image newimg = icon.getImage().getScaledInstance(35,35, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnQuanLyNhanVien.setIcon(icon);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnQuanLyNhanVien.setFont(new Font("Arial", Font.PLAIN, 19));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/5. agents.png"));
				Image newimg = icon.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnQuanLyNhanVien.setIcon(icon);
	         }
		});
		btnQuanLyNhanVien.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnQuanLyNhanVien.setHorizontalAlignment(SwingConstants.LEFT);
		btnQuanLyNhanVien.setFont(new Font("Arial", Font.PLAIN, 21));
		btnQuanLyNhanVien.setForeground(new Color(255, 250, 250));
		btnQuanLyNhanVien.setBackground(new Color(71, 121, 140));
		btnQuanLyNhanVien.setBorder(new EmptyBorder(0, 16, 0, 0));
		btnQuanLyNhanVien.setBounds(0, 492, 272, 55);
		ImageIcon iconQLNV = new ImageIcon(this.getClass().getResource("/5. agents.png"));
		Image newimgQLNV = iconQLNV.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		iconQLNV = new ImageIcon(newimgQLNV);
		btnQuanLyNhanVien.setIcon(iconQLNV);
		pnSideMenu.add(btnQuanLyNhanVien);
		
		JButton btnQuanLyDonHang = new JButton("Quản lý đơn hàng");
		btnQuanLyDonHang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormQLDonHang frm = new FormQLDonHang(userlogin);
				frm.Frame.setVisible(true);
				Frame.dispose();
			}
		});
		btnQuanLyDonHang.setFocusable(false);
		btnQuanLyDonHang.setOpaque(true);
		btnQuanLyDonHang.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnQuanLyDonHang.setFont(new Font("Arial", Font.PLAIN, 22));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/6. articles.png"));
				Image newimg = icon.getImage().getScaledInstance(35,35, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnQuanLyDonHang.setIcon(icon);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnQuanLyDonHang.setFont(new Font("Arial", Font.PLAIN, 19));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/6. articles.png"));
				Image newimg = icon.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnQuanLyDonHang.setIcon(icon);
	         }
		});
		btnQuanLyDonHang.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnQuanLyDonHang.setHorizontalAlignment(SwingConstants.LEFT);
		btnQuanLyDonHang.setFont(new Font("Arial", Font.PLAIN, 21));
		btnQuanLyDonHang.setForeground(new Color(255, 250, 250));
		btnQuanLyDonHang.setBackground(new Color(71, 121, 140));
		btnQuanLyDonHang.setBorder(new EmptyBorder(0, 16, 0, 0));
		btnQuanLyDonHang.setBounds(0, 557, 272, 55);
		ImageIcon iconQLDH = new ImageIcon(this.getClass().getResource("/6. articles.png"));
		Image newimgQLDH = iconQLDH.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		iconQLDH = new ImageIcon(newimgQLDH);
		btnQuanLyDonHang.setIcon(iconQLDH);
		pnSideMenu.add(btnQuanLyDonHang);
		
		btnCaiDat = new JButton("Cài đặt phân quyền");
		btnCaiDat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCaiDat.setFocusable(false);
		btnCaiDat.setOpaque(true);
		btnCaiDat.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnCaiDat.setFont(new Font("Arial", Font.PLAIN, 22));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/7. settings.png"));
				Image newimg = icon.getImage().getScaledInstance(35,35, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnCaiDat.setIcon(icon);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnCaiDat.setFont(new Font("Arial", Font.PLAIN, 19));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/7. settings.png"));
				Image newimg = icon.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnCaiDat.setIcon(icon);
	         }
		});
		btnCaiDat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCaiDat.setHorizontalAlignment(SwingConstants.LEFT);
		btnCaiDat.setFont(new Font("Arial", Font.PLAIN, 21));
		btnCaiDat.setForeground(new Color(255, 250, 250));
		btnCaiDat.setBackground(new Color(71, 121, 140));
		btnCaiDat.setBorder(new EmptyBorder(0, 16, 0, 0));
		btnCaiDat.setBounds(0, 623, 272, 55);
		ImageIcon iconCDPQ = new ImageIcon(this.getClass().getResource("/7. settings.png"));
		Image newimgCDPQ = iconCDPQ.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		iconCDPQ = new ImageIcon(newimgCDPQ);
		btnCaiDat.setIcon(iconCDPQ);
		pnSideMenu.add(btnCaiDat);
		
		btnDoanhThu = new JButton("Doanh thu");
		btnDoanhThu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDoanhThu.setFocusable(false);
		btnDoanhThu.setOpaque(true);
		btnDoanhThu.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnDoanhThu.setFont(new Font("Arial", Font.PLAIN, 22));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/8. subscription.png"));
				Image newimg = icon.getImage().getScaledInstance(35,35, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnDoanhThu.setIcon(icon);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnDoanhThu.setFont(new Font("Arial", Font.PLAIN, 19));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/8. subscription.png"));
				Image newimg = icon.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnDoanhThu.setIcon(icon);
	         }
		});
		btnDoanhThu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDoanhThu.setHorizontalAlignment(SwingConstants.LEFT);
		btnDoanhThu.setFont(new Font("Arial", Font.PLAIN, 21));
		btnDoanhThu.setForeground(new Color(255, 250, 250));
		btnDoanhThu.setBackground(new Color(71, 121, 140));
		btnDoanhThu.setBorder(new EmptyBorder(0, 16, 0, 0));
		btnDoanhThu.setBounds(0, 689, 272, 55);
		ImageIcon iconDT = new ImageIcon(this.getClass().getResource("/8. subscription.png"));
		Image newimgDT = iconDT.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		iconDT = new ImageIcon(newimgDT);
		btnDoanhThu.setIcon(iconDT);
		pnSideMenu.add(btnDoanhThu);
		
        /*
        ============================================================
                                MAIN PANEL           
        ============================================================
         */
		
		JPanel pnMain = new JPanel();
		pnMain.setBounds(272, 0, 1008, 800);
		pnMain.setLayout(null);
		pnMain.setBackground(new Color(247, 248, 252));
		Frame.getContentPane().add(pnMain);
		
        /*
        ============================================================
                                HEADER MAIN           
        ============================================================
         */
		
		txtSearch = new JTextField();
		txtSearch.setBounds(111, 30, 437, 31);
		txtSearch.setHorizontalAlignment(SwingConstants.LEFT);
		pnMain.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnTimKiem = new JButton();
		btnTimKiem.setFocusPainted(false);
		btnTimKiem.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnTimKiem.setOpaque(true);
		btnTimKiem.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTimKiem.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon iconTK = new ImageIcon(this.getClass().getResource("/search.png"));
		Image newimgTK = iconTK.getImage().getScaledInstance(20,20, java.awt.Image.SCALE_SMOOTH);
		iconTK = new ImageIcon(newimgTK);
		btnTimKiem.setIcon(iconTK);
		btnTimKiem.setFont(new Font("Arial", Font.PLAIN, 17));
		btnTimKiem.setBorder(BorderFactory.createLineBorder(Color.black,1));
		btnTimKiem.setBackground(new Color(247, 248, 252));
		btnTimKiem.setBounds(558, 30, 39, 31);
		pnMain.add(btnTimKiem);
		
		JButton btnBaoCaoTon = new JButton();
		btnBaoCaoTon.setFocusPainted(false);
		btnBaoCaoTon.setText("Báo cáo tồn");
		btnBaoCaoTon.setOpaque(true);
		btnBaoCaoTon.setHorizontalTextPosition(SwingConstants.RIGHT);
		ImageIcon iconBCT = new ImageIcon(this.getClass().getResource("/new.png"));
		Image newimgBCT = iconBCT.getImage().getScaledInstance(20,20, java.awt.Image.SCALE_SMOOTH);
		iconBCT = new ImageIcon(newimgBCT);
		btnBaoCaoTon.setIcon(iconBCT);
		btnBaoCaoTon.setFont(new Font("Arial", Font.PLAIN, 17));
		btnBaoCaoTon.setBorder(BorderFactory.createLineBorder(Color.black,1));
		btnBaoCaoTon.setBackground(new Color(247, 248, 252));
		btnBaoCaoTon.setBounds(607, 30, 149, 31);
		pnMain.add(btnBaoCaoTon);
		
		JPanel panel_TaiKhoan = new JPanel();
		panel_TaiKhoan.setBounds(820, 120, 167, 130);
		panel_TaiKhoan.setBackground(Color.WHITE);
		pnMain.add(panel_TaiKhoan);
		panel_TaiKhoan.setLayout(null);
		panel_TaiKhoan.setVisible(false);
		
		JButton btnSuaThongTin = new JButton();
		btnSuaThongTin.setFocusPainted(false);
		btnSuaThongTin.setBounds(0, 11, 167, 49);
		btnSuaThongTin.setOpaque(true);
		btnSuaThongTin.addMouseListener(new MouseAdapter() {
		 public void mouseEntered(MouseEvent evt) 
         {
			btnSuaThongTin.setFont(new Font("Arial", Font.PLAIN, 15));

         }
         public void mouseExited(MouseEvent evt) 
         {
        	btnSuaThongTin.setFont(new Font("Arial", Font.PLAIN, 13));
         }
		});
		btnSuaThongTin.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnSuaThongTin.setText("Sửa thông tin");
		btnSuaThongTin.setOpaque(true);
		btnSuaThongTin.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSuaThongTin.setHorizontalAlignment(SwingConstants.CENTER);
		btnSuaThongTin.setFont(new Font("Arial", Font.PLAIN, 13));
		btnSuaThongTin.setBorder(null);
		btnSuaThongTin.setBackground(new Color(247, 248, 252));
		panel_TaiKhoan.add(btnSuaThongTin);
		
		JButton btnDangXuat = new JButton();
		btnDangXuat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormDangNhap frm = new FormDangNhap();
				frm.Frame.setVisible(true);
				Frame.dispose();
				
			}
		});
		btnDangXuat.setFocusPainted(false);
		btnDangXuat.setOpaque(true);
		btnDangXuat.addMouseListener(new MouseAdapter() {
		 public void mouseEntered(MouseEvent evt) 
         {
			btnDangXuat.setFont(new Font("Arial", Font.PLAIN, 15));

         }
         public void mouseExited(MouseEvent evt) 
         {
        	btnDangXuat.setFont(new Font("Arial", Font.PLAIN, 13));
         }
		});
		btnDangXuat.setBounds(0, 76, 167, 49);
		btnDangXuat.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnDangXuat.setText("Đăng xuất");
		btnDangXuat.setOpaque(true);
		btnDangXuat.setHorizontalTextPosition(SwingConstants.CENTER);
		btnDangXuat.setHorizontalAlignment(SwingConstants.CENTER);
		btnDangXuat.setFont(new Font("Arial", Font.PLAIN, 13));
		btnDangXuat.setBorder(null);
		btnDangXuat.setBackground(new Color(247, 248, 252));
		panel_TaiKhoan.add(btnDangXuat);
		
		JButton btnTaiKhoan = new JButton();
		btnTaiKhoan.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_TaiKhoan.setVisible(true);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				panel_TaiKhoan.setVisible(false);
			}
		});
		ImageIcon iconAvatar = new ImageIcon(this.getClass().getResource("/photo.png"));
		Image newimgAvatar = iconAvatar.getImage().getScaledInstance(100,100, java.awt.Image.SCALE_SMOOTH);
		iconAvatar = new ImageIcon(newimgAvatar);
		btnTaiKhoan.setIcon(iconAvatar);
		btnTaiKhoan.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnTaiKhoan.setOpaque(true);
		btnTaiKhoan.setHorizontalTextPosition(SwingConstants.CENTER);
		btnTaiKhoan.setHorizontalAlignment(SwingConstants.CENTER);
		btnTaiKhoan.setFont(new Font("Arial", Font.PLAIN, 13));
		btnTaiKhoan.setBorder(null);
		btnTaiKhoan.setBackground(new Color(247, 248, 252));
		btnTaiKhoan.setBounds(850, 15, 106, 103);
		pnMain.add(btnTaiKhoan);
		
        /*
        ============================================================
                                MAIN           
        ============================================================
         */
		
		JPanel pnTieuDe = new JPanel();
		pnTieuDe.setBorder(null);
		pnTieuDe.setBackground(Color.WHITE);
		pnTieuDe.setBounds(24, 120, 213, 102);
		pnMain.add(pnTieuDe);
		pnTieuDe.setLayout(null);
		
		JLabel lblTieuDe = new JLabel();
		lblTieuDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblTieuDe.setBounds(10, 25, 193, 48);
		pnTieuDe.add(lblTieuDe);
		lblTieuDe.setText("<html>THÔNG TIN CHUNG<br>CỦA KHÁCH HÀNG<html>");
		lblTieuDe.setForeground(new Color(0, 139, 139));
		lblTieuDe.setFont(new Font("Arial", Font.BOLD, 18));
		
		JPanel pnThongTinKH = new JPanel();
		pnThongTinKH.setBackground(new Color(255, 255, 255));
		pnThongTinKH.setBounds(236, 120, 751, 620);
		pnMain.add(pnThongTinKH);
		pnThongTinKH.setLayout(null);
		
		JLabel lblThongBao = new JLabel("VUI LÒNG NHẬP SĐT ĐỂ KIỂM TRA KHÁCH HÀNG CŨ");
		lblThongBao.setFont(new Font("Arial", Font.BOLD, 14));
		lblThongBao.setBounds(10, 28, 387, 23);
		pnThongTinKH.add(lblThongBao);
		
		txtfSDT = new JTextField();
		txtfSDT.setFont(new Font("Arial", Font.PLAIN, 14));
		txtfSDT.setBounds(10, 51, 544, 38);
		pnThongTinKH.add(txtfSDT);
		txtfSDT.setColumns(10);
		
		JButton btnKiemTra = new JButton("KIỂM TRA");
		btnKiemTra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KiemTraKhachHang();
						
			}
		});
		btnKiemTra.setBackground(new Color(0, 139, 139));
		btnKiemTra.setBorderPainted(false);
		btnKiemTra.setForeground(Color.WHITE);
		btnKiemTra.setFont(new Font("Arial", Font.BOLD, 14));
		btnKiemTra.setFocusPainted(false);
		btnKiemTra.setBounds(564, 50, 177, 38);
		pnThongTinKH.add(btnKiemTra);
		
		JLabel lblQT1 = new JLabel("*");
		lblQT1.setForeground(Color.RED);
		lblQT1.setFont(new Font("Arial", Font.BOLD, 14));
		lblQT1.setBounds(10, 126, 7, 17);
		pnThongTinKH.add(lblQT1);
		
		JLabel lblTenKH = new JLabel("Tên khách hàng");
		lblTenKH.setFont(new Font("Arial", Font.BOLD, 14));
		lblTenKH.setBounds(20, 126, 322, 17);
		pnThongTinKH.add(lblTenKH);
		
		txtfTenKH = new JTextField();
		txtfTenKH.setFont(new Font("Arial", Font.PLAIN, 14));
		txtfTenKH.setColumns(10);
		txtfTenKH.setBounds(10, 154, 332, 38);
		pnThongTinKH.add(txtfTenKH);
		
		JLabel lblNgaySinhKH = new JLabel("Ngày sinh");
		lblNgaySinhKH.setFont(new Font("Arial", Font.BOLD, 14));
		lblNgaySinhKH.setBounds(20, 203, 322, 17);
		pnThongTinKH.add(lblNgaySinhKH);
		
		txtfNgaySinhKH = new JTextField();
		txtfNgaySinhKH.setFont(new Font("Arial", Font.PLAIN, 14));
		txtfNgaySinhKH.setColumns(10);
		txtfNgaySinhKH.setBounds(10, 231, 332, 38);
		pnThongTinKH.add(txtfNgaySinhKH);
		
		JLabel lblQT2 = new JLabel("*");
		lblQT2.setForeground(Color.RED);
		lblQT2.setFont(new Font("Arial", Font.BOLD, 14));
		lblQT2.setBounds(10, 280, 7, 17);
		pnThongTinKH.add(lblQT2);
		
		JLabel lblSDTKH = new JLabel("Số điện thoại khách hàng");
		lblSDTKH.setFont(new Font("Arial", Font.BOLD, 14));
		lblSDTKH.setBounds(20, 280, 322, 17);
		pnThongTinKH.add(lblSDTKH);
		
		txtfSDTKH = new JTextField();
		txtfSDTKH.setFont(new Font("Arial", Font.PLAIN, 14));
		txtfSDTKH.setColumns(10);
		txtfSDTKH.setBounds(10, 308, 332, 38);
		pnThongTinKH.add(txtfSDTKH);	
		
		JLabel lblQT3 = new JLabel("*");
		lblQT3.setForeground(Color.RED);
		lblQT3.setFont(new Font("Arial", Font.BOLD, 14));
		lblQT3.setBounds(10, 357, 7, 17);
		pnThongTinKH.add(lblQT3);
		
		JLabel lbDiaChiKH = new JLabel("Địa chỉ");
		lbDiaChiKH.setFont(new Font("Arial", Font.BOLD, 14));
		lbDiaChiKH.setBounds(20, 357, 322, 17);
		pnThongTinKH.add(lbDiaChiKH);
		
		txtfDiaChiKH = new JTextField();
		txtfDiaChiKH.setFont(new Font("Arial", Font.PLAIN, 14));
		txtfDiaChiKH.setColumns(10);
		txtfDiaChiKH.setBounds(10, 385, 332, 99);
		pnThongTinKH.add(txtfDiaChiKH);
		
		JLabel lblGioiTinhKH = new JLabel("Giới tính");
		lblGioiTinhKH.setFont(new Font("Arial", Font.BOLD, 14));
		lblGioiTinhKH.setBounds(20, 495, 322, 17);
		pnThongTinKH.add(lblGioiTinhKH);
		
		ButtonGroup GioiTinh = new ButtonGroup();
		
		JRadioButton rdbtnGioiTinhNam = new JRadioButton("Nam");
		rdbtnGioiTinhNam.setBackground(new Color(255, 255, 255));
		rdbtnGioiTinhNam.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnGioiTinhNam.setBounds(20, 534, 109, 23);
		GioiTinh.add(rdbtnGioiTinhNam);
		pnThongTinKH.add(rdbtnGioiTinhNam);
		
		JRadioButton rdbtnGioiTinhNu = new JRadioButton("Nữ");
		rdbtnGioiTinhNu.setBackground(new Color(255, 255, 255));
		rdbtnGioiTinhNu.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnGioiTinhNu.setBounds(131, 534, 109, 23);
		GioiTinh.add(rdbtnGioiTinhNu);
		pnThongTinKH.add(rdbtnGioiTinhNu);
		
		JLabel lblQT4 = new JLabel("*");
		lblQT4.setForeground(Color.RED);
		lblQT4.setFont(new Font("Arial", Font.BOLD, 14));
		lblQT4.setBounds(376, 126, 7, 17);
		pnThongTinKH.add(lblQT4);
		
		JLabel lblMaKH = new JLabel("Mã khách hàng");
		lblMaKH.setFont(new Font("Arial", Font.BOLD, 14));
		lblMaKH.setBounds(386, 126, 322, 17);
		pnThongTinKH.add(lblMaKH);
		
		txtfMaKH = new JTextField();
		txtfMaKH.setFont(new Font("Arial", Font.PLAIN, 14));
		txtfMaKH.setColumns(10);
		txtfMaKH.setBounds(376, 154, 332, 38);
		pnThongTinKH.add(txtfMaKH);
		
		JLabel lblTenCongTyDaiDien = new JLabel("Tên công ty đại diện (nếu có)");
		lblTenCongTyDaiDien.setFont(new Font("Arial", Font.BOLD, 14));
		lblTenCongTyDaiDien.setBounds(386, 203, 322, 17);
		pnThongTinKH.add(lblTenCongTyDaiDien);
		
		txtfTenCongTyDaiDIen = new JTextField();
		txtfTenCongTyDaiDIen.setFont(new Font("Arial", Font.PLAIN, 14));
		txtfTenCongTyDaiDIen.setColumns(10);
		txtfTenCongTyDaiDIen.setBounds(376, 231, 332, 38);
		pnThongTinKH.add(txtfTenCongTyDaiDIen);
		
		JLabel lblQuocTichKH = new JLabel("Đang sống ở nước khác");
		lblQuocTichKH.setFont(new Font("Arial", Font.BOLD, 14));
		lblQuocTichKH.setBounds(386, 280, 322, 17);
		pnThongTinKH.add(lblQuocTichKH);
		
		txtfQuocTichKH = new JTextField();
		txtfQuocTichKH.setFont(new Font("Arial", Font.PLAIN, 14));
		txtfQuocTichKH.setColumns(10);
		txtfQuocTichKH.setBounds(376, 308, 332, 38);
		pnThongTinKH.add(txtfQuocTichKH);
		
		JLabel lblGhiChu = new JLabel("Ghi chú");
		lblGhiChu.setFont(new Font("Arial", Font.BOLD, 14));
		lblGhiChu.setBounds(386, 357, 322, 17);
		pnThongTinKH.add(lblGhiChu);
		
		txtfGhiChu = new JTextField();
		txtfGhiChu.setFont(new Font("Arial", Font.PLAIN, 14));
		txtfGhiChu.setColumns(10);
		txtfGhiChu.setBounds(376, 385, 332, 99);
		pnThongTinKH.add(txtfGhiChu);
		
		JLabel lblQT5 = new JLabel("*");
		lblQT5.setForeground(Color.RED);
		lblQT5.setFont(new Font("Arial", Font.BOLD, 14));
		lblQT5.setBounds(376, 495, 7, 17);
		pnThongTinKH.add(lblQT5);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial", Font.BOLD, 14));
		lblEmail.setBounds(386, 495, 322, 17);
		pnThongTinKH.add(lblEmail);
		
		txtfEmail = new JTextField();
		txtfEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		txtfEmail.setColumns(10);
		txtfEmail.setBounds(376, 523, 332, 38);
		pnThongTinKH.add(txtfEmail);
		
		JButton btnLuuThongTIn = new JButton("LƯU THÔNG TIN");
		btnLuuThongTIn.setBackground(new Color(0, 191, 255));
		btnLuuThongTIn.setBorderPainted(false);
		btnLuuThongTIn.setForeground(Color.WHITE);
		btnLuuThongTIn.setFont(new Font("Arial", Font.BOLD, 14));
		btnLuuThongTIn.setBounds(180, 584, 162, 23);
		pnThongTinKH.add(btnLuuThongTIn);
		
		JButton btnHuyThongTin = new JButton("HỦY");
		btnHuyThongTin.setBackground(Color.LIGHT_GRAY);
		btnHuyThongTin.setForeground(new Color(0, 0, 0));
		btnHuyThongTin.setFont(new Font("Arial", Font.BOLD, 14));
		btnHuyThongTin.setBounds(376, 584, 144, 23);
		pnThongTinKH.add(btnHuyThongTin);
		
	}
	private void PhanQuyenTaiKhoan(USERSDTO UserLogin) {
		if(UserLogin.getUSER_idRole() == 2) {
			btnQuanLyNhanVien.setEnabled(false);
			btnDoanhThu.setEnabled(false);
			btnCaiDat.setEnabled(false);
		}
	}
	
	private void KiemTraKhachHang() {
		CUSTOMERDTO KhachHang = new CUSTOMERDTO();
		KhachHang.setCUSTOMER_Phone(txtfSDT.getText().toString());
		KiemTraKhachHangBLL KhachHangDaTonTai = new KiemTraKhachHangBLL();
		KhachHang = KhachHangDaTonTai.KiemTraKhachHang(txtfSDT.getText());
		if(KhachHang.getCUSTOMER_DisplayName() != null) {
			txtfTenKH.setText(KhachHang.getCUSTOMER_DisplayName());
			txtfTenKH.setEnabled(false);
			txtfDiaChiKH.setText(KhachHang.getCUSTOMER_Address());
			txtfMaKH.setText(Integer.toString(KhachHang.getCUSTOMER_ID()));
			txtfSDTKH.setText(KhachHang.getCUSTOMER_Phone());
			txtfGhiChu.setText(KhachHang.getCUSTOMER_MoreInfo());
			txtfEmail.setText(KhachHang.getCUSTOMER_Email());
			
		}
	}
}
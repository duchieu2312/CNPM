package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import DTO.USERSDTO;
import BLL.USERSBLL;
public class FormTrangChu {
	
	protected JFrame Frame;
	private USERSDTO userlogin;
	private JLabel lblDisplayName;
	private JTextField txtSearch;
	private JTextField txtfDonHangDaBan;
	private JTextField txtfDonHangDaMua;
	private JTextField txtfDonHangSuaChua;
	private JTextField txtfDoanhThu;
	private JButton btnQuanLyNhanVien;
	private JButton btnCaiDat;
	private JButton btnDoanhThu;
	
	
	public FormTrangChu(USERSDTO UserLogin) {
		initComponents();
		userlogin = UserLogin;
		HienThiTenTaiKhoan(UserLogin);
		PhanQuyenTaiKhoan(UserLogin);	
	}
	public void initComponents() {
		Frame = new JFrame();
		Frame.setSize(1280,800);
		Frame.setLocationRelativeTo(null);
		Frame.setResizable(false);
		Frame.setUndecorated(true);
		Frame.setAlwaysOnTop(true);
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
		btnTongQuan.setFocusable(false);
		btnTongQuan.setOpaque(true);
		btnTongQuan.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnTongQuan.setFont(new Font("Arial", Font.PLAIN, 22));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/1. activeoverview.png"));
				Image newimg = icon.getImage().getScaledInstance(35,35, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnTongQuan.setIcon(icon);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnTongQuan.setFont(new Font("Arial", Font.PLAIN, 19));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/1. activeoverview.png"));
				Image newimg = icon.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnTongQuan.setIcon(icon);
	         }
		});
		btnTongQuan.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTongQuan.setHorizontalAlignment(SwingConstants.LEFT);
		btnTongQuan.setFont(new Font("Arial", Font.PLAIN, 21));
		btnTongQuan.setForeground(new Color(255, 250, 250));
		btnTongQuan.setBackground(new Color(89, 134, 151));
		btnTongQuan.setBorder(new EmptyBorder(0, 16, 0, 0));
		btnTongQuan.setBounds(0, 228, 272, 55);
		ImageIcon iconTQ = new ImageIcon(this.getClass().getResource("/1. activeoverview.png"));
		Image newimgTQ = iconTQ.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		iconTQ = new ImageIcon(newimgTQ);
		btnTongQuan.setIcon(iconTQ);
		pnSideMenu.add(btnTongQuan);
		
		JButton btnTaoMoi = new JButton("Tạo mới");
		btnTaoMoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormTaoMoi frm = new FormTaoMoi(userlogin);
				frm.Frame.setVisible(true);
				Frame.dispose();
			}
		});
		btnTaoMoi.setFocusable(false);
		btnTaoMoi.setOpaque(true);
		btnTaoMoi.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnTaoMoi.setFont(new Font("Arial", Font.PLAIN, 22));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/2. tickets.png"));
				Image newimg = icon.getImage().getScaledInstance(35,35, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnTaoMoi.setIcon(icon);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnTaoMoi.setFont(new Font("Arial", Font.PLAIN, 19));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/2. tickets.png"));
				Image newimg = icon.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnTaoMoi.setIcon(icon);
	         }
		});
		btnTaoMoi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTaoMoi.setHorizontalAlignment(SwingConstants.LEFT);
		btnTaoMoi.setFont(new Font("Arial", Font.PLAIN, 21));
		btnTaoMoi.setForeground(new Color(255, 250, 250));
		btnTaoMoi.setBackground(new Color(71, 121, 140));
		btnTaoMoi.setBorder(new EmptyBorder(0, 16, 0, 0));
		btnTaoMoi.setBounds(0, 294, 272, 55);
		ImageIcon iconTM = new ImageIcon(this.getClass().getResource("/2. tickets.png"));
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
				FormQLNhanVIen frm = new FormQLNhanVIen(userlogin);
				frm.Frame.setVisible(true);
				Frame.dispose();
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
		
		JButton btnTaoDonHang = new JButton();
		btnTaoDonHang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormTaoMoi frm = new FormTaoMoi(userlogin);
				frm.Frame.setVisible(true);
				Frame.dispose();
			}
		});
		btnTaoDonHang.setFocusPainted(false);
		btnTaoDonHang.setBounds(63, 203, 200, 150);
		btnTaoDonHang.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTaoDonHang.setOpaque(true);
		btnTaoDonHang.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
	            btnTaoDonHang.setBackground(new Color(247, 248, 252));
	            btnTaoDonHang.setBorder(BorderFactory.createLineBorder(Color.black,3));
	            btnTaoDonHang.setFont(new Font("Arial", Font.PLAIN, 20));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/user-plus.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(50,50, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnTaoDonHang.setIcon(icon1);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	            btnTaoDonHang.setBackground(new Color(247, 248, 252));
	            btnTaoDonHang.setBorder(null);
	            btnTaoDonHang.setFont(new Font("Arial", Font.PLAIN, 17));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/user-plus.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnTaoDonHang.setIcon(icon1);
	         }
		});
		btnTaoDonHang.setBackground(new Color(247, 248, 252));
		btnTaoDonHang.setFont(new Font("Arial", Font.PLAIN, 17));
		btnTaoDonHang.setText("Tạo Đơn Hàng");
		btnTaoDonHang.setBorder(null);
		btnTaoDonHang.setHorizontalAlignment(SwingConstants.CENTER);   
		btnTaoDonHang.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnTaoDonHang.setHorizontalTextPosition(SwingConstants.CENTER);
		ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/user-plus.png"));
		Image newimg1 = icon1.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
		icon1 = new ImageIcon(newimg1);
		btnTaoDonHang.setIcon(icon1);
		pnMain.add(btnTaoDonHang);
		
		JButton btnLich = new JButton();
		btnLich.setFocusPainted(false);
		btnLich.setBounds(297, 203, 200, 150);
		btnLich.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLich.setOpaque(true);
		btnLich.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
	            btnLich.setBorder(BorderFactory.createLineBorder(Color.black,3));
	            btnLich.setFont(new Font("Arial", Font.PLAIN, 20));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/Calendar.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(50,50, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnLich.setIcon(icon1);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	            btnLich.setBorder(null);
	            btnLich.setFont(new Font("Arial", Font.PLAIN, 17));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/Calendar.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnLich.setIcon(icon1);
	         }
		});
		btnLich.setBackground(new Color(247, 248, 252));
		btnLich.setFont(new Font("Arial", Font.PLAIN, 17));
		btnLich.setText("Lịch");
		btnLich.setBorder(null);
		btnLich.setHorizontalAlignment(SwingConstants.CENTER);   
		btnLich.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnLich.setHorizontalTextPosition(SwingConstants.CENTER);
		ImageIcon icon2 = new ImageIcon(this.getClass().getResource("/Calendar.png"));
		Image newimg2 = icon2.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
		icon2 = new ImageIcon(newimg2);
		btnLich.setIcon(icon2);
		pnMain.add(btnLich);
		
		JButton btnXuatHang = new JButton();
		btnXuatHang.setFocusPainted(false);
		btnXuatHang.setBounds(531, 203, 200, 150);
		btnXuatHang.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnXuatHang.setOpaque(true);
		btnXuatHang.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {

	            btnXuatHang.setBorder(BorderFactory.createLineBorder(Color.black,3));
	            btnXuatHang.setFont(new Font("Arial", Font.PLAIN, 20));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/Receipt.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(50,50, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnXuatHang.setIcon(icon1);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {

	            btnXuatHang.setBorder(null);
	            btnXuatHang.setFont(new Font("Arial", Font.PLAIN, 17));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/Receipt.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnXuatHang.setIcon(icon1);
	         }
		});
		btnXuatHang.setBackground(new Color(247, 248, 252));
		btnXuatHang.setFont(new Font("Arial", Font.PLAIN, 17));
		btnXuatHang.setText("Xuất hàng");
		btnXuatHang.setBorder(null);
		btnXuatHang.setHorizontalAlignment(SwingConstants.CENTER);   
		btnXuatHang.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnXuatHang.setHorizontalTextPosition(SwingConstants.CENTER);
		ImageIcon icon3 = new ImageIcon(this.getClass().getResource("/Receipt.png"));
		Image newimg3 = icon3.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
		icon3 = new ImageIcon(newimg3);
		btnXuatHang.setIcon(icon3);
		pnMain.add(btnXuatHang);

		JButton btnNhapHang = new JButton();
		btnNhapHang.setFocusPainted(false);
		btnNhapHang.setBounds(765, 203, 200, 150);
		btnNhapHang.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNhapHang.setOpaque(true);
		btnNhapHang.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {

	            btnNhapHang.setBorder(BorderFactory.createLineBorder(Color.black,3));
	            btnNhapHang.setFont(new Font("Arial", Font.PLAIN, 20));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/package.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(50,50, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnNhapHang.setIcon(icon1);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {

	            btnNhapHang.setBorder(null);
	            btnNhapHang.setFont(new Font("Arial", Font.PLAIN, 17));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/package.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnNhapHang.setIcon(icon1);
	         }
		});
		btnNhapHang.setBackground(new Color(247, 248, 252));
		btnNhapHang.setFont(new Font("Arial", Font.PLAIN, 17));
		btnNhapHang.setText("Nhập hàng");
		btnNhapHang.setBorder(null);
		btnNhapHang.setHorizontalAlignment(SwingConstants.CENTER);   
		btnNhapHang.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNhapHang.setHorizontalTextPosition(SwingConstants.CENTER);
		ImageIcon icon4 = new ImageIcon(this.getClass().getResource("/package.png"));
		Image newimg4 = icon4.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
		icon4 = new ImageIcon(newimg4);
		btnNhapHang.setIcon(icon4);
		pnMain.add(btnNhapHang);
		
		JButton btnDichVu = new JButton();
		btnDichVu.setFocusPainted(false);
		btnDichVu.setBounds(63, 390, 200, 150);
		btnDichVu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDichVu.setOpaque(true);
		btnDichVu.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {

				btnDichVu.setBorder(BorderFactory.createLineBorder(Color.black,3));
				btnDichVu.setFont(new Font("Arial", Font.PLAIN, 20));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/Wrench.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(50,50, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnDichVu.setIcon(icon1);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {

	        	btnDichVu.setBorder(null);
	        	btnDichVu.setFont(new Font("Arial", Font.PLAIN, 17));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/Wrench.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnDichVu.setIcon(icon1);
	         }
		});
		btnDichVu.setBackground(new Color(247, 248, 252));
		btnDichVu.setFont(new Font("Arial", Font.PLAIN, 17));
		btnDichVu.setText("Dịch vụ");
		btnDichVu.setBorder(null);
		btnDichVu.setHorizontalAlignment(SwingConstants.CENTER);   
		btnDichVu.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnDichVu.setHorizontalTextPosition(SwingConstants.CENTER);
		ImageIcon icon5 = new ImageIcon(this.getClass().getResource("/Wrench.png"));
		Image newimg5 = icon5.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
		icon5 = new ImageIcon(newimg5);
		btnDichVu.setIcon(icon5);
		pnMain.add(btnDichVu);
		
		JButton btnKhuyenMai = new JButton();
		btnKhuyenMai.setFocusPainted(false);
		btnKhuyenMai.setBounds(297, 390, 200, 150);
		btnKhuyenMai.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnKhuyenMai.setOpaque(true);
		btnKhuyenMai.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnKhuyenMai.setBorder(BorderFactory.createLineBorder(Color.black,3));
				btnKhuyenMai.setFont(new Font("Arial", Font.PLAIN, 20));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/shopping-bag.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(50,50, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnKhuyenMai.setIcon(icon1);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnKhuyenMai.setBorder(null);
	        	btnKhuyenMai.setFont(new Font("Arial", Font.PLAIN, 17));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/shopping-bag.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnKhuyenMai.setIcon(icon1);
	         }
		});
		btnKhuyenMai.setBackground(new Color(247, 248, 252));
		btnKhuyenMai.setFont(new Font("Arial", Font.PLAIN, 17));
		btnKhuyenMai.setText("Khuyến mãi");
		btnKhuyenMai.setBorder(null);
		btnKhuyenMai.setHorizontalAlignment(SwingConstants.CENTER);   
		btnKhuyenMai.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnKhuyenMai.setHorizontalTextPosition(SwingConstants.CENTER);
		ImageIcon icon6 = new ImageIcon(this.getClass().getResource("/shopping-bag.png"));
		Image newimg6 = icon6.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
		icon6 = new ImageIcon(newimg6);
		btnKhuyenMai.setIcon(icon6);
		pnMain.add(btnKhuyenMai);
		
		JButton btnTinhTrangKho = new JButton();
		btnTinhTrangKho.setFocusPainted(false);
		btnTinhTrangKho.setBounds(531, 390, 200, 150);
		btnTinhTrangKho.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTinhTrangKho.setOpaque(true);
		btnTinhTrangKho.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {

				btnTinhTrangKho.setBorder(BorderFactory.createLineBorder(Color.black,3));
				btnTinhTrangKho.setFont(new Font("Arial", Font.PLAIN, 20));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/save.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(50,50, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnTinhTrangKho.setIcon(icon1);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnTinhTrangKho.setBorder(null);
	        	btnTinhTrangKho.setFont(new Font("Arial", Font.PLAIN, 17));
	            ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/save.png"));
	            Image newimg1 = icon1.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
	            icon1 = new ImageIcon(newimg1);
	            btnTinhTrangKho.setIcon(icon1);
	         }
		});
		btnTinhTrangKho.setBackground(new Color(247, 248, 252));
		btnTinhTrangKho.setFont(new Font("Arial", Font.PLAIN, 17));
		btnTinhTrangKho.setText("Tình trạng kho");
		btnTinhTrangKho.setBorder(null);  
		btnTinhTrangKho.setHorizontalAlignment(SwingConstants.CENTER);   
		btnTinhTrangKho.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnTinhTrangKho.setHorizontalTextPosition(SwingConstants.CENTER);
		ImageIcon icon7 = new ImageIcon(this.getClass().getResource("/save.png"));
		Image newimg7 = icon7.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
		icon7 = new ImageIcon(newimg7);
		btnTinhTrangKho.setIcon(icon7);
		pnMain.add(btnTinhTrangKho);
		
		JButton btnDuLieuSanPham = new JButton();
		btnDuLieuSanPham.setFocusPainted(false);
		btnDuLieuSanPham.setBounds(765, 390, 200, 150);
		btnDuLieuSanPham.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDuLieuSanPham.setOpaque(true);
		btnDuLieuSanPham.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnDuLieuSanPham.setBorder(BorderFactory.createLineBorder(Color.black,3));
				btnDuLieuSanPham.setFont(new Font("Arial", Font.PLAIN, 20));
	            ImageIcon icon = new ImageIcon(this.getClass().getResource("/database.png"));
	            Image newimg = icon.getImage().getScaledInstance(50,50, java.awt.Image.SCALE_SMOOTH);
	            icon = new ImageIcon(newimg);
	            btnDuLieuSanPham.setIcon(icon);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnDuLieuSanPham.setBorder(null);
	        	btnDuLieuSanPham.setFont(new Font("Arial", Font.PLAIN, 17));
	            ImageIcon icon = new ImageIcon(this.getClass().getResource("/database.png"));
	            Image newimg = icon.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
	            icon = new ImageIcon(newimg);
	            btnDuLieuSanPham.setIcon(icon);
	         }
		});
		btnDuLieuSanPham.setBackground(new Color(247, 248, 252));
		btnDuLieuSanPham.setFont(new Font("Arial", Font.PLAIN, 17));
		btnDuLieuSanPham.setText("Dữ liệu sản phẩm");
		btnDuLieuSanPham.setBorder(null);
		btnDuLieuSanPham.setHorizontalAlignment(SwingConstants.CENTER);   
		btnDuLieuSanPham.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnDuLieuSanPham.setHorizontalTextPosition(SwingConstants.CENTER);
		ImageIcon icon8 = new ImageIcon(this.getClass().getResource("/database.png"));
		Image newimg8 = icon8.getImage().getScaledInstance(45,45, java.awt.Image.SCALE_SMOOTH);
		icon8 = new ImageIcon(newimg8);
		btnDuLieuSanPham.setIcon(icon8);
		pnMain.add(btnDuLieuSanPham);
		
		JPanel panel_DonHangDaBan = new JPanel();
		panel_DonHangDaBan.setBackground(Color.WHITE);
		panel_DonHangDaBan.setBounds(63, 553, 200, 121);
		pnMain.add(panel_DonHangDaBan);
		panel_DonHangDaBan.setLayout(null);
		
		JLabel lblDonHangDaBan = new JLabel("Đơn hàng đã bán");
		lblDonHangDaBan.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDonHangDaBan.setBounds(0, 18, 200, 37);
		panel_DonHangDaBan.add(lblDonHangDaBan);
		lblDonHangDaBan.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtfDonHangDaBan = new JTextField();
		txtfDonHangDaBan.setHorizontalAlignment(SwingConstants.CENTER);
		txtfDonHangDaBan.setText("12");
		txtfDonHangDaBan.setFont(new Font("Arial", Font.PLAIN, 22));
		txtfDonHangDaBan.setBounds(0, 66, 200, 54);
		panel_DonHangDaBan.add(txtfDonHangDaBan);
		txtfDonHangDaBan.setBackground(Color.WHITE);
		txtfDonHangDaBan.setEditable(false);
		txtfDonHangDaBan.setColumns(10);
		
		JPanel panel_DonHangDaMua = new JPanel();
		panel_DonHangDaMua.setLayout(null);
		panel_DonHangDaMua.setBackground(Color.WHITE);
		panel_DonHangDaMua.setBounds(297, 553, 200, 121);
		pnMain.add(panel_DonHangDaMua);
		
		JLabel lblDonHangDaMua = new JLabel("Đơn hàng đã mua");
		lblDonHangDaMua.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDonHangDaMua.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblDonHangDaMua.setHorizontalAlignment(SwingConstants.CENTER);
		lblDonHangDaMua.setBounds(0, 18, 200, 37);
		panel_DonHangDaMua.add(lblDonHangDaMua);
		
		txtfDonHangDaMua = new JTextField();
		txtfDonHangDaMua.setHorizontalAlignment(SwingConstants.CENTER);
		txtfDonHangDaMua.setText("12");
		txtfDonHangDaMua.setFont(new Font("Arial", Font.PLAIN, 22));
		txtfDonHangDaMua.setEditable(false);
		txtfDonHangDaMua.setColumns(10);
		txtfDonHangDaMua.setBackground(Color.WHITE);
		txtfDonHangDaMua.setBounds(0, 66, 200, 54);
		panel_DonHangDaMua.add(txtfDonHangDaMua);
		
		JPanel panel_DonHangSuaChua = new JPanel();
		panel_DonHangSuaChua.setLayout(null);
		panel_DonHangSuaChua.setBackground(Color.WHITE);
		panel_DonHangSuaChua.setBounds(531, 553, 200, 121);
		pnMain.add(panel_DonHangSuaChua);
		
		JLabel lblDonHangSuaChua = new JLabel("Đơn hàng sửa chữa");
		lblDonHangSuaChua.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDonHangSuaChua.setHorizontalAlignment(SwingConstants.CENTER);
		lblDonHangSuaChua.setBounds(0, 18, 200, 37);
		panel_DonHangSuaChua.add(lblDonHangSuaChua);
		
		txtfDonHangSuaChua = new JTextField();
		txtfDonHangSuaChua.setHorizontalAlignment(SwingConstants.CENTER);
		txtfDonHangSuaChua.setText("12");
		txtfDonHangSuaChua.setFont(new Font("Arial", Font.PLAIN, 22));
		txtfDonHangSuaChua.setEditable(false);
		txtfDonHangSuaChua.setColumns(10);
		txtfDonHangSuaChua.setBackground(Color.WHITE);
		txtfDonHangSuaChua.setBounds(0, 66, 200, 54);
		panel_DonHangSuaChua.add(txtfDonHangSuaChua);
		
		JPanel panel_DoanhThu = new JPanel();
		panel_DoanhThu.setLayout(null);
		panel_DoanhThu.setBackground(Color.WHITE);
		panel_DoanhThu.setBounds(765, 551, 200, 121);
		pnMain.add(panel_DoanhThu);
		
		JLabel lblDoanhThu = new JLabel("Doanh thu");
		lblDoanhThu.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDoanhThu.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoanhThu.setBounds(0, 18, 200, 37);
		panel_DoanhThu.add(lblDoanhThu);
		
		txtfDoanhThu = new JTextField();
		txtfDoanhThu.setHorizontalAlignment(SwingConstants.CENTER);
		txtfDoanhThu.setText("12");
		txtfDoanhThu.setFont(new Font("Arial", Font.PLAIN, 22));
		txtfDoanhThu.setEditable(false);
		txtfDoanhThu.setColumns(10);
		txtfDoanhThu.setBackground(Color.WHITE);
		txtfDoanhThu.setBounds(0, 66, 200, 54);
		panel_DoanhThu.add(txtfDoanhThu);
		
		lblDisplayName = new JLabel();
		lblDisplayName.setBounds(580, 120, 230, 31);
		lblDisplayName.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		pnMain.add(lblDisplayName);
		
	}
	
	private void HienThiTenTaiKhoan(USERSDTO UserLogin) {
		lblDisplayName.setText(UserLogin.getUSER_DisplayName().toString());
		
	}
	private void PhanQuyenTaiKhoan(USERSDTO UserLogin) {
		if(UserLogin.getUSER_idRole() == 2) {
			btnQuanLyNhanVien.setEnabled(false);
			btnDoanhThu.setEnabled(false);
			btnCaiDat.setEnabled(false);
		}
	}
	

}

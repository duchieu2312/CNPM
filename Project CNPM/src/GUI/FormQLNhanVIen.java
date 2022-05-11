package GUI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import DTO.USERSDTO;

public class FormQLNhanVIen {

	protected JFrame Frame;
	private JTextField txtSearch;
	private JTable table;
	private static USERSDTO userlogin;
	private JButton btnQuanLyNhanVien, btnDoanhThu,btnCaiDat;

	public static void main(String[] args) {
		FormQLNhanVIen frm = new FormQLNhanVIen(userlogin);
		frm.Frame.setVisible(true);
	}
	
	public FormQLNhanVIen(USERSDTO UserLogin) {
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
		btnQuanLyKhachHang.setFocusable(false);
		btnQuanLyKhachHang.setOpaque(true);
		btnQuanLyKhachHang.addMouseListener(new MouseAdapter() {
			 public void mouseEntered(MouseEvent evt) 
	         {
				btnQuanLyKhachHang.setFont(new Font("Arial", Font.PLAIN, 22));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/4. activecontacts.png"));
				Image newimg = icon.getImage().getScaledInstance(35,35, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnQuanLyKhachHang.setIcon(icon);
	         }
	         public void mouseExited(MouseEvent evt) 
	         {
	        	btnQuanLyKhachHang.setFont(new Font("Arial", Font.PLAIN, 19));
				ImageIcon icon = new ImageIcon(this.getClass().getResource("/4. activecontacts.png"));
				Image newimg = icon.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
				icon = new ImageIcon(newimg);
				btnQuanLyKhachHang.setIcon(icon);
	         }
		});
		btnQuanLyKhachHang.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnQuanLyKhachHang.setHorizontalAlignment(SwingConstants.LEFT);
		btnQuanLyKhachHang.setFont(new Font("Arial", Font.PLAIN, 21));
		btnQuanLyKhachHang.setForeground(new Color(255, 250, 250));
		btnQuanLyKhachHang.setBackground(new Color(89, 134, 151));
		btnQuanLyKhachHang.setBorder(new EmptyBorder(0, 16, 0, 0));
		btnQuanLyKhachHang.setBounds(0, 426, 272, 55);
		ImageIcon iconQLKH = new ImageIcon(this.getClass().getResource("/4. activecontacts.png"));
		Image newimgQLKH = iconQLKH.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		iconQLKH = new ImageIcon(newimgQLKH);
		btnQuanLyKhachHang.setIcon(iconQLKH);
		pnSideMenu.add(btnQuanLyKhachHang);
		
		JButton btnQuanLyNhanVien = new JButton("Quản lý nhân viên");
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
		
		JButton btnCaiDat = new JButton("Cài đặt phân quyền");
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
		
		JButton btnDoanhThu = new JButton("Doanh thu");
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
		

	}
	private void PhanQuyenTaiKhoan(USERSDTO UserLogin) {
		if(UserLogin.getUSER_idRole() == 2) {
			btnQuanLyNhanVien.setEnabled(false);
			btnDoanhThu.setEnabled(false);
			btnCaiDat.setEnabled(false);
		}
	}

}
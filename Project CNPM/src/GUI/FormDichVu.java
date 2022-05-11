package GUI;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.JTable;

public class FormDichVu {

	protected JFrame Frame;
	private JTextField txtfDonGia;
	private JTextField txtfTenSanPham;
	private JTextField txtfGiaMuaVao;
	private JTextField textField_1;
	private JTextField txtfTinhTrangMay;
	private JTextField txtfGiaSua;
	private JTextField txtfNgayHen;
	private JTable tableDanhSachSanPham;

	public FormDichVu() {
		initCompoment();
	}
	public void initCompoment() {
		Frame = new JFrame();
		Frame.getContentPane().setBackground(new Color(247, 248, 252));
		Frame.setBackground(new Color(247, 248, 252));
		Frame.setTitle("Trang ch\u1EE7");
		Frame.setUndecorated(true);
		Frame.setSize(1280,800);
		Frame.setLocationRelativeTo(null);
		Frame.getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(71, 121, 140));
		panel.setBounds(0, 0, 272, 800);
		Frame.getContentPane().add(panel);
		
		JLabel lblQuanLyCuaHang = new JLabel("Quản lý cửa hàng");
		lblQuanLyCuaHang.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuanLyCuaHang.setForeground(new Color(255, 250, 250));
		lblQuanLyCuaHang.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblQuanLyCuaHang.setBounds(0, 124, 272, 55);
		panel.add(lblQuanLyCuaHang);
		
		JButton btnTongQuan = new JButton("Tổng Quan");
		btnTongQuan.setOpaque(true);
		btnTongQuan.setHorizontalAlignment(SwingConstants.LEFT);
		btnTongQuan.setForeground(new Color(255, 250, 250));
		btnTongQuan.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnTongQuan.setFocusable(false);
		btnTongQuan.setBorder(null);
		btnTongQuan.setBackground(new Color(89, 134, 151));
		btnTongQuan.setBounds(0, 228, 272, 55);
		panel.add(btnTongQuan);
		
		JButton btnTaoMoi = new JButton("Tạo mới");
		btnTaoMoi.setOpaque(true);
		btnTaoMoi.setHorizontalAlignment(SwingConstants.LEFT);
		btnTaoMoi.setForeground(new Color(255, 250, 250));
		btnTaoMoi.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnTaoMoi.setFocusable(false);
		btnTaoMoi.setBorder(null);
		btnTaoMoi.setBackground(new Color(71, 121, 140));
		btnTaoMoi.setBounds(0, 294, 272, 55);
		panel.add(btnTaoMoi);
		
		JButton btnThongBao = new JButton("Thông báo");
		btnThongBao.setOpaque(true);
		btnThongBao.setHorizontalAlignment(SwingConstants.LEFT);
		btnThongBao.setForeground(new Color(255, 250, 250));
		btnThongBao.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnThongBao.setFocusable(false);
		btnThongBao.setBorder(null);
		btnThongBao.setBackground(new Color(71, 121, 140));
		btnThongBao.setBounds(0, 360, 272, 55);
		panel.add(btnThongBao);
		
		JButton btnQuanLyKhachHang = new JButton("Quản lý khách hàng");
		btnQuanLyKhachHang.setOpaque(true);
		btnQuanLyKhachHang.setHorizontalAlignment(SwingConstants.LEFT);
		btnQuanLyKhachHang.setForeground(new Color(255, 250, 250));
		btnQuanLyKhachHang.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnQuanLyKhachHang.setFocusable(false);
		btnQuanLyKhachHang.setBorder(null);
		btnQuanLyKhachHang.setBackground(new Color(71, 121, 140));
		btnQuanLyKhachHang.setBounds(0, 426, 272, 55);
		panel.add(btnQuanLyKhachHang);
		
		JButton btnQuanLyNhanVien = new JButton("Quản lý nhân viên");
		btnQuanLyNhanVien.setOpaque(true);
		btnQuanLyNhanVien.setHorizontalAlignment(SwingConstants.LEFT);
		btnQuanLyNhanVien.setForeground(new Color(255, 250, 250));
		btnQuanLyNhanVien.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnQuanLyNhanVien.setFocusable(false);
		btnQuanLyNhanVien.setBorder(null);
		btnQuanLyNhanVien.setBackground(new Color(71, 121, 140));
		btnQuanLyNhanVien.setBounds(0, 492, 272, 55);
		panel.add(btnQuanLyNhanVien);
		
		JButton btnCaiDat = new JButton("Cài đặt phân quyền");
		btnCaiDat.setOpaque(true);
		btnCaiDat.setHorizontalAlignment(SwingConstants.LEFT);
		btnCaiDat.setForeground(new Color(255, 250, 250));
		btnCaiDat.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnCaiDat.setFocusable(false);
		btnCaiDat.setBorder(null);
		btnCaiDat.setBackground(new Color(71, 121, 140));
		btnCaiDat.setBounds(0, 558, 272, 55);
		panel.add(btnCaiDat);
		
		JButton btnDoanhThu = new JButton("Doanh Thu");
		btnDoanhThu.setOpaque(true);
		btnDoanhThu.setHorizontalAlignment(SwingConstants.LEFT);
		btnDoanhThu.setForeground(new Color(255, 250, 250));
		btnDoanhThu.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnDoanhThu.setFocusable(false);
		btnDoanhThu.setBorder(null);
		btnDoanhThu.setBackground(new Color(71, 121, 140));
		btnDoanhThu.setBounds(0, 624, 272, 55);
		panel.add(btnDoanhThu);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(326, 135, 353, 64);
		panel_1.setBackground(new Color(71,121,140));
		Frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblThongTinKhachHang = new JLabel("Th\u00F4ng tin kh\u00E1ch h\u00E0ng");
		lblThongTinKhachHang.setForeground(Color.WHITE);
		lblThongTinKhachHang.setFont(new Font("Arial", Font.PLAIN, 20));
		lblThongTinKhachHang.setBounds(10, 14, 193, 34);
		panel_1.add(lblThongTinKhachHang);
		
		JButton btnSua_ThongTinKhachHang = new JButton("Sửa");
		btnSua_ThongTinKhachHang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSua_ThongTinKhachHang.setOpaque(true);
		btnSua_ThongTinKhachHang.setHorizontalAlignment(SwingConstants.LEFT);
		btnSua_ThongTinKhachHang.setForeground(Color.WHITE);
		btnSua_ThongTinKhachHang.setFont(new Font("Arial", Font.PLAIN, 20));
		btnSua_ThongTinKhachHang.setFocusable(false);
		btnSua_ThongTinKhachHang.setBorder(null);
		ImageIcon icon8 = new ImageIcon(this.getClass().getResource("/NotePencil.png"));
		Image newimg8 = icon8.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		icon8 = new ImageIcon(newimg8);
		btnSua_ThongTinKhachHang.setIcon(icon8);
		btnSua_ThongTinKhachHang.setBackground(new Color(71, 121, 140));
		btnSua_ThongTinKhachHang.setBounds(254, 14, 89, 39);
		panel_1.add(btnSua_ThongTinKhachHang);
		
		JPanel panelThongtinKhachHang = new JPanel();
		panelThongtinKhachHang.setBounds(326, 210, 353, 583);
		Frame.getContentPane().add(panelThongtinKhachHang);
		panelThongtinKhachHang.setLayout(null);
		
		JPanel panelTenKhachHang = new JPanel();
		panelTenKhachHang.setBounds(0, 0, 353, 64);
		panelTenKhachHang.setBackground(new Color(236,244,251));
		panelThongtinKhachHang.add(panelTenKhachHang);
		panelTenKhachHang.setLayout(null);
		
		JLabel lblTagTenKhachHang = new JLabel("T\u00EAn kh\u00E1ch h\u00E0ng:");
		lblTagTenKhachHang.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTagTenKhachHang.setBounds(10, 11, 111, 31);
		panelTenKhachHang.add(lblTagTenKhachHang);
		
		JLabel lblTenKhachHang = new JLabel("New label");
		lblTenKhachHang.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTenKhachHang.setBounds(131, 11, 136, 31);
		panelTenKhachHang.add(lblTenKhachHang);
		
		JPanel panelMaKhachHang = new JPanel();
		panelMaKhachHang.setBounds(0, 61, 353, 64);
		panelMaKhachHang.setBackground(new Color(186,222,255));
		panelThongtinKhachHang.add(panelMaKhachHang);
		panelMaKhachHang.setLayout(null);
		
		JLabel lblTagMaKhachHang = new JLabel("M\u00E3 kh\u00E1ch h\u00E0ng:");
		lblTagMaKhachHang.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTagMaKhachHang.setBounds(10, 11, 106, 31);
		panelMaKhachHang.add(lblTagMaKhachHang);
		
		JLabel lblMaKhachHang = new JLabel("New label");
		lblMaKhachHang.setFont(new Font("Arial", Font.PLAIN, 15));
		lblMaKhachHang.setBounds(126, 11, 136, 31);
		panelMaKhachHang.add(lblMaKhachHang);
		
		JPanel panelNgaySinh = new JPanel();
		panelNgaySinh.setLayout(null);
		panelNgaySinh.setBackground(new Color(236, 244, 251));
		panelNgaySinh.setBounds(0, 123, 353, 64);
		panelThongtinKhachHang.add(panelNgaySinh);
		
		JLabel lblTagNgaySinh = new JLabel("Ng\u00E0y sinh:");
		lblTagNgaySinh.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTagNgaySinh.setBounds(10, 11, 71, 31);
		panelNgaySinh.add(lblTagNgaySinh);
		
		JLabel lblNgaySinh = new JLabel("New label");
		lblNgaySinh.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNgaySinh.setBounds(91, 11, 136, 31);
		panelNgaySinh.add(lblNgaySinh);
		
		JPanel panelSDTKhachHang = new JPanel();
		panelSDTKhachHang.setLayout(null);
		panelSDTKhachHang.setBackground(new Color(186, 222, 255));
		panelSDTKhachHang.setBounds(0, 186, 353, 64);
		panelThongtinKhachHang.add(panelSDTKhachHang);
		
		JLabel lblTagSDTKhachHang = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i KH:");
		lblTagSDTKhachHang.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTagSDTKhachHang.setBounds(10, 11, 117, 31);
		panelSDTKhachHang.add(lblTagSDTKhachHang);
		
		JLabel lblSDTKhachHang = new JLabel("New label");
		lblSDTKhachHang.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSDTKhachHang.setBounds(137, 11, 136, 31);
		panelSDTKhachHang.add(lblSDTKhachHang);
		
		JPanel panelGioiTinh = new JPanel();
		panelGioiTinh.setLayout(null);
		panelGioiTinh.setBackground(new Color(186, 222, 255));
		panelGioiTinh.setBounds(0, 324, 353, 64);
		panelThongtinKhachHang.add(panelGioiTinh);
		
		JLabel lblTagGioiTinh = new JLabel("Gi\u1EDBi t\u00EDnh");
		lblTagGioiTinh.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTagGioiTinh.setBounds(10, 11, 57, 31);
		panelGioiTinh.add(lblTagGioiTinh);
		
		JLabel lblGioiTinh = new JLabel("New label");
		lblGioiTinh.setFont(new Font("Arial", Font.PLAIN, 15));
		lblGioiTinh.setBounds(77, 11, 136, 31);
		panelGioiTinh.add(lblGioiTinh);
		
		JPanel panelDiaChi = new JPanel();
		panelDiaChi.setLayout(null);
		panelDiaChi.setBackground(new Color(236, 244, 251));
		panelDiaChi.setBounds(0, 249, 353, 76);
		panelThongtinKhachHang.add(panelDiaChi);
		
		JLabel lblTagDiaChi = new JLabel("Địa chỉ:");
		lblTagDiaChi.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTagDiaChi.setBounds(10, 11, 56, 31);
		panelDiaChi.add(lblTagDiaChi);
		
		JLabel lblDiaChi = new JLabel("New label");
		lblDiaChi.setFont(new Font("Arial", Font.PLAIN, 15));
		lblDiaChi.setBounds(76, 11, 136, 31);
		panelDiaChi.add(lblDiaChi);
		
		JPanel panelGioiTinh_1 = new JPanel();
		panelGioiTinh_1.setLayout(null);
		panelGioiTinh_1.setBackground(new Color(186, 222, 255));
		panelGioiTinh_1.setBounds(0, 453, 353, 64);
		panelThongtinKhachHang.add(panelGioiTinh_1);
		
		JLabel lblTagDiaChiNgoaiNuoc = new JLabel("Địa chỉ ngoài nước:");
		lblTagDiaChiNgoaiNuoc.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTagDiaChiNgoaiNuoc.setBounds(10, 11, 140, 31);
		panelGioiTinh_1.add(lblTagDiaChiNgoaiNuoc);
		
		JLabel lblDiaChiNgoaiNuoc = new JLabel("New label");
		lblDiaChiNgoaiNuoc.setFont(new Font("Arial", Font.PLAIN, 15));
		lblDiaChiNgoaiNuoc.setBounds(160, 11, 183, 31);
		panelGioiTinh_1.add(lblDiaChiNgoaiNuoc);
		
		JPanel panelNgaySinh_1_1 = new JPanel();
		panelNgaySinh_1_1.setLayout(null);
		panelNgaySinh_1_1.setBackground(new Color(236, 244, 251));
		panelNgaySinh_1_1.setBounds(0, 516, 353, 64);
		panelThongtinKhachHang.add(panelNgaySinh_1_1);
		
		JLabel lblTagGhiChu = new JLabel("Ghi chú:");
		lblTagGhiChu.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTagGhiChu.setBounds(10, 11, 66, 31);
		panelNgaySinh_1_1.add(lblTagGhiChu);
		
		JLabel lblThongTinKhachHang_GhiChu = new JLabel("New label");
		lblThongTinKhachHang_GhiChu.setFont(new Font("Arial", Font.PLAIN, 15));
		lblThongTinKhachHang_GhiChu.setBounds(86, 11, 136, 31);
		panelNgaySinh_1_1.add(lblThongTinKhachHang_GhiChu);
		
		JPanel panelNgaySinh_1 = new JPanel();
		panelNgaySinh_1.setBounds(0, 389, 353, 64);
		panelThongtinKhachHang.add(panelNgaySinh_1);
		panelNgaySinh_1.setLayout(null);
		panelNgaySinh_1.setBackground(new Color(236, 244, 251));
		
		JLabel lblTagEmail = new JLabel("Ng\u00E0y sinh:");
		lblTagEmail.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTagEmail.setBounds(10, 11, 71, 31);
		panelNgaySinh_1.add(lblTagEmail);
		
		JLabel lblEmail = new JLabel("New label");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 15));
		lblEmail.setBounds(91, 11, 136, 31);
		panelNgaySinh_1.add(lblEmail);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(726, 111, 506, 506);
		Frame.getContentPane().add(tabbedPane);
		
		JPanel panelBanSanPham = new JPanel();
		tabbedPane.addTab("Bán sản phẩm", null, panelBanSanPham, null);
		panelBanSanPham.setLayout(null);
		
		JPanel panelTagBanSanPham = new JPanel();
		panelTagBanSanPham.setBounds(0, 0, 506, 64);
		panelBanSanPham.add(panelTagBanSanPham);
		panelTagBanSanPham.setLayout(null);
		panelTagBanSanPham.setBackground(new Color(71, 121, 140));
		
		
		JButton btnSua_BanSanPham = new JButton("Sửa");
		btnSua_BanSanPham.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSua_BanSanPham.setOpaque(true);
		btnSua_BanSanPham.setHorizontalAlignment(SwingConstants.LEFT);
		btnSua_BanSanPham.setForeground(Color.WHITE);
		btnSua_BanSanPham.setFont(new Font("Arial", Font.PLAIN, 20));
		ImageIcon icon3 = new ImageIcon(this.getClass().getResource("/NotePencil.png"));
		Image newimg3 = icon3.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		icon3 = new ImageIcon(newimg3);
		btnSua_BanSanPham.setIcon(icon3);
		btnSua_BanSanPham.setFocusable(false);
		btnSua_BanSanPham.setBorder(null);
		
		btnSua_BanSanPham.setBackground(new Color(71, 121, 140));
		btnSua_BanSanPham.setBounds(395, 11, 89, 39);
		panelTagBanSanPham.add(btnSua_BanSanPham);
		
		JCheckBox chckbxBanSanPham = new JCheckBox("Bán sản phẩm");
		chckbxBanSanPham.setFocusPainted(false);
		chckbxBanSanPham.setFocusable(false);
		chckbxBanSanPham.setPreferredSize(new Dimension(35, 35));
		chckbxBanSanPham.setMaximumSize(new Dimension(35, 35));
		chckbxBanSanPham.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxBanSanPham.setForeground(Color.WHITE);
		chckbxBanSanPham.setFont(new Font("Arial", Font.PLAIN, 20));
		chckbxBanSanPham.setBackground(new Color(71, 121, 140));
		chckbxBanSanPham.setBounds(10, 10, 247, 38);
		panelTagBanSanPham.add(chckbxBanSanPham);
		
		JPanel panelThongTinBanSanPham = new JPanel();
		panelThongTinBanSanPham.setFocusable(false);
		panelThongTinBanSanPham.setBounds(0, 64, 506, 415);
		panelBanSanPham.add(panelThongTinBanSanPham);
		panelThongTinBanSanPham.setBackground(Color.WHITE);
		panelThongTinBanSanPham.setLayout(null);
		
		JLabel lblTenSanPham = new JLabel("T\u00EAn s\u1EA3n ph\u1EA9m:");
		lblTenSanPham.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTenSanPham.setBounds(26, 35, 255, 25);
		panelThongTinBanSanPham.add(lblTenSanPham);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(26, 69, 257, 32);
		panelThongTinBanSanPham.add(comboBox);
		
		JLabel lblDonGia = new JLabel("\u0110\u01A1n gi\u00E1:");
		lblDonGia.setFont(new Font("Arial", Font.PLAIN, 15));
		lblDonGia.setBounds(26, 109, 255, 32);
		panelThongTinBanSanPham.add(lblDonGia);
		
		txtfDonGia = new JTextField();
		txtfDonGia.setFocusTraversalKeysEnabled(false);
		txtfDonGia.setFocusable(false);
		txtfDonGia.setEditable(false);
		txtfDonGia.setBounds(26, 157, 255, 32);
		panelThongTinBanSanPham.add(txtfDonGia);
		txtfDonGia.setColumns(10);
		
		JLabel lblHinhThucThanhToan = new JLabel("Ch\u1ECDn h\u00ECnh th\u1EE9c thanh to\u00E1n:");
		lblHinhThucThanhToan.setFont(new Font("Arial", Font.PLAIN, 15));
		lblHinhThucThanhToan.setBounds(26, 200, 403, 32);
		panelThongTinBanSanPham.add(lblHinhThucThanhToan);
		
		JRadioButton rdbtnTienMat = new JRadioButton("Ti\u1EC1n m\u1EB7t");
		rdbtnTienMat.setBackground(Color.WHITE);
		rdbtnTienMat.setFont(new Font("Arial", Font.PLAIN, 15));
		rdbtnTienMat.setBounds(36, 239, 119, 23);
		panelThongTinBanSanPham.add(rdbtnTienMat);
		
		JRadioButton rdbtnThanhToanKhiNhanHang = new JRadioButton("Thanh to\u00E1n khi nh\u1EADn h\u00E0ng");
		rdbtnThanhToanKhiNhanHang.setBackground(Color.WHITE);
		rdbtnThanhToanKhiNhanHang.setFont(new Font("Arial", Font.PLAIN, 15));
		rdbtnThanhToanKhiNhanHang.setBounds(195, 239, 225, 23);
		panelThongTinBanSanPham.add(rdbtnThanhToanKhiNhanHang);
		
		JLabel lblBanSanPham_SoLuong = new JLabel("Số lượng");
		lblBanSanPham_SoLuong.setHorizontalAlignment(SwingConstants.CENTER);
		lblBanSanPham_SoLuong.setFont(new Font("Arial", Font.PLAIN, 15));
		lblBanSanPham_SoLuong.setBounds(362, 35, 92, 24);
		panelThongTinBanSanPham.add(lblBanSanPham_SoLuong);
		
		JButton btnBanSanPham_GiamSoLuong = new JButton("");
		btnBanSanPham_GiamSoLuong.setFocusPainted(false);
		btnBanSanPham_GiamSoLuong.setFocusTraversalKeysEnabled(false);
		btnBanSanPham_GiamSoLuong.setFocusable(false);
		btnBanSanPham_GiamSoLuong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBanSanPham_GiamSoLuong.setBorder(new LineBorder(new Color(0, 0, 0)));
		ImageIcon icon4 = new ImageIcon(this.getClass().getResource("/arrow-down.png"));
		Image newimg4 = icon4.getImage().getScaledInstance(15,15, java.awt.Image.SCALE_SMOOTH);
		icon4 = new ImageIcon(newimg4);
		btnBanSanPham_GiamSoLuong.setIcon(icon4);
		btnBanSanPham_GiamSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnBanSanPham_GiamSoLuong.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBanSanPham_GiamSoLuong.setBackground(Color.WHITE);
		btnBanSanPham_GiamSoLuong.setBounds(356, 66, 39, 32);
		panelThongTinBanSanPham.add(btnBanSanPham_GiamSoLuong);
		
		JLabel lblBanSanPham_NumSoLuong = new JLabel("1");
		lblBanSanPham_NumSoLuong.setHorizontalAlignment(SwingConstants.CENTER);
		lblBanSanPham_NumSoLuong.setFont(new Font("Arial", Font.PLAIN, 15));
		lblBanSanPham_NumSoLuong.setBounds(394, 70, 26, 28);
		
		panelThongTinBanSanPham.add(lblBanSanPham_NumSoLuong);
		
		JButton btnBanSanPham_TangSoLuong = new JButton("");
		btnBanSanPham_TangSoLuong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBanSanPham_TangSoLuong.setFocusTraversalKeysEnabled(false);
		btnBanSanPham_TangSoLuong.setFocusPainted(false);
		btnBanSanPham_TangSoLuong.setBackground(Color.WHITE);
		btnBanSanPham_TangSoLuong.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnBanSanPham_TangSoLuong.setBounds(421, 66, 39, 32);
		btnBanSanPham_TangSoLuong.setOpaque(true);
		ImageIcon icon5 = new ImageIcon(this.getClass().getResource("/arrow-up.png"));
		Image newimg5 = icon5.getImage().getScaledInstance(15,15, java.awt.Image.SCALE_SMOOTH);
		icon5 = new ImageIcon(newimg5);
		btnBanSanPham_TangSoLuong.setIcon(icon5);
		btnBanSanPham_TangSoLuong.setHorizontalTextPosition(SwingConstants.CENTER);
		panelThongTinBanSanPham.add(btnBanSanPham_TangSoLuong);
		
		JButton btnThemSanPham = new JButton("Thêm");
		btnThemSanPham.setHorizontalTextPosition(SwingConstants.CENTER);
		btnThemSanPham.setFont(new Font("Arial", Font.PLAIN, 15));
		btnThemSanPham.setFocusable(false);
		btnThemSanPham.setFocusTraversalKeysEnabled(false);
		btnThemSanPham.setFocusPainted(false);
		btnThemSanPham.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnThemSanPham.setBackground(Color.WHITE);
		btnThemSanPham.setBounds(324, 157, 60, 32);
		panelThongTinBanSanPham.add(btnThemSanPham);
		
		JButton btnXoaSanPham = new JButton("Xoá");
		btnXoaSanPham.setHorizontalTextPosition(SwingConstants.CENTER);
		btnXoaSanPham.setFont(new Font("Arial", Font.PLAIN, 15));
		btnXoaSanPham.setFocusable(false);
		btnXoaSanPham.setFocusTraversalKeysEnabled(false);
		btnXoaSanPham.setFocusPainted(false);
		btnXoaSanPham.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnXoaSanPham.setBackground(Color.WHITE);
		btnXoaSanPham.setBounds(400, 157, 60, 32);
		panelThongTinBanSanPham.add(btnXoaSanPham);
		
		tableDanhSachSanPham = new JTable();
		tableDanhSachSanPham.setBounds(26, 308, 434, 107);
		panelThongTinBanSanPham.add(tableDanhSachSanPham);
		
		JLabel lblSanPhamDaChon = new JLabel("Sản phẩm đã chọn:");
		lblSanPhamDaChon.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSanPhamDaChon.setBounds(26, 270, 403, 32);
		panelThongTinBanSanPham.add(lblSanPhamDaChon);
		
		JPanel panelMuaSanPham = new JPanel();
		tabbedPane.addTab("Mua sản phẩm", null, panelMuaSanPham, null);
		panelMuaSanPham.setLayout(null);
		
		JPanel panelTagMuaSanPham = new JPanel();
		panelTagMuaSanPham.setLayout(null);
		panelTagMuaSanPham.setBackground(new Color(71, 121, 140));
		panelTagMuaSanPham.setBounds(0, 0, 506, 64);
		panelMuaSanPham.add(panelTagMuaSanPham);
		
		JButton btnSua_MuaSanPham = new JButton("Sửa");
		btnSua_MuaSanPham.setOpaque(true);
		btnSua_MuaSanPham.setHorizontalAlignment(SwingConstants.LEFT);
		btnSua_MuaSanPham.setForeground(Color.WHITE);
		btnSua_MuaSanPham.setFont(new Font("Arial", Font.PLAIN, 20));
		btnSua_MuaSanPham.setFocusable(false);
		ImageIcon icon2 = new ImageIcon(this.getClass().getResource("/NotePencil.png"));
		Image newimg2 = icon2.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		icon2 = new ImageIcon(newimg2);
		btnSua_MuaSanPham.setIcon(icon2);
		btnSua_MuaSanPham.setBorder(null);
		btnSua_MuaSanPham.setBackground(new Color(71, 121, 140));
		btnSua_MuaSanPham.setBounds(395, 11, 89, 39);
		panelTagMuaSanPham.add(btnSua_MuaSanPham);
		
		JCheckBox chckbxMuaSanPham = new JCheckBox("Mua sản phẩm");
		chckbxMuaSanPham.setFocusable(false);
		chckbxMuaSanPham.setFocusPainted(false);
		chckbxMuaSanPham.setPreferredSize(new Dimension(35, 35));
		chckbxMuaSanPham.setMaximumSize(new Dimension(35, 35));
		chckbxMuaSanPham.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxMuaSanPham.setForeground(Color.WHITE);
		chckbxMuaSanPham.setFont(new Font("Arial", Font.PLAIN, 20));
		chckbxMuaSanPham.setBackground(new Color(71, 121, 140));
		chckbxMuaSanPham.setBounds(10, 11, 247, 38);
		panelTagMuaSanPham.add(chckbxMuaSanPham);
		
		JPanel panelThongTinBanSanPham_1 = new JPanel();
		panelThongTinBanSanPham_1.setLayout(null);
		panelThongTinBanSanPham_1.setBackground(Color.WHITE);
		panelThongTinBanSanPham_1.setBounds(0, 63, 506, 415);
		panelMuaSanPham.add(panelThongTinBanSanPham_1);
		
		JLabel lblTenSanPhamMuaVao = new JLabel("Tên sản phẩm mua vào:");
		lblTenSanPhamMuaVao.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTenSanPhamMuaVao.setBounds(121, 10, 255, 32);
		panelThongTinBanSanPham_1.add(lblTenSanPhamMuaVao);
		
		JLabel lblCauHinhMay = new JLabel("Cấu hình máy:");
		lblCauHinhMay.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCauHinhMay.setBounds(121, 77, 255, 32);
		panelThongTinBanSanPham_1.add(lblCauHinhMay);
		
		JLabel lblGiaMuaVao = new JLabel("Giá thu mua:");
		lblGiaMuaVao.setFont(new Font("Arial", Font.PLAIN, 14));
		lblGiaMuaVao.setBounds(121, 217, 255, 25);
		panelThongTinBanSanPham_1.add(lblGiaMuaVao);
		
		txtfTenSanPham = new JTextField();
		txtfTenSanPham.setBounds(121, 42, 255, 32);
		panelThongTinBanSanPham_1.add(txtfTenSanPham);
		txtfTenSanPham.setColumns(10);
		
		JTextArea txtaCauHinhMay = new JTextArea();
		txtaCauHinhMay.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		txtaCauHinhMay.setBounds(121, 114, 255, 90);
		panelThongTinBanSanPham_1.add(txtaCauHinhMay);
		
		txtfGiaMuaVao = new JTextField();
		txtfGiaMuaVao.setBounds(121, 248, 255, 32);
		panelThongTinBanSanPham_1.add(txtfGiaMuaVao);
		txtfGiaMuaVao.setColumns(10);
		
		JLabel lblGhiChu = new JLabel("Ghi chú:");
		lblGhiChu.setFont(new Font("Arial", Font.PLAIN, 14));
		lblGhiChu.setBounds(121, 291, 255, 25);
		panelThongTinBanSanPham_1.add(lblGhiChu);
		
		JTextArea txtaGhiChu = new JTextArea();
		txtaGhiChu.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtaGhiChu.setBounds(121, 322, 255, 82);
		panelThongTinBanSanPham_1.add(txtaGhiChu);
		
		JPanel panelDichVu = new JPanel();
		tabbedPane.addTab("Dịch vụ và sửa chữa", null, panelDichVu, null);
		panelDichVu.setLayout(null);
		
		JPanel panelTagDichVuSuaChua = new JPanel();
		panelTagDichVuSuaChua.setLayout(null);
		panelTagDichVuSuaChua.setBackground(new Color(71, 121, 140));
		panelTagDichVuSuaChua.setBounds(0, 0, 506, 64);
		panelDichVu.add(panelTagDichVuSuaChua);
		
		JButton btnSua_DichVu = new JButton("Sửa");
		btnSua_DichVu.setFocusPainted(false);
		btnSua_DichVu.setFocusTraversalKeysEnabled(false);
		btnSua_DichVu.setFont(new Font("Arial", Font.PLAIN, 20));
		btnSua_DichVu.setForeground(Color.WHITE);
		btnSua_DichVu.setBackground(new Color(71,121,140));
		btnSua_DichVu.setHorizontalAlignment(SwingConstants.LEFT);
		btnSua_DichVu.setFocusable(false);
		btnSua_DichVu.setOpaque(true);
		ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/NotePencil.png"));
		Image newimg1 = icon1.getImage().getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH);
		icon1 = new ImageIcon(newimg1);
		btnSua_DichVu.setIcon(icon1);
		btnSua_DichVu.setBorder(null);
		btnSua_DichVu.setBounds(395, 11, 89, 39);
		panelTagDichVuSuaChua.add(btnSua_DichVu);
		
		JCheckBox chckbxDichVu = new JCheckBox("Dịch vụ và sửa chữa");
		chckbxDichVu.setFocusPainted(false);
		chckbxDichVu.setFocusable(false);
		chckbxDichVu.setForeground(Color.WHITE);
		chckbxDichVu.setFont(new Font("Arial", Font.PLAIN, 20));
		chckbxDichVu.setPreferredSize(new Dimension(35, 35));
		chckbxDichVu.setMaximumSize(new Dimension(35, 35));
		chckbxDichVu.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxDichVu.setBounds(16, 15, 247, 38);
		chckbxDichVu.setBackground(new Color(71,121,140));
		panelTagDichVuSuaChua.add(chckbxDichVu);
		
		JPanel panelDichVuVaSuaChua = new JPanel();
		panelDichVuVaSuaChua.setLayout(null);
		panelDichVuVaSuaChua.setBackground(Color.WHITE);
		panelDichVuVaSuaChua.setBounds(0, 63, 506, 415);
		panelDichVu.add(panelDichVuVaSuaChua);
		
		JLabel lblDichVu = new JLabel("Dịch vụ:");
		lblDichVu.setFont(new Font("Arial", Font.PLAIN, 18));
		lblDichVu.setBounds(24, 11, 91, 25);
		panelDichVuVaSuaChua.add(lblDichVu);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(34, 125, 247, 32);
		panelDichVuVaSuaChua.add(comboBox_1);
		
		JLabel lblTnDchV = new JLabel("Tên dịch vụ:");
		lblTnDchV.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTnDchV.setBounds(34, 82, 247, 25);
		panelDichVuVaSuaChua.add(lblTnDchV);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(35, 276, 247, 32);
		panelDichVuVaSuaChua.add(textField_1);
		
		JLabel lblHinhThucThanhToan_1 = new JLabel("Sửa chữa:");
		lblHinhThucThanhToan_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblHinhThucThanhToan_1.setBounds(24, 216, 255, 25);
		panelDichVuVaSuaChua.add(lblHinhThucThanhToan_1);
		
		JLabel lblSoLuong_DichVu = new JLabel("Số lượng");
		lblSoLuong_DichVu.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoLuong_DichVu.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSoLuong_DichVu.setBounds(353, 94, 92, 24);
		panelDichVuVaSuaChua.add(lblSoLuong_DichVu);
		
		JLabel lblNumSoLuong_DichVu = new JLabel("1");
		lblNumSoLuong_DichVu.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumSoLuong_DichVu.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNumSoLuong_DichVu.setBounds(385, 129, 26, 28);
		panelDichVuVaSuaChua.add(lblNumSoLuong_DichVu);
		
		JButton btnGiamSoLuong_DichVu = new JButton("");
		btnGiamSoLuong_DichVu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGiamSoLuong_DichVu.setFocusPainted(false);
		btnGiamSoLuong_DichVu.setFocusTraversalKeysEnabled(false);
		btnGiamSoLuong_DichVu.setFocusable(false);

		ImageIcon icon6 = new ImageIcon(this.getClass().getResource("/arrow-down.png"));
		Image newimg6 = icon6.getImage().getScaledInstance(10,10, java.awt.Image.SCALE_SMOOTH);
		icon6 = new ImageIcon(newimg6);
		btnGiamSoLuong_DichVu.setIcon(icon6);
		btnGiamSoLuong_DichVu.setBackground(Color.WHITE);
		btnGiamSoLuong_DichVu.setBounds(353, 125, 33, 32);
		panelDichVuVaSuaChua.add(btnGiamSoLuong_DichVu);
		
		JButton btnTangSoLuong_DichVu = new JButton("");
		btnTangSoLuong_DichVu.setFocusPainted(false);
		btnTangSoLuong_DichVu.setFocusTraversalKeysEnabled(false);
		btnTangSoLuong_DichVu.setFocusable(false);
		ImageIcon icon7 = new ImageIcon(this.getClass().getResource("/arrow-up.png"));
		Image newimg7 = icon7.getImage().getScaledInstance(10,10, java.awt.Image.SCALE_SMOOTH);
		icon7 = new ImageIcon(newimg7);
		btnTangSoLuong_DichVu.setIcon(icon7);
		btnTangSoLuong_DichVu.setBackground(Color.WHITE);
		btnTangSoLuong_DichVu.setBounds(412, 125, 33, 32);
		panelDichVuVaSuaChua.add(btnTangSoLuong_DichVu);
		
		JCheckBox chckbxVeSinh = new JCheckBox("Vệ sinh toàn bộ máy tính (200.000đ).");
		chckbxVeSinh.setFocusPainted(false);
		chckbxVeSinh.setFocusable(false);
		chckbxVeSinh.setBackground(Color.WHITE);
		chckbxVeSinh.setFont(new Font("Arial", Font.PLAIN, 15));
		chckbxVeSinh.setBounds(34, 43, 273, 32);
		panelDichVuVaSuaChua.add(chckbxVeSinh);
		
		JLabel lblTenSanPhamSua = new JLabel("Tên sản phẩm cần sửa:");
		lblTenSanPhamSua.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTenSanPhamSua.setBounds(34, 246, 200, 28);
		panelDichVuVaSuaChua.add(lblTenSanPhamSua);
		
		JLabel lblTinhTrangMay = new JLabel("Tình trạng máy:");
		lblTinhTrangMay.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTinhTrangMay.setBounds(34, 313, 200, 28);
		panelDichVuVaSuaChua.add(lblTinhTrangMay);
		
		txtfTinhTrangMay = new JTextField();
		txtfTinhTrangMay.setColumns(10);
		txtfTinhTrangMay.setBounds(35, 348, 247, 32);
		panelDichVuVaSuaChua.add(txtfTinhTrangMay);
		
		JLabel lblGiaSua = new JLabel("Giá sửa (dự kiến):");
		lblGiaSua.setFont(new Font("Arial", Font.PLAIN, 15));
		lblGiaSua.setBounds(300, 246, 200, 28);
		panelDichVuVaSuaChua.add(lblGiaSua);
		
		txtfGiaSua = new JTextField();
		txtfGiaSua.setColumns(10);
		txtfGiaSua.setBounds(301, 276, 145, 32);
		panelDichVuVaSuaChua.add(txtfGiaSua);
		
		JLabel lblNgayHen = new JLabel("Ngày hẹn (dự kiến):");
		lblNgayHen.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNgayHen.setBounds(300, 313, 200, 28);
		panelDichVuVaSuaChua.add(lblNgayHen);
		
		txtfNgayHen = new JTextField();
		txtfNgayHen.setColumns(10);
		txtfNgayHen.setBounds(301, 348, 145, 32);
		panelDichVuVaSuaChua.add(txtfNgayHen);
		
		JButton btnXoa = new JButton("Xoá");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXoa.setHorizontalTextPosition(SwingConstants.CENTER);
		btnXoa.setFont(new Font("Arial", Font.PLAIN, 15));
		btnXoa.setFocusable(false);
		btnXoa.setFocusTraversalKeysEnabled(false);
		btnXoa.setFocusPainted(false);
		btnXoa.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnXoa.setBackground(Color.WHITE);
		btnXoa.setBounds(1004, 628, 109, 58);
		Frame.getContentPane().add(btnXoa);
		
		JButton btnXacNhan = new JButton("Xác nhận");
		btnXacNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXacNhan.setHorizontalTextPosition(SwingConstants.CENTER);
		btnXacNhan.setFont(new Font("Arial", Font.PLAIN, 15));
		btnXacNhan.setFocusable(false);
		btnXacNhan.setFocusTraversalKeysEnabled(false);
		btnXacNhan.setFocusPainted(false);
		btnXacNhan.setBorder(null);
		btnXacNhan.setBackground(new Color(71,121,140));
		btnXacNhan.setBounds(1123, 628, 109, 58);
		btnXacNhan.setForeground(Color.WHITE);
		Frame.getContentPane().add(btnXacNhan);
		
		
	}
	public static void main(String[] args) {
		FormDichVu DichVu = new FormDichVu();
		DichVu.Frame.setVisible(true);
	}
}

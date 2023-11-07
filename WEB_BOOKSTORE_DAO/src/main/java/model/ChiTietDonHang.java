package model;

public class ChiTietDonHang {
	private String maChiTietDonHang;
	private DonHang donHang;
	private SanPham sanpham;
	private int soLuong;
	private int giaBia;
	private int giamGia;
	private double vat;
	private double tongTien;
	public ChiTietDonHang() {
		// TODO Auto-generated constructor stub
	}
	public ChiTietDonHang(String maChiTietDonHang, DonHang donHang, SanPham sanpham, int soLuong, int giaBia,
			int giamGia, double vat, double tongTien) {
		super();
		this.maChiTietDonHang = maChiTietDonHang;
		this.donHang = donHang;
		this.sanpham = sanpham;
		this.soLuong = soLuong;
		this.giaBia = giaBia;
		this.giamGia = giamGia;
		this.vat = vat;
		this.tongTien = tongTien;
	}
	/**
	 * @return the maChiTietDonHang
	 */
	public String getMaChiTietDonHang() {
		return maChiTietDonHang;
	}
	/**
	 * @param maChiTietDonHang the maChiTietDonHang to set
	 */
	public void setMaChiTietDonHang(String maChiTietDonHang) {
		this.maChiTietDonHang = maChiTietDonHang;
	}
	/**
	 * @return the donHang
	 */
	public DonHang getDonHang() {
		return donHang;
	}
	/**
	 * @param donHang the donHang to set
	 */
	public void setDonHang(DonHang donHang) {
		this.donHang = donHang;
	}
	/**
	 * @return the sanpham
	 */
	public SanPham getSanpham() {
		return sanpham;
	}
	/**
	 * @param sanpham the sanpham to set
	 */
	public void setSanpham(SanPham sanpham) {
		this.sanpham = sanpham;
	}
	/**
	 * @return the soLuong
	 */
	public int getSoLuong() {
		return soLuong;
	}
	/**
	 * @param soLuong the soLuong to set
	 */
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	/**
	 * @return the giaBia
	 */
	public int getGiaBia() {
		return giaBia;
	}
	/**
	 * @param giaBia the giaBia to set
	 */
	public void setGiaBia(int giaBia) {
		this.giaBia = giaBia;
	}
	/**
	 * @return the giamGia
	 */
	public int getGiamGia() {
		return giamGia;
	}
	/**
	 * @param giamGia the giamGia to set
	 */
	public void setGiamGia(int giamGia) {
		this.giamGia = giamGia;
	}
	/**
	 * @return the vat
	 */
	public double getVat() {
		return vat;
	}
	/**
	 * @param vat the vat to set
	 */
	public void setVat(double vat) {
		this.vat = vat;
	}
	/**
	 * @return the tongTien
	 */
	public double getTongTien() {
		return tongTien;
	}
	/**
	 * @param tongTien the tongTien to set
	 */
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	
	
	
	
}

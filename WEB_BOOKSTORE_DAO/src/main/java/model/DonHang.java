package model;

import java.sql.Date;

public class DonHang {
	private String maKhachHang;
	private KhachHang khachHang;
	private String diaChiNguoiMua;
	private String diaChiNhanHang;
	private String trangThai;
	private String hinhThucThanhToan;
	private int soTienDaThanhToan;
	private int soTienConThieu;
	private Date ngayDatHang;
	private Date ngayGiaoHang;
	public DonHang() {
		// TODO Auto-generated constructor stub
	}
	public DonHang(String maKhachHang, KhachHang khachHang, String diaChiNguoiMua, String diaChiNhanHang,
			String trangThai, String hinhThucThanhToan, int soTienDaThanhToan, int soTienConThieu, Date ngayDatHang,
			Date ngayGiaoHang) {
		this.maKhachHang = maKhachHang;
		this.khachHang = khachHang;
		this.diaChiNguoiMua = diaChiNguoiMua;
		this.diaChiNhanHang = diaChiNhanHang;
		this.trangThai = trangThai;
		this.hinhThucThanhToan = hinhThucThanhToan;
		this.soTienDaThanhToan = soTienDaThanhToan;
		this.soTienConThieu = soTienConThieu;
		this.ngayDatHang = ngayDatHang;
		this.ngayGiaoHang = ngayGiaoHang;
	}
	public String getMaKhachHang() {
		return maKhachHang;
	}
	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public String getDiaChiNguoiMua() {
		return diaChiNguoiMua;
	}
	public void setDiaChiNguoiMua(String diaChiNguoiMua) {
		this.diaChiNguoiMua = diaChiNguoiMua;
	}
	public String getDiaChiNhanHang() {
		return diaChiNhanHang;
	}
	public void setDiaChiNhanHang(String diaChiNhanHang) {
		this.diaChiNhanHang = diaChiNhanHang;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public String getHinhThucThanhToan() {
		return hinhThucThanhToan;
	}
	public void setHinhThucThanhToan(String hinhThucThanhToan) {
		this.hinhThucThanhToan = hinhThucThanhToan;
	}
	public int getSoTienDaThanhToan() {
		return soTienDaThanhToan;
	}
	public void setSoTienDaThanhToan(int soTienDaThanhToan) {
		this.soTienDaThanhToan = soTienDaThanhToan;
	}
	public int getSoTienConThieu() {
		return soTienConThieu;
	}
	public void setSoTienConThieu(int soTienConThieu) {
		this.soTienConThieu = soTienConThieu;
	}
	public Date getNgayDatHang() {
		return ngayDatHang;
	}
	public void setNgayDatHang(Date ngayDatHang) {
		this.ngayDatHang = ngayDatHang;
	}
	public Date getNgayGiaoHang() {
		return ngayGiaoHang;
	}
	public void setNgayGiaoHang(Date ngayGiaoHang) {
		this.ngayGiaoHang = ngayGiaoHang;
	}
	
	

}

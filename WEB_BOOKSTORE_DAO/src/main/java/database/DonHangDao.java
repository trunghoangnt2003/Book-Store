package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.DonHang;
import model.KhachHang;
import model.TheLoai;

public class DonHangDao {
	public ArrayList<DonHang> selectAll() {
		ArrayList<DonHang> res = new ArrayList<DonHang>();
		try {
			Connection c = JDBC.getCon();
			String sql = "select * from donhang";
			PreparedStatement st = c.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				KhachHangDao khd = new KhachHangDao();
				String maKhachHang = rs.getString("maKhachHang");
				KhachHang khachHang = khd.selectById(new KhachHang(rs.getString("maKhachHang"), null,null, null, null, null, null, null, null, null, null, false));
				String diaChiNguoiMua = rs.getString("diaChiNguoiMua");
				String diaChiNhanHang = rs.getString("diaChiNhanHang");
				String trangThai = rs.getString("trangThai");
				String hinhThucThanhToan = rs.getString("hinhThucThanhToan");
				int soTienDaThanhToan = rs.getInt("soTienDaThanhToan");
				int soTienConThieu = rs.getInt("soTienConThieu");
				Date ngayDatHang = rs.getDate("ngayDatHang");
				Date ngayGiaoHang= rs.getDate("ngayGiaoHang");
				res.add(new DonHang(maKhachHang, khachHang, diaChiNguoiMua, diaChiNhanHang, trangThai, hinhThucThanhToan, soTienDaThanhToan, soTienConThieu, ngayDatHang, ngayGiaoHang));
			}
			JDBC.closeConnection(c);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return res;
	}
	public DonHang selectById(DonHang dh) {
		DonHang res = null;
		try {
			Connection c = JDBC.getCon();
			String sql = "select * from donhang where madonhang=?";
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, dh.getMaKhachHang());
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				KhachHangDao khd = new KhachHangDao();
				String maKhachHang = rs.getString("maKhachHang");
				KhachHang khachHang = khd.selectById(new KhachHang(rs.getString("maKhachHang"), null, null, null, null,null, null, null, null, null, null, false));
				String diaChiNguoiMua = rs.getString("diaChiNguoiMua");
				String diaChiNhanHang = rs.getString("diaChiNhanHang");
				String trangThai = rs.getString("trangThai");
				String hinhThucThanhToan = rs.getString("hinhThucThanhToan");
				int soTienDaThanhToan = rs.getInt("soTienDaThanhToan");
				int soTienConThieu = rs.getInt("soTienConThieu");
				Date ngayDatHang = rs.getDate("ngayDatHang");
				Date ngayGiaoHang= rs.getDate("ngayGiaoHang");
				res=(new DonHang(maKhachHang, khachHang, diaChiNguoiMua, diaChiNhanHang, trangThai, hinhThucThanhToan, soTienDaThanhToan, soTienConThieu, ngayDatHang, ngayGiaoHang));
			}
			JDBC.closeConnection(c);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return res;
	}
	public void insert(DonHang dh ) {
		try {
			Connection c = JDBC.getCon();
			String sql = "insert into donhang()"
						+"values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement st = c.prepareStatement(sql);
			
			st.setString(1, dh.getMaKhachHang());
			st.setString(2, dh.getKhachHang().getMaKhachHang());
			st.setString(3, dh.getDiaChiNguoiMua());			
			st.setString(4, dh.getDiaChiNhanHang());
			st.setString(5, dh.getTrangThai());
			st.setString(6, dh.getHinhThucThanhToan());
			st.setInt(7, dh.getSoTienDaThanhToan());
			st.setInt(8, dh.getSoTienConThieu());
			st.setDate(9, dh.getNgayDatHang());
			st.setDate(10, dh.getNgayGiaoHang());
			
			//Thuc thi
			
			st.executeUpdate();
			JDBC.closeConnection(c);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void delete(DonHang tl) {
		try {
			Connection c = JDBC.getCon();
			String sql = "delete from donhang where madonhang=?";
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, tl.getMaKhachHang());
			// Thuc thi
			st.executeUpdate();
			JDBC.closeConnection(c);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

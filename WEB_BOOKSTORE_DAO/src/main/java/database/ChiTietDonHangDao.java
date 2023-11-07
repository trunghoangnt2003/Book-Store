package database;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.ChiTietDonHang;
import model.DonHang;
import model.SanPham;

public class ChiTietDonHangDao {
	public void insert(ChiTietDonHang ctdh) {
		try {
			Connection c = JDBC.getCon();
			String sql = "insert into ChiTietDonHang(maChiTietDonHang,maDonHang,maSanPham,soLuong,giaBan,giamGia,vat,tongTien)"
						+"values(?,?,?,?,?,?,?,?)";
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, ctdh.getMaChiTietDonHang());
			st.setString(2, ctdh.getDonHang().getMaKhachHang());
			st.setString(3, ctdh.getSanpham().getMaSanPham());
			st.setInt(4, ctdh.getSoLuong());
			st.setInt(5, ctdh.getGiaBia());
			st.setInt(6, ctdh.getGiamGia());
			st.setDouble(7, ctdh.getVat());
			st.setDouble(8, ctdh.getTongTien());
			//Thuc thi
			st.executeUpdate();
			JDBC.closeConnection(c);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public ArrayList<ChiTietDonHang> selectAll(){
		ArrayList<ChiTietDonHang> res = new ArrayList<ChiTietDonHang>();
		
		try {
			Connection c = JDBC.getCon();
			String sql = "select * from chitietdonhang";
			PreparedStatement st = c.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				DonHangDao dhd = new DonHangDao();
				SanPhamDao spd = new SanPhamDao();
				String maChiTietDonHang = rs.getString("maChiTietDonHang");
				DonHang donHang = dhd.selectById(new DonHang(rs.getString("maChiTietDonHang"), null, null, null, null, null, 0, 0, null, null));
				SanPham sanpham = spd.selectById(new SanPham(rs.getString("maSanPham"), null, null, 0, 0, 0, 0, 0, null, null, null));
				int soLuong = rs.getInt("soLuong");
				int giaBia = rs.getInt("giaBia");
				int giamGia = rs.getInt("giamGia");
				double vat = rs.getDouble("vat");
				double tongTien = rs.getDouble("tongTien");
				res.add(new ChiTietDonHang(maChiTietDonHang, donHang, sanpham, soLuong, giaBia, giamGia, vat, tongTien));
			}
			JDBC.closeConnection(c);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return res;
	}
	public ChiTietDonHang selectById(ChiTietDonHang ctdh) {
		ChiTietDonHang res = null;
		
		try {
			Connection c = JDBC.getCon();
			String sql = "select * from chitietdonhang where maChiTietDonHang=?";
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, ctdh.getMaChiTietDonHang());
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				DonHangDao dhd = new DonHangDao();
				SanPhamDao spd = new SanPhamDao();
				String maChiTietDonHang = rs.getString("maChiTietDonHang");
				DonHang donHang = dhd.selectById(new DonHang(rs.getString("maChiTietDonHang"), null, null, null, null, null, 0, 0, null, null));
				SanPham sanpham = spd.selectById(new SanPham(rs.getString("maSanPham"), null, null, 0, 0, 0, 0, 0, null, null, null));
				int soLuong = rs.getInt("soLuong");
				int giaBia = rs.getInt("giaBia");
				int giamGia = rs.getInt("giamGia");
				double vat = rs.getDouble("vat");
				double tongTien = rs.getDouble("tongTien");
				res=(new ChiTietDonHang(maChiTietDonHang, donHang, sanpham, soLuong, giaBia, giamGia, vat, tongTien));
				break;
			}
			JDBC.closeConnection(c);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return res;
	}
	public void delete(ChiTietDonHang ctdh) {
		try {
			Connection c =JDBC.getCon();
			String sql = "delete form chitietdonhang where maChiTietDonHang=?";
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, ctdh.getMaChiTietDonHang());
			//Thuc thi
			st.executeUpdate();
			JDBC.closeConnection(c);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

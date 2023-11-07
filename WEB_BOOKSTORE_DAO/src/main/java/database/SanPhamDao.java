package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.KhachHang;
import model.SanPham;
import model.TacGia;
import model.TheLoai;

public class SanPhamDao {
	
	public void insert(SanPham sp) {
		try {
			Connection c = JDBC.getCon();
			String sql = "insert into sanpham(MaSanPham,TenSanPham,MaTacGia,NamXuatBan,GiaNhap,GiaGoc,GiaBan,SoLuong,NgonNgu,MoTa,MaTheLoai)"
						+"values(?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, sp.getMaSanPham());
			st.setString(2, sp.getTenSanPham());
			st.setString(3, sp.getTacGia().getMaTacGia());
			st.setInt(4, sp.getNamXuatBan());
			st.setInt(5, sp.getGiaNhap());
			st.setInt(6, sp.getGiaGoc());
			st.setInt(7, sp.getGiaBan());
			st.setInt(8, sp.getSoLuong());
			st.setString(9, sp.getNgonNgu());
			st.setString(10,sp.getMoTa());
			st.setString(11, sp.getTheLoai().getMaTheLoai());
			
			st.executeUpdate();
			JDBC.closeConnection(c);
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}
	public ArrayList<SanPham> selectAll(){
		ArrayList<SanPham> res = new ArrayList<SanPham>();
		try {
			Connection c = JDBC.getCon();
			String sql = "select * from sanpham";
			PreparedStatement st = c.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				TacGiaDao tgd = new TacGiaDao();
				TheLoaiDao tld = new TheLoaiDao();
				String maSanPham = rs.getString("maSanPham");
				String tenSanPham = rs.getString("tenSanPham");
				TacGia tacGia = tgd.selectById(new TacGia(rs.getString("maTacGia"), null, null, null));
				int namXuatBan = rs.getInt("namXuatBan");
				int giaNhap = rs.getInt("giaNhap");
				int giaGoc = rs.getInt("giaGoc");
				int giaBan = rs.getInt("giaBan");
				int soLuong = rs.getInt("soLuong");
				TheLoai theLoai = tld.selectById(new TheLoai(rs.getString("matheloai"), null));
				String ngonNgu = rs.getString("ngonNgu");
				String moTa = rs.getString("moTa");
				res.add(new SanPham(maSanPham, tenSanPham, tacGia, namXuatBan, giaNhap, giaGoc, giaBan, soLuong, theLoai, ngonNgu, moTa));
			}JDBC.closeConnection(c);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return res;
	}
	public SanPham selectById(SanPham sp) {
		SanPham res =null;
		try {
			Connection c = JDBC.getCon();
			String sql = "select * from sanpham where masanpham=?";
			PreparedStatement st = c.prepareStatement(sql);		
			st.setString(1,sp.getMaSanPham());
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				TacGiaDao tgd = new TacGiaDao();
				TheLoaiDao tld = new TheLoaiDao();
				String maSanPham = rs.getString("maSanPham");
				String tenSanPham = rs.getString("tenSanPham");
				TacGia tacGia = tgd.selectById(new TacGia(rs.getString("maTacGia"), null, null, null));
				int namXuatBan = rs.getInt("namXuatBan");
				int giaNhap = rs.getInt("giaNhap");
				int giaGoc = rs.getInt("giaGoc");
				int giaBan = rs.getInt("giaBan");
				int soLuong = rs.getInt("soLuong");
				TheLoai theLoai = tld.selectById(new TheLoai(rs.getString("matheloai"), null));
				String ngonNgu = rs.getString("ngonNgu");
				String moTa = rs.getString("moTa");
				res=new SanPham(maSanPham, tenSanPham, tacGia, namXuatBan, giaNhap, giaGoc, giaBan, soLuong, theLoai, ngonNgu, moTa);
				break;
			}
			JDBC.closeConnection(c);
		} catch (Exception e) {
			
		}
		return res;
	}
	public void delete(SanPham sp) {
		try {
			Connection c = JDBC.getCon();
			String sql = "delete from sanpham where masanpham=?";
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, sp.getMaSanPham());
			//
			st.executeUpdate();
			System.out.println("delete");
			JDBC.closeConnection(c);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}

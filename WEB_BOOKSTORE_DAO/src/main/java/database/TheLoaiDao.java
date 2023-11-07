package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.TacGia;
import model.TheLoai;

public class TheLoaiDao {
	
	
	public ArrayList<TheLoai> selectAll(){
		ArrayList<TheLoai> res = new ArrayList<TheLoai>();
		try {
			Connection c = JDBC.getCon();
			String sql ="select * from theloai";
			PreparedStatement st = c.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				String maTheLoai = rs.getString("matheloai");
 				String tenTheLoai =rs.getString("tenTheLoai");
 				res.add(new TheLoai(maTheLoai,tenTheLoai));
 				break;
			}JDBC.closeConnection(c);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return res;
	}
	public TheLoai selectById(TheLoai tl) {
		TheLoai res =null;
		try {
			Connection c = JDBC.getCon();
			String sql = "select * from theloai where matheloai=?";
			PreparedStatement st = c.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				String maTheLoai = rs.getString("matheloai");
 				String tenTheLoai =rs.getString("tenTheLoai");
 				res=(new TheLoai(maTheLoai,tenTheLoai));
 				break;
			}JDBC.closeConnection(c);
		}catch (Exception e) {
			// TODO: handle exception
		}
		return res;
	}
	public void insert(TheLoai tl) {
		try {
			Connection c = JDBC.getCon();
			String sql = "insert into theloai(matheloai,tentheloai)"
						+"values(?,?)";
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, tl.getMaTheLoai());
			st.setString(2, tl.getTenTheLoai());
			
			st.executeUpdate();
			JDBC.closeConnection(c);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void delete(TheLoai tl) {
		try {
			Connection c = JDBC.getCon();
			String sql = "delete from theloai where matheloai=?";
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, tl.getMaTheLoai());
			// Thuc thi
			st.executeUpdate();
			JDBC.closeConnection(c);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.TacGia;

public class TacGiaDao {
	
	
	public ArrayList<TacGia> selectAll(){
		ArrayList<TacGia> res = new ArrayList<TacGia>();
		try {
			Connection c = JDBC.getCon();
			String sql = "select * from tacgia";
			PreparedStatement st = c.prepareStatement(sql);		
			ResultSet set = st.executeQuery();
			while(set.next()) {
				String maTacGia = set.getString("matacgia");
				String hoVaTen = set.getString("hovaten");
				Date ngaySinh =  set.getDate("ngaySinh");
				String tieuSu = set.getString("tieusu");
				res.add(new TacGia(maTacGia, hoVaTen, ngaySinh, tieuSu));
			}
			JDBC.closeConnection(c);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return res;		
	}
	public TacGia selectById(TacGia t) {
		TacGia res =null;
		try {
			Connection c = JDBC.getCon();
			String sql = "select * from tacgia where matacgia=?";
			PreparedStatement st = c.prepareStatement(sql);		
			st.setString(1,t.getMaTacGia());
			ResultSet set = st.executeQuery();
			while(set.next()) {
				String maTacGia = set.getString("matacgia");
				String hoVaTen = set.getString("hovaten");
				Date ngaySinh =  set.getDate("ngaySinh");
				String tieuSu = set.getString("tieusu");
				res=new TacGia(maTacGia, hoVaTen, ngaySinh, tieuSu);
				break;
			}
			JDBC.closeConnection(c);
		} catch (Exception e) {
			
		}
		return res;
	}
	public void insert(TacGia tg) {
		try {
			Connection c = JDBC.getCon();
			String sql = "insert into tacgia(matacgia,hovaten,ngaysinh,tieusu) "
					+"values(?,?,?,?)";
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, tg.getMaTacGia());
			st.setString(2, tg.getHoVaTen());
			st.setDate(3, tg.getNgaySinh());
			st.setString(4, tg.getTieuSu());
			
			//Thuc thi
			st.executeUpdate();
			JDBC.closeConnection(c);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void insertAll(ArrayList<TacGia> list) {
		for(TacGia temp :list) {
			insert(temp);
		}
	}
	
	public void update(TacGia t ) {
		try {
			Connection c = JDBC.getCon();
			String sql = "update tacgia"+
						"SET"+
						"hovaten=?"+
						"ngaysinh=?"+
						"tieusu=?"+
						"where matacgia=?";
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, t.getHoVaTen());
			st.setDate(2, t.getNgaySinh());
			st.setString(3, t.getTieuSu());
		// Thuc thi
			st.executeUpdate();
			JDBC.closeConnection(c);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void delete(TacGia t) {
		try {
			Connection c = JDBC.getCon();
			String sql = "delete from tacgia where matacgia=?";
			PreparedStatement st = c.prepareStatement(sql);
			st.setString(1, t.getMaTacGia());
			// Thuc thi
			st.executeUpdate();
			JDBC.closeConnection(c);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

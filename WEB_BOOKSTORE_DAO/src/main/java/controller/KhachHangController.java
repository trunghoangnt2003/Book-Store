package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import database.KhachHangDao;
import model.KhachHang;
import units.MaHoa;

/**
 * Servlet implementation class KhachHang
 */
@WebServlet("/Khach-Hang")
public class KhachHangController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KhachHangController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String act = request.getParameter("act");
		if(act.equals("dang-nhap")) dangNhap(request, response);
		else if(act.equals("dang-xuat")) dangXuat(request, response);
		else if(act.equals("dang-ki")) dangKi(request, response);
		else if(act.equals("doi-mat-khau")) doiMatKhau(request, response);
		else if(act.equals("thay-doi-thong-tin")) thayDoiThongTin(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	private void dangNhap(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tenDangNhap = request.getParameter("tenDangNhap");
		String matKhau = request.getParameter("matKhau");
		matKhau = MaHoa.toSHA1(matKhau);
		KhachHang kh = new KhachHang();
		kh.setTenDangNhap(tenDangNhap);
		kh.setMatKhau(matKhau);
		
		KhachHangDao khd = new KhachHangDao();
		String url ="";
		KhachHang khachHang = khd.selectByIdAndPass(kh);
		if(khachHang!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("khachHang", khachHang);
			url = "/index.jsp";
		}else {
			request.setAttribute("baoLoi", "Tên đăng nhập hoặc mật khẩu không đúng");
			url = "/khachhang/dangnhap.jsp";				
		}
		RequestDispatcher rd  = getServletContext().getRequestDispatcher(url);
		
			rd.forward(request, response);
		
	}
	private void dangXuat(HttpServletRequest request, HttpServletResponse response) throws IOException {
			HttpSession session = request.getSession();
			session.invalidate();
		
			response.sendRedirect("index.jsp");
		}
	private void dangKi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tenDangNhap = request.getParameter("tenDangNhap");
		String gioiTinh = request.getParameter("gioiTinh");
		String matKhau = request.getParameter("matKhau");
		String matKhauNhapLai = request.getParameter("matKhauNhapLai");
		String hoVaTen = request.getParameter("hoVaTen");
		String diaChi = request.getParameter("diaChiKhachHang");
		String diaChiNhanHang = request.getParameter("diaChiNhanHang");
		String diaChiMuaHang = request.getParameter("diaChiMuaHang");
		String ngaySinh = request.getParameter("ngaySinh");
		String soDienThoai = request.getParameter("dienThoai");
		String email = request.getParameter("email");
		// set A
		request.setAttribute("tenDangNhap", tenDangNhap);
		request.setAttribute("gioiTinh", gioiTinh);
		request.setAttribute("ngaySinh", ngaySinh);
		request.setAttribute("diaChiKhachHang", diaChi);
		request.setAttribute("diaChiNhanHang", diaChiNhanHang);
		request.setAttribute("diaChiMuaHang", diaChiMuaHang);
		request.setAttribute("dienThoai", soDienThoai);
		request.setAttribute("email", email);
		
		
		
		String url=null;
		String msg = "";
		KhachHangDao khachHangDao = new KhachHangDao();
		if(khachHangDao.checkExits(tenDangNhap)) {
			msg+="Tên đăng nhập tồn tại !";
		}
		if(matKhau.equals(matKhauNhapLai)==false) {
			msg+="Mật khẩu không khớp";
		}else {
			matKhau = MaHoa.toSHA1(matKhau).substring(0, 19);
		}
		if(!msg.isEmpty()) {
			url = "/khachhang/dangki.jsp";
			request.setAttribute("baoLoi", msg);
		}else {
			String maKhachHang = (System.currentTimeMillis()+soDienThoai).substring(4, 8);
			KhachHang kh1 = new KhachHang(maKhachHang, tenDangNhap, matKhau, hoVaTen, gioiTinh, diaChi, diaChiNhanHang, diaChiMuaHang, Date.valueOf(ngaySinh), soDienThoai, email, true);
//			KhachHang kh = new KhachHang(maKhachHang, "Trung2003", "123", "Nguyen", "Nam", "hn", "hn", "hn", Date.valueOf("2000-02-06"), "0942532003", "trung@fpt", true);
			khachHangDao.insert(kh1);
			System.out.println(kh1.toString());
			url = "/khachhang/dangnhap.jsp";
		}
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}
	private void doiMatKhau (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String matKhauHienTai = request.getParameter("matKhauHienTai");
		String matKhauMoi = request.getParameter("matKhauMoi");
		String matKhauMoiNhapLai = request.getParameter("matKhauMoiXacNhan");
		
		String matKhauHienTaiSha1 = MaHoa.toSHA1(matKhauHienTai);
		
		String baoLoi="";
		String url="";
		HttpSession session = request.getSession();
		// Kiem tra mat khau cu 
		Object obj = session.getAttribute("khachHang");
		KhachHang khachHang = null;
		if(obj!=null){
			khachHang = (KhachHang) obj;
		}
		if(!matKhauHienTaiSha1.equals(khachHang.getMatKhau())) {
			baoLoi = "Mật khẩu hiện tại không chính xác!";
			url = "/khachhang/doimatkhau.jsp";
		}else {
			if(!matKhauMoi.equals(matKhauMoiNhapLai)) {
				baoLoi = "Mật khẩu nhập lại không khớp";
				url = "/khachhang/doimatkhau.jsp";
			}else { 
				String matKhauMoi_Sha1= MaHoa.toSHA1(matKhauMoi);
				KhachHangDao khachHangDao= new KhachHangDao();
				khachHang.setMatKhau(matKhauMoi_Sha1);
				if(khachHangDao.updatePass(khachHang)) {
					url="/index.jsp";
				}else {
					baoLoi = "Lỗi trong quá trình đổi";
					url = "/khachhang/doimatkhau.jsp";
				}
			}
		}
		request.setAttribute("baoLoi", baoLoi);
		RequestDispatcher rd  = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}
	private void thayDoiThongTin (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String hoVaTen = request.getParameter("hoVaTen");
		String gioiTinh = request.getParameter("gioiTinh");
		String ngaySinh = request.getParameter("ngaySinh");
		String diaChiKhachHang = request.getParameter("diaChiKhachHang");
		String diaChiMuaHang = request.getParameter("diaChiMuaHang");
		String diaChiNhanhang = request.getParameter("diaChiNhanHang");
		String dienThoai = request.getParameter("dienThoai");
		String email = request.getParameter("email");
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("khachHang");
		KhachHang khachHang =null;
		if(obj!=null) khachHang=(KhachHang)obj;
		
		String url="";
		String baoLoi="";
		KhachHangDao khachHangDao = new KhachHangDao();
		khachHang.setHoVaTen(hoVaTen);
		khachHang.setGioiTinh(gioiTinh);
		khachHang.setNgaySinh(Date.valueOf(ngaySinh));
		khachHang.setDiaChi(diaChiKhachHang);
		khachHang.setDiaChiMuaHang(diaChiMuaHang);
		khachHang.setDiaChiNhanHang(diaChiNhanhang);
		khachHang.setSoDienThoai(dienThoai);
		khachHang.setEmail(email);
		if(khachHangDao.update(khachHang)) {
			url="/index.jsp";
		}else {
			baoLoi = "Lỗi trong quá trình đổi";
			url = "/khachhang/thaydoitaikhoan.jsp";
		}
		request.setAttribute("baoLoi", baoLoi);
		RequestDispatcher rd  = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}
	

}

<%@page import="model.KhachHang"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đổi mật khẩu</title>
</head>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
		integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
		integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
		crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.min.js"
		integrity="sha384-Rx+T1VzGupg4BHQYs2gCW9It+akI2MM/mndMCy36UVfodzcJcF0GGLxZIzObiEfa"
		crossorigin="anonymous"></script>
	<script src="/docs/5.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
<!------ Include the above in your HEAD tag ---------->
<script type="text/javascript">
	function kiemTraMatKhau() {
		matKhau = document.getElementById("matKhauMoi").value;
		matKhauNhapLai = document.getElementById("matKhauMoiXacNhan").value;
		if(matKhau!=matKhauNhapLai){
			document.getElementById("msgMK").innerHTML = "Mật khẩu không khớp ! Vui lòng nhập lại";
			return false;
		}else {
			document.getElementById("msgMK").innerHTML = "";
			return true;
		}
	}
</script>
<%
	String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
		+ request.getContextPath();
%>
<jsp:include page="../header.jsp"></jsp:include>
<body>
	<%
		Object obj = session.getAttribute("khachHang");
		if(obj==null) {
			response.setStatus(response.SC_MOVED_TEMPORARILY);
			response.setHeader("Location", "index.jsp");
		}
	%>
	<%
		String baoLoi = request.getAttribute("baoLoi")+"";
		if(baoLoi.equals("null")) baoLoi="";
	
	%>
	<div class="text-center container">
		<h1>ĐỔI MẬT KHẨU</h1>
		<span style="color: red">
			<%= baoLoi %>
		</span>
		<form action="<%=url %>/Khach-Hang" method="post">
			<input type="hidden" name="act" value="doi-mat-khau">
			  <div class="mb-3 form-floating">
			    <input type="password" class="form-control" id="matKhauHienTai" name="matKhauHienTai">
			    <label for="floatingInput">Mật khẩu hiện tại</label>
			  </div>
			  <div class="mb-3 form-floating">
			    <input type="password" class="form-control" id="matKhauMoi" name="matKhauMoi">
			    <label for="floatingInput">Mật khẩu mới</label>
			  </div>
			  <div class="mb-3 form-floating">
			  <input type="password" class="form-control" id="matKhauMoiXacNhan" name="matKhauMoiXacNhan" onkeyup="kiemTraMatKhau()">
			    <label for="floatingInput">Xác nhận lại</label>  <span id="msgMK" style="color: red"></span>
			    
			  </div>
			  
			  <button type="submit" class="btn btn-primary">Thay đổi</button>
		</form>
	</div>
<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
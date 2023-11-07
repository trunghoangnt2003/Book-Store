<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width-device-width, initial-scale-1, shrink-to-fit=no">
<title>Đăng kí</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
	integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.min.js"
	integrity="sha384-Rx+T1VzGupg4BHQYs2gCW9It+akI2MM/mndMCy36UVfodzcJcF0GGLxZIzObiEfa"
	crossorigin="anonymous"></script>
<script src="/docs/5.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
	crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
	
<style type="text/css">
	#red {
		color:  red;
	}
</style>
</head>
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
	<jsp:include page="../header.jsp"></jsp:include>
	<div class="container mt-10">
	<%
String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
		+ request.getContextPath();
%>
		
		<div class="text-center mt-10"><h1 style="text-transform: uppercase;">Thay đổi thông tin khách hàng</h1></div>
		<form action="<%=url %>/Khach-Hang" method="post">
			<input type="hidden" name="act" value="thay-doi-thong-tin">
			<div class="row">
				<div class="col-md-6">
					<h3>Khách Hàng</h3>
					<div class="mb-3">
						<label for="hoVaTen" class="form-label">Họ và tên</label> <span id="red">*</span>
						<input type="text" class="form-control" id="hoVaTen" name="hoVaTen" required="required">
					</div>
					<div class="mb-3">
						<label for="gioiTinh" class="form-label">Giới tính</label> 
						<select class="form-control" id="gioiTinh" name="gioiTinh" required="required">
							<option></option>
							<option value="nam">Nam</option>
							<option value="nữ">Nữ</option>
						</select>
					</div>
					<div class="mb-3">
						<label for="ngaySinh" class="form-label">Ngày sinh</label> 
						<input type="date" class="form-control" id="ngaySinh" name="ngaySinh" required="required">
					</div>
				</div>
				<div class="col-md-6">
					<h3>Địa chỉ</h3>
					<div class="mb-3">
						<label for="diaChiKhachHang" class="form-label">Địa chỉ khách hàng</label> <span id="red">*</span>
						<input type="text" class="form-control" id="diaChiKhachHang" name="diaChiKhachHang" required="required">
					</div>
					<div class="mb-3">
						<label for="diaChiMuaHang" class="form-label">Địa chỉ mua hàng</label> 
						<input type="text" class="form-control" id="diaChiMuaHang" name="diaChiMuaHang">
					</div>
					<div class="mb-3">
						<label for="diaChiNhanHang" class="form-label">Địa chỉ nhận hàng</label> <span id="red">*</span>
						<input type="text" class="form-control" id="diaChiNhanHang" name="diaChiNhanHang">
					</div>
					<div class="mb-3">
						<label for="dienThoai" class="form-label">Số điện thoại</label> <span id="red">*</span> 
						<input type="tel" class="form-control" id="dienThoai" name="dienThoai" required="required">
					</div>
					<div class="mb-3">
						<label for="email" class="form-label">Email</label> 
						<input type="text" class="form-control" id="email" name="email" required="required">
					</div>			
					<!-- SUBMIT -->
			<button class="btn btn-primary form-control" type="submit" value="dangKi">Thay đổi</button>
				</div>
			</div>
		</form>
		<%@include file="../footer.jsp" %>
		</div>
	</div>
</body>
</html>
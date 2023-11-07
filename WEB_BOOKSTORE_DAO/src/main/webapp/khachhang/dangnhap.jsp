<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng nhập</title>
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
<%
String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
		+ request.getContextPath();
%>
<link href="<%=url%>/css/dangnhap.css" rel="stylesheet">
</head>
<body>
<body class="text-center">
    
<main class="form-signin">
  <form action="<%=url %>/Khach-Hang" method="post">
    <img class="mb-4" src="<%=url %>/img/T.png" alt="" width="200" height="200">
    <h1 class="h3 mb-3 fw-normal">ĐĂNG NHẬP</h1>
    <%
    	String baoLoi = request.getAttribute("baoLoi")+"";
    	if(baoLoi.equals("null")) baoLoi = "";
    %>
	<div class ="text-center"> <span style="color: red;"><%=baoLoi %></span></div>
    <div class="form-floating">
      <input type="text" class="form-control" id="tenDangNhap" name="tenDangNhap" required="required">
      <label for="floatingInput">Tên Đăng Nhập</label>
    </div>
    <div class="form-floating">
      <input type="password" class="form-control" id="matKhau" name="matKhau" required="required">
      <label for="floatingPassword">Mật Khẩu</label>
    </div>

    <div class="checkbox mb-3">
      <label>
        <input type="checkbox" value="remember-me"> Ghi Nhớ Tài Khoản
      </label>
    </div>
    <button class="w-100 btn btn-lg btn-primary" type="submit">Đăng nhập</button>
    <div style="margin: 20px"><a href="dangki.jsp" style="text-decoration: none;">Đăng kí tài khoản</a></div>
    <p class="mt-5 mb-3 text-muted">© 2023-2024</p>
    <input type="hidden" name="act" value="dang-nhap">
    <jsp:include page="../footer.jsp"></jsp:include>
  </form>
</main>



    
  

</body>
</body>
</html>
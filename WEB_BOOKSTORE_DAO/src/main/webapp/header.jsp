<!-- BAR -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@page import="model.KhachHang"%>
	<%
String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
		+ request.getContextPath();
%>
<header>
		<div class="px-3 py-2 text-bg-dark border-bottom">
			<div class="container">
				<div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
					<a href="<%=url%>/index.jsp"
						class="d-flex align-items-center my-2 my-lg-0 me-lg-auto text-white text-decoration-none">
					
              			 <img src="<%=url %>/img/T.png" height="28" alt="CoolBrand">
            		
					</a>

					<ul class="nav col-12 col-lg-auto my-2 justify-content-center my-md-0 text-small">
						<li>
							<a href="<%=url %>/index.jsp" class="nav-link text-secondary">
								<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
									class="bi bi-house-door-fill" viewBox="0 0 16 16">
									<path
										d="M6.5 14.5v-3.505c0-.245.25-.495.5-.495h2c.25 0 .5.25.5.5v3.5a.5.5 0 0 0 .5.5h4a.5.5 0 0 0 .5-.5v-7a.5.5 0 0 0-.146-.354L13 5.793V2.5a.5.5 0 0 0-.5-.5h-1a.5.5 0 0 0-.5.5v1.293L8.354 1.146a.5.5 0 0 0-.708 0l-6 6A.5.5 0 0 0 1.5 7.5v7a.5.5 0 0 0 .5.5h4a.5.5 0 0 0 .5-.5Z" />
								</svg>
								Home
							</a>
						</li>
						<li>
							<a href="#" class="nav-link text-white">
								<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
									class="bi bi-bookmarks" viewBox="0 0 16 16">
									<path
										d="M2 4a2 2 0 0 1 2-2h6a2 2 0 0 1 2 2v11.5a.5.5 0 0 1-.777.416L7 13.101l-4.223 2.815A.5.5 0 0 1 2 15.5V4zm2-1a1 1 0 0 0-1 1v10.566l3.723-2.482a.5.5 0 0 1 .554 0L11 14.566V4a1 1 0 0 0-1-1H4z" />
									<path
										d="M4.268 1H12a1 1 0 0 1 1 1v11.768l.223.148A.5.5 0 0 0 14 13.5V2a2 2 0 0 0-2-2H6a2 2 0 0 0-1.732 1z" />
								</svg>
								Love
							</a>
						</li>
						<li>
							<a href="#" class="nav-link text-white">
								<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
									class="bi bi-cart-dash-fill" viewBox="0 0 16 16">
									<path
										d="M.5 1a.5.5 0 0 0 0 1h1.11l.401 1.607 1.498 7.985A.5.5 0 0 0 4 12h1a2 2 0 1 0 0 4 2 2 0 0 0 0-4h7a2 2 0 1 0 0 4 2 2 0 0 0 0-4h1a.5.5 0 0 0 .491-.408l1.5-8A.5.5 0 0 0 14.5 3H2.89l-.405-1.621A.5.5 0 0 0 2 1H.5zM6 14a1 1 0 1 1-2 0 1 1 0 0 1 2 0zm7 0a1 1 0 1 1-2 0 1 1 0 0 1 2 0zM6.5 7h4a.5.5 0 0 1 0 1h-4a.5.5 0 0 1 0-1z" />
								</svg>
								Orders
							</a>
						</li>
						<li>
							<a href="#" class="nav-link text-white">
								<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
									class="bi bi-box-seam" viewBox="0 0 16 16">
									<path
										d="M8.186 1.113a.5.5 0 0 0-.372 0L1.846 3.5l2.404.961L10.404 2l-2.218-.887zm3.564 1.426L5.596 5 8 5.961 14.154 3.5l-2.404-.961zm3.25 1.7-6.5 2.6v7.922l6.5-2.6V4.24zM7.5 14.762V6.838L1 4.239v7.923l6.5 2.6zM7.443.184a1.5 1.5 0 0 1 1.114 0l7.129 2.852A.5.5 0 0 1 16 3.5v8.662a1 1 0 0 1-.629.928l-7.185 2.874a.5.5 0 0 1-.372 0L.63 13.09a1 1 0 0 1-.63-.928V3.5a.5.5 0 0 1 .314-.464L7.443.184z" />
								</svg>
								Products
							</a>
						</li>
						<li>
							<a href="#" class="nav-link text-white">
								<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor"
									class="bi bi-person-circle" viewBox="0 0 16 16">
									<path d="M11 6a3 3 0 1 1-6 0 3 3 0 0 1 6 0z" />
									<path fill-rule="evenodd"
										d="M0 8a8 8 0 1 1 16 0A8 8 0 0 1 0 8zm8-7a7 7 0 0 0-5.468 11.37C3.242 11.226 4.805 10 8 10s4.757 1.225 5.468 2.37A7 7 0 0 0 8 1z" />
								</svg>
								Customers
							</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<div class="px-3 py-2 border-bottom mb-3">
			<div class="container d-flex flex-wrap justify-content-center">
				<form class="col-12 col-lg-auto mb-2 mb-lg-0 me-lg-auto" role="search">
					<input type="search" class="form-control" placeholder="Tìm kiếm..." aria-label="Search">
				</form>

				<%
					Object obj = session.getAttribute("khachHang");
					KhachHang khachHang = null;
					if(obj!=null){
						khachHang = (KhachHang) obj;
					}
					
					if(khachHang==null){
				%>
				<div class="text-end">
					<button type="button" class="btn btn-light text-dark me-2"><a
							href="<%=url %>/khachhang/dangnhap.jsp">Đăng nhập</a></button>
					<button type="button" class="btn btn-primary"><a href="<%=url %>/khachhang/dangki.jsp" style="color: white;">Đăng kí</a></button>
				</div>
				<% } else { %>
					<divclass="text-end">
					<ul class="navbar-nav me-auto mb-2 mb-1g-0">
					  <li class="nav-item dropdown"><a class="nav-link dropdown-toggle" href="#" role="button"  data-bs-toggle="dropdown" aria-expanded="false">
					     WELCOME, <b><%=khachHang.getTenDangNhap() %></b>
					  </a>
					
					  <ul class="dropdown-menu">
					    <li><a class="dropdown-item" href="<%=url %>/khachhang/thongtin.jsp">Thông tin tài khoản</a></li>
					    <li><a class="dropdown-item" href="<%=url %>/khachhang/thaydoitaikhoan.jsp">Thay đổi thông tin tài khoản</a></li>
					    <li><a class="dropdown-item" href="<%=url %>/khachhang/doimatkhau.jsp">Đổi mật khẩu</a></li>
					    <li><a class="dropdown-item" href="<%=url %>/Khach-Hang?act=dang-xuat">Thoát tài khoản</a></li>
					  </ul></li>
					</ul>
					</div>
				<% }%>
				

			</div>
		</div>
	</header>
	<!-- END BAR -->
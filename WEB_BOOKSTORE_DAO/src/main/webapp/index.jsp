<%@page import="model.KhachHang"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<meta charset="UTF-8">
	<title>Trang chủ</title>
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
	<style>
		a {
			text-decoration: none;
		}
	</style>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
<body>
	<!-- HEADER -->
	 
	<jsp:include page="header.jsp"></jsp:include>
	<!-- PAGE -->
	<div class="container">
		<div class="row">
			<!-- LIST GROUP -->
			<div class="col-lg-3">
				<div class="list-group">
					<a href="#" class="list-group-item list-group-item-action">Tiểu thuyết</a>
					<a href="#" class="list-group-item list-group-item-action">Tài liệu</a>
					<a href="#" class="list-group-item list-group-item-action">Sách khoa học</a>
				</div>
			</div>
			<!-- END LIST GROUP -->

			<!-- PRODUCT -->
			<div class="col-lg-9">
				<!-- SLIDER -->
				<div id="carouselExampleIndicators" class="carousel slide">
					<div class="carousel-indicators">
						<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0"
							class="active" aria-current="true" aria-label="Slide 1"></button>
						<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1"
							aria-label="Slide 2"></button>
						<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2"
							aria-label="Slide 3"></button>
					</div>
					<div class="carousel-inner">
						<div class="carousel-item active">
							<img src="https://indec.vn/wp-content/uploads/2021/01/son_280121_PNG_WEB_tamlyhoc.png-1.png"
								class="d-block w-200 h-100" alt="...">
						</div>
						<div class="carousel-item">
							<img src="https://www.nxbtre.com.vn/Images/News/nxbtre_full_30322019_023243.jpg"
								class="d-block w-200 h-100" alt="...">
						</div>
						<div class="carousel-item">
							<img src="https://newshop.vn/public/uploads/news/tin58.jpg" class="d-block w-200 h-100" alt="...">
						</div>
					</div>
					<button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators"
						data-bs-slide="prev">
						<span class="carousel-control-prev-icon" aria-hidden="true"></span>
						<span class="visually-hidden">Previous</span>
					</button>
					<button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators"
						data-bs-slide="next">
						<span class="carousel-control-next-icon" aria-hidden="true"></span>
						<span class="visually-hidden">Next</span>
					</button>
				</div>
				<!-- END SLIDER -->

				<!-- BODY -->
				<div class="row">
					<div class="card" style="width: 18rem;">
						<img src="https://sachxua.vn/wp-content/uploads/2020/01/sach-nghe-thuat-giao-tiep-de-thanh-cong-sach-kn.jpg"
							class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title">Nghệ thuật giao tiếp thành công</h5>
							<p class="card-text">Some quick example text to build on the card title and make up the bulk
								of the card's content.</p>
							<a href="#" class="btn btn-primary">Thêm vào giỏ hàng</a>
						</div>
					</div>
					<div class="card" style="width: 18rem;">
						<img src="https://307a0e78.vws.vegacdn.vn/view/v2/image/img.media/doc-vi-bat-ky-ai.jpg"
							class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title">Đọc vị bất kì ai</h5>
							<p class="card-text">Some quick example text to build on the card title and make up the bulk
								of the card's content.</p>
							<a href="#" class="btn btn-primary">Thêm vào giỏ hàng</a>
						</div>
					</div>
					<div class="card" style="width: 18rem;">
						<img src="https://novateen.vn/wp-content/uploads/2020/08/t%C3%B4i-t%C3%A0i-gi%E1%BB%8Fi-b%E1%BA%A1n-c%C5%A9ng-th%E1%BA%BF.jpg"
							class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title">Tôi tài giỏi bạn cũng thế</h5>
							<p class="card-text">Some quick example text to build on the card title and make up the bulk
								of the card's content.</p>
							<a href="#" class="btn btn-primary">Thêm vào giỏ hàng</a>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="card" style="width: 18rem;">
						<img src="..." class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title">Card title</h5>
							<p class="card-text">Some quick example text to build on the card title and make up the bulk
								of the card's content.</p>
							<a href="#" class="btn btn-primary">Go somewhere</a>
						</div>
					</div>
					<div class="card" style="width: 18rem;">
						<img src="..." class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title">Card title</h5>
							<p class="card-text">Some quick example text to build on the card title and make up the bulk
								of the card's content.</p>
							<a href="#" class="btn btn-primary">Go somewhere</a>
						</div>
					</div>
					<div class="card" style="width: 18rem;">
						<img src="..." class="card-img-top" alt="...">
						<div class="card-body">
							<h5 class="card-title">Card title</h5>
							<p class="card-text">Some quick example text to build on the card title and make up the bulk
								of the card's content.</p>
							<a href="#" class="btn btn-primary">Go somewhere</a>
						</div>
					</div>

				</div>
				<!-- END BODY -->


			</div>
			<!-- END PRODUCT -->
		</div>
	</div>

	<!-- END PAGE -->
</body>
</html>
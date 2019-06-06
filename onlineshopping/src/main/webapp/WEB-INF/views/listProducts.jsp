<div class="container">
	<div class="row">
		<!-- Display Sidebar -->

		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>

		<!--  Products -->
		<div class="col-md-9">

			<!--  BreadCrumb -->
			<div class="row">
				<div class="col-lg-12" style="background-color: gray; padding-bottom: 0px; border-radius: 5px">
					<c:if test="${userClickAllProducts == true }">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item active">All Products</li>
						</ol>
					</c:if>
					<c:if test="${userClickCategoryProducts == true }">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item">Category</li>
							<li class="breadcrumb-item active">${category.name}</li>
						</ol>
					</c:if>
				</div>
			</div>
		</div>

	</div>
</div>
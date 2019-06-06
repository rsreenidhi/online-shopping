<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="list-group">
<c:forEach items="${categories}" var="category">
	<a href="${contextRoot}/products/${category.id}" class="list-group-item" id="a_${category.name}" }>${category.name}</a> 
</c:forEach>
</div>
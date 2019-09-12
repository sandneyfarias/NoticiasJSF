<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<header>
		<title>Editorias</title>
	</header>
	<body>
		<c:forEach items="${editorias}" var="editoria">
    		${editoria.id} - ${editoria.nome} <br>
		</c:forEach>
	</body>
</html>
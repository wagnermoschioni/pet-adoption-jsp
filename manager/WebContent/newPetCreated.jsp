<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Pet Registered</title>
<link href="css/style.css" rel="stylesheet">

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Belanosima:wght@400;700&family=Mochiy+Pop+One&family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,900&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Roboto:wght@300;400&display=swap"
	rel="stylesheet">
</head>

<title>New Pet</title>

<body>

	<header>
	
	<c:if test="${not empty name }">
	<div class="title">
			<h3>Pet successfully registered: ${ name }</h3>
		</div>
	</c:if>
	
	<c:if test="${empty name }">
	<div class="title">
			<h3>No data was registered.</h3>
		</div>
	</c:if>
	
	</header>


</body>

</html>
<%
  String petName = (String)request.getAttribute("name");
%>

<html>

<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>

<title>New Pet</title>

<body>
	Pet successfully registered: <%= petName %>
</body>

</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.petadoption.model.Pet, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<%
List<Pet> pets = (List<Pet>) request.getAttribute("pets");
%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Pet List</title>
<link href="css/style.css" rel="stylesheet">

<link rel='stylesheet' href='https://cdn-uicons.flaticon.com/uicons-regular-rounded/css/uicons-regular-rounded.css'>

<link
	href="https://fonts.googleapis.com/css2?family=Belanosima:wght@400;700&family=Mochiy+Pop+One&family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,900&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Roboto:wght@300;400&display=swap"
	rel="stylesheet">

</head>
<body>
	<header>
	
	<c:if test="${not empty name }">
	<div class="title">
			<h3>Pet successfully registered: ${ name }</h3>
		</div>
	</c:if>

		<div class="title">
			<h3>PET LIST</h3>
		</div>

	</header>

	<main>

		<table class="tb">
    <tr>
     <th class="col0" >ID</th>
      <th class="col1" >Name</th>
      <th class="col2">Breed</th>
       <th class="col2">Age</th>
        <th class="col2">Vaccinated</th>
        <th class="col3">Action</th>
    </tr>
    
   				 <c:forEach items="${pets}" var="pet">
   				 <tr>
   					<td class="col0">${pet.id}</td>
					<td class="col1">${pet.name}</td>
					<td class="col2">${pet.breed}</td>
					<td class="col2">${pet.age}</td>
					<td class="col2">${pet.vaccinated}</td>
					<td class="colx">
					<a href="/manager/removePet?id=${pet.id}"><i class="fi fi-rr-trash"></i></a>
					<a href="/manager/removePet?id=${pet.id}"><i class="fi fi-rr-pencil"></i></a>
					</td>
					
					 </tr>
				</c:forEach>
   
    
   
  </table>
	</main>
	
	

</body>
</html>
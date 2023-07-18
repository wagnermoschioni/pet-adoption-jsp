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

</head>
<body>
	<header>

		<div class="title">
			<h3>PET LIST</h3>
		</div>

	</header>

	<main>

		<table class="tb">
    <tr>
      <th class="col1" >Name</th>
      <th class="col2">Breed</th>
       <th class="col2">Age</th>
        <th class="col2">Vaccinated</th>
    </tr>
    
   				 <c:forEach items="${pets}" var="pet">
   				 <tr>
					<td class="col1">${pet.name}</td>
					<td class="col2">${pet.breed}</td>
					<td class="col2">${pet.age}</td>
					<td class="col2">${pet.vaccinated}</td>
					
					 </tr>
				</c:forEach>
   
    
   
  </table>
	</main>
	
	

</body>
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/newPet" var="linkNewPetServlet" />
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<link rel="icon" type="image/x-icon" href="img/doge.png">
<title>Register New Pet</title>
<link href="css/style.css" rel="stylesheet">

<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Belanosima:wght@400;700&family=Mochiy+Pop+One&family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,900&family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Roboto:wght@300;400&display=swap"
	rel="stylesheet">

</head>

<body>
	
	<div class="container">




		<form action="${linkNewPetServlet}" method="post">

			<h3>New Pet:</h3>

			<div class="new-pet-infos">

				<div class="group">
					<p>Name</p>
					<input class="pet-data" type="text" name="name" />
				</div>

				<div class="group">
					<p>Breed</p>
					<input class="pet-data" type="text" name="breed" />
				</div>

				<div class="group">
					<p>Age</p>
					<input class="pet-data" type="text" name="age" />
				</div>


				<div class="group-select">
					<p>Vaccinated</p>
					<select class="vaccine" id="option" name="vaccine">
						<option value="yes">Yes</option>
						<option value="no">No</option>
					</select>
				</div>


			</div>

			<input class="btn" type="submit" value="Send" />


		</form>



	</div>

</body>

</html>
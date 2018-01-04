<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head> <title> Log in Confirmation </title></head>

<body>
		Good job <i> ${user.firstName} ${user.lastName} </i>
		<br><br>
		Postal code: ${user.postalCode}
		<br><br>
		Country: ${user.country}
		<br><br>
		Known operating Systems:
		<ul>
			<c:forEach var="temp" items="${user.operatingSystems}">
			<li>${temp}</li>
			</c:forEach>
		</ul>
		Favorite part of movie: ${user.favoritePart}
		<br><br>
		Favorite Jedi: ${user.favoriteJedi}
		<br><br>
		
		
		
</body>


</html>
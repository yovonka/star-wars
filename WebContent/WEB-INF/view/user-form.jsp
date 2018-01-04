<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head> <title> User Registration Form </title>
		<style>
			.error {color:red}
		</style>
</head>

<body> <h2>Fill out the form and join to our community</h2>(* asterisk means required).<br><br>
		<form:form action="processForm" modelAttribute="user">
		
			First name: <form:input path="firstName" />
			<br><br>
			Last name(*): <form:input path="lastName" />
			<form:errors path="lastName" cssClass="error" />
			<br><br>
			
			Postal code: <form:input path="postalCode"/>
			<form:errors path="postalCode" cssClass="error" />
			<br><br>
			
			Country:
			<form:select path="country">		
			<form:options items="${user.countryOptions}"/>
			</form:select>
			<br><br>
			
			Known operating systems:<br>
			Linux <form:checkbox path="operatingSystems" value="Linux" />
			Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
			MS Windows <form:checkbox path="operatingSystems" value="MS Windows" />
			<br><br>
			
			Favorite part of movie: <form:input path="favoritePart"/>
			<form:errors path="favoritePart" cssClass="error" />
			<br><br>
			
			Favorite Jedi:<br>
			<form:radiobuttons path="favoriteJedi" 
			items="${user.favoriteJediOptions}" />
			<br><br>
		
			<input type="submit" value="submit" />
		</form:form>
		
</body>


</html>
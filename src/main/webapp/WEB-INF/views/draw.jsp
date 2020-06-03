<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<link href="/style.css" rel="stylesheet" />

<meta charset="ISO-8859-1">
<title>Draw Cards Page</title>
</head>
<body>

<!-- Header -->
<section class="header">

</section>

<!-- MainBody -->
<main class="container">
	
	<section>
		<table>
			
			<tr>
			
				<c:forEach var="card" items="${cards}">
					
					<td>
						
						<img height="200" src="${card.image}"/>
						
					</td>
				
				</c:forEach>
				
			</tr>
			
			<tr>
			
				<c:forEach var="card" items="${cards}">	
			
					<td>
						
						${card.value} of ${card.suit}
						
					</td>
				
				</c:forEach>
			
			</tr>
		
		</table>
		
	</section>
	
	<section>
	
		<a href="${url}">New Cards </a>|
		<a href="/shuffle?url=${url}"> Reshuffle </a>|
		<a href="/"> Back to Home </a><br>
		
		Cards Remaining: ${remaining}
	
	</section>
	

</main>

</body>
</html>
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
<title>Homepage</title>
</head>
<body>

<!-- Header -->
<section class="header">

</section>

<!-- MainBody -->
<main class="container">
	
	<section>
		<h2>Deck of Cards Exercise</h2>
	</section>
	
	<p>
		There are ${remaining} cards left.
	</p>
	
	<p>
		<a href="/shuffle?url=${url}">Reshuffle</a>
	</p>
	
	<section>
		<form action="/draw">
			
			<label>How many cards?: </label>
			<input type="text" name="count" required />
			
			<button>Draw</button>
			
		</form>
	</section>
	

</main>

</body>
</html>
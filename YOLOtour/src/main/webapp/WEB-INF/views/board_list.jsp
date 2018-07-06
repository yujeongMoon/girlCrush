<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		
		<!-- Mobile Specific Meta -->
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<!-- Favicon-->
		<link rel="shortcut icon" href="img/fav.png">
		<!-- Author Meta -->
		<meta name="author" content="colorlib">
		<!-- Meta Description -->
		<meta name="description" content="">
		<!-- Meta Keyword -->
		<meta name="keywords" content="">
		
		<title>Travel Board</title>
		
		<link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet"> 
		
			<!--
			CSS
			============================================= -->
			<link rel="stylesheet" href="css/linearicons.css">
			<link rel="stylesheet" href="css/font-awesome.min.css">
			<link rel="stylesheet" href="css/bootstrap.css">
			<link rel="stylesheet" href="css/magnific-popup.css">
			<link rel="stylesheet" href="css/jquery-ui.css">				
			<link rel="stylesheet" href="css/nice-select.css">							
			<link rel="stylesheet" href="css/animate.min.css">
			<link rel="stylesheet" href="css/owl.carousel.css">				
			<link rel="stylesheet" href="css/main.css">
		
		
	</head>
	
	<body>
		<c:import url="nav_top.jsp"></c:import>
		<table>
			<thead>
				<tr>
					<th>Travel Board</th>
				</tr>		
			</thead>
			<hr/>
			<tbody>
				<c:forEach items="#{boards }" var="board">
					<tr>
						<td>${board.id }</td>
						<td><a href="<c:url value='/travelboards/view/${board.id }'/>">${board.title }</a></td>
						<td>${board.writer }</td>
						<td><fmt:formatDate pattern="MM-dd hh:mm" value="${board.regDate }"/></td>
						<td>${board.hitCount }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	
	
	</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/main.css" />" >
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<meta charset="UTF-8">
<title>Lista de Salas</title>
</head>
<body>

  <div class="container" >
	
	<h2>Lista de Todas as Salas</h2>
	<h3><a href="<c:url value="/salas/form" />"  >Criar Nova Sala</a></h3>
	
	<table class="table" >
	   <thead class="table-dark">
		<tr>
			<th>Nome da Sala</th>
			<th>Sala Locada</th>
			<th>Ações</th>
		</tr>
	<thead>
	<tbody>
		<c:forEach var="sala" items="${listaSalas}" >
			<tr>
				<td>${sala.nome}</td>
				<td>${sala.locada}</td>
	<td>
	
	<a href="<c:url value="/salas/edit/${sala.id}" />" >Edit</a>
	|
	<a href="<c:url value="/salas/delete/${sala.id}" />" >Delete</a>
	
	
	</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>

</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
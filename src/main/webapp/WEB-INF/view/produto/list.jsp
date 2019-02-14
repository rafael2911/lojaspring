<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:url var="bootstrap" value="/static/bootstrap_3_7" />
<c:url var="base" value="/" />
<link rel="stylesheet" href="${bootstrap }/css/bootstrap.min.css">
<title>Produto - Casa do Código</title>
</head>
<body>

	<div class="col-md-2"></div>
	<div class="col-md-8">
		<h1>Lista de produtos</h1>
		<a class="btn btn-default btn-sm" href="${base }produto/form">Novo</a>
		<br><br>
		<c:if test="${not empty message}">
			<div class="alert alert-success" role="alert">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">×</a>
				${message }
			</div>
		</c:if>
		
		<div class="table-responsive">
			<table class="table table-bordered table-hover">
				<thead>
					<tr class="info">
						<th>Id</th>
						<th>Título</th>
						<th>Descrição</th>
						<th>Páginas</th>
						<th>Publicação</th>
						<th>Status</th>
						<th>Ações</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="produto" items="${ produtos }">
						<tr>
							<td>${produto.id }</td>
							<td>${produto.titulo }</td>
							<td>${produto.descricao }</td>
							<td>${produto.paginas }</td>
							<td>
								<!-- Converte a variável de LocalDate para Date (não seria necessário se o atributo dataPublicacao fosse Date ou Calendar) -->
								<fmt:parseDate var="data" value="${produto.dataPublicacao }"
									pattern="yyyy-MM-dd" type="date" /> <!-- Formata a exibição da data -->
								<fmt:formatDate value="${data }" pattern="dd/MM/yyyy" type="date" />
	
							</td>
							<td>${produto.status.desc }</td>
							<td>
								<a class="btn btn-primary btn-xs" href="${base }produto/editar/${produto.id }">Editar</a> 
								<a class="btn btn-danger btn-xs" href="${base }produto/remover/${produto.id }">Apagar</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<div class="col-md-2"></div>
	<script src="${bootstrap }/js/jquery-3.2.1.min.js"></script>
	<script src="${bootstrap }/js/bootstrap.min.js"></script>
</body>
</html>
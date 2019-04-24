<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Promo</title>
<link rel="stylesheet" href="./css/main.css" />
<link rel="stylesheet" href="./css/bootstrap.css" />
</head>
<body>
            <section class="container">
                <div>
                    <form action="ServletPromo">
                        <div class="form-group row">
                        	<label for="nomPromo">Nom de la promo</label>
                        	<input id="nomPromo" class="form-control" placeholder="Entrer le nom de la promo" type="text" name="nomPromo" value="${nomPromo}" required/>
                        </div>                     
                        <div class="form-group row">
                        	<label for="effectif">Effectif</label>
                        	<input id="effectif" class="form-control" placeholder="Entrer effectif" type="number" name="effectif" value="${effectif}" required/>
  						</div> 
						<div class="bar">
                            <button type="submit" class="btn btn-primary" name="ajouter" value="Ajouter">Ajouter</button>
						</div>
						
					</form>
				</div>
            </section>
            <section class="container">
            	<h2>Liste des promos</h2>
            	<table class = "table">
            		<thead>
            			<tr>
            			<td>ID</td>
            			<td>Nom de la promo</td>
            			<td>Effectif</td>
            			<td>Supprimer</td>
            			</tr>
            		</thead>
            		<tbody>
            			<c:if test="${! empty promo}">
            				<c:forEach items="${promo}" var="x">
            					<tr>	
            						<td><c:out value="${x.idpromo}"/></td>
            						<td><c:out value="${x.nomPromo}"/></td>
            						<td><c:out value="${x.effectif}"/></td>
            						<td>
            							<a href="SupprimerPromo?idpromo=${x.idpromo}">Supprimer</a>
            						</td>
            					</tr>
            				</c:forEach>
            			</c:if>
            		</tbody>
            	</table>
            </section>
</body>
</html>
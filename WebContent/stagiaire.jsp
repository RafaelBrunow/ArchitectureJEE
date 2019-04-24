<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Stagiaire</title>
<link rel="stylesheet" href="./css/main.css" />
<link rel="stylesheet" href="./css/bootstrap.css" />
	
</head>
<body>
            <section class="container">
                <div>
                    <form action="ServletStagiaire">
                        <div class="form-group row">
                        	<label for="prenom">Prénom</label>
                        	<input id="prenom" class="form-control" placeholder="Entrer prénom" type="text" name="prenom" value="${prenom}" required/>
                        </div>
                        <div class="form-group row">
                        	<label for="nom">Nom</label>
                        	<input id="nom" class="form-control" placeholder="Entrer nom" type="text" name="nom" value="${nom}" required/>
                        </div>
                        <div class="form-group row">
                        	<label for="age">Age</label>
                        	<input id="age" class="form-control" placeholder="Entrer age" type="number" name="age" value="${age}" required/>
  						</div> 
						<div class="bar">
                            <button type="submit" class="btn btn-primary" name="ajouter" value="Ajouter">Ajouter</button>
						</div>
						
					</form>
				</div>
            </section>
            <section class="container">
            	<h2>Liste des stagiaires</h2>
            	<table class = "table">
            		<thead>
            			<tr>
            			<td>ID</td>
            			<td>Nom</td>
            			<td>Prénom</td>
            			<td>Age</td>
            			<td>Supprimer</td>
            			</tr>
            		</thead>
            		<tbody>
            			<c:if test="${! empty stagiaire}">
            				<c:forEach items="${stagiaire}" var="x">
            					<tr>	
            						<td><c:out value="${x.idstagiaire}"/></td>
            						<td><c:out value="${x.nom}"/></td>
            						<td><c:out value="${x.prenom}"/></td>
            						<td><c:out value="${x.age}"/></td>
            						<td>
            							<a href="SupprimerStagiaire?idstagiaire=${x.idstagiaire}">Supprimer</a>
            						</td>
            					</tr>
            				</c:forEach>
            			</c:if>
            		</tbody>
            	</table>
            </section>
</body>
</html>
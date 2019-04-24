<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formation</title>
<link rel="stylesheet" href="./css/main.css" />
<link rel="stylesheet" href="./css/bootstrap.css" />
</head>
<body>
            <section class="container">
                <div>
                    <form action="ServletFormation">
                        <div class="form-group row">
                        	<label for="nomFormation">Nom de la formation</label>
                        	<input id="nomFormation" class="form-control" placeholder="Entrer le nom de la formation" type="text" name="nomFormation" value="${nomFormation}" required/>
                        </div>                     
						<div class="bar">
                            <button type="submit" class="btn btn-primary" name="ajouter" value="Ajouter">Ajouter</button>
						</div>						
					</form>
				</div>
            </section>
            <section class="container">
            	<h2>Liste des formations</h2>
            	<table class = "table">
            		<thead>
            			<tr>
            			<td>ID</td>
            			<td>Nom de la formation</td>
            			<td>Supprimer</td>
            			</tr>
            		</thead>
            		<tbody>
            			<c:if test="${! empty formation}">
            				<c:forEach items="${formation}" var="x">
            					<tr>	
            						<td><c:out value="${x.idformation}"/></td>
            						<td><c:out value="${x.nomFormation}"/></td>
            						<td>
            							<a href="SupprimerFormation?idformation=${x.idformation}">Supprimer</a>
            						</td>
            					</tr>
            				</c:forEach>
            			</c:if>
            		</tbody>
            	</table>
            </section>
</body>
</html>
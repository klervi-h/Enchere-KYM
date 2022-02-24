<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Détail vente remportée</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Bienvenue sur le site ENI-Enchère">
<meta name="keywords"
	content="Enchere, objet seconde main, Pas d'échange d'argent">
<link rel="apple-touch-icon" sizes="180x180" href="images/marteau.png">
<link rel="icon" type="image/png" sizes="32x32"
	href="images/marteau.png">
<link rel="icon" type="image/png" sizes="16x16"
	href="images/marteau.png">
<link rel="stylesheet" href="css/style2.css">
<head></head>

<body>
	<a href="AccueilConnectee">ENI - Enchères</a>
	<%
	String nomArticle = (String) request.getAttribute("nomArticle");
	String description = (String) request.getAttribute("description");
	int prix = (int) request.getAttribute("prixArticle");
	int prixInit = (int) request.getAttribute("prixInitial");
	String rue = (String) request.getAttribute("rueVendeur");
	int codePostal = (int) request.getAttribute("codePostaleVendeur");
	String ville = (String) request.getAttribute("villeVendeur");
	String telephone = (String) request.getAttribute("telephoneVendeur");
	String pseudo = (String) request.getAttribute("pseudoVendeur");
	%>

	<!-- TODO debug java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" 
because the return value of "javax.servlet.http.HttpServletRequest.getAttribute(String)" is null -->
	<header>
		<h1>
			<a href=Acceuil.html>ENI - Enchères</a>
		</h1>
	</header>


	<main>

		<h2>Vous avez remporté la vente</h2>
		<img alt="photo de l'article en vente" src="" aria-hidden="true">
		<!--Nom de l'article-->
		<p><%=nomArticle%></p>
		<table>
			<tr>
				<td>Description :</td>
				<td><%=description%></td>
			</tr>
			<tr>
				<td>Meilleure offre :</td>
				<td><%=prix%></td>
			</tr>
			<tr>
				<td>Mise à Prix :</td>
				<td><%=prixInit%></td>
			</tr>
			<tr>
				<td>Retrait :</td>
				<td><%=rue%><%=codePostal%><%=ville%></td>
			</tr>
			<tr>
				<td>Vendeur :</td>
				<td><%=pseudo%></td>
			</tr>
			<tr>
				<td>Tel :</td>
				<td><%=telephone%></td>
			</tr>
		</table>
		<form action="/Enchere-KYM/Accueil" name="back">
			<input type="submit" value="Back" />
		</form>

	</main>

</body>

</html>
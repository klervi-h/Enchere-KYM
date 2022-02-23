<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vente Remportée Vendeur</title>
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
	<%
	String nomArticle = (String) request.getAttribute("nomArticle");
	String description = (String) request.getAttribute("description");
	int prix = (int) request.getAttribute("prixArticle");
	int prixInit = (int) request.getAttribute("prixInitial");
	String dateFin = (String) request.getAttribute("dateFin");
	String rue = (String) request.getAttribute("rueUtil");
	int codePostal = (int) request.getAttribute("codePostaleUtil");
	String ville = (String) request.getAttribute("villeUtil");
	String pseudoVendeur = (String) request.getAttribute("pseudoVendeur");
	%>

	<!-- TODO debug java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" 
because the return value of "javax.servlet.http.HttpServletRequest.getAttribute(String)" is null -->
	<header>
		<h1>
			<a href=Acceuil.html>ENI - Enchères</a>
		</h1>
	</header>


	<main>

		<h2>Jojo44 a remporté l'enchère</h2>
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
				<td>Fin de l'enchère :</td>
				<td><%=dateFin%></td>
			</tr>
			<tr>
				<td>Retrait :</td>
				<td><%=rue%><%=codePostal%><%=ville%></td>
			</tr>
			<tr>
			<tr>


				<td>Vendeur :</td>
				<td><%=pseudoVendeur%></td>
			</tr>
		</table>
		<form action="/Enchere-KYM/Accueil" name="retrait effectué">
			<input type="submit" value="Back" />
		</form>

	</main>

</body>

</html>
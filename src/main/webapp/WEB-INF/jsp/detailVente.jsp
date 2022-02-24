<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Détail vente</title>
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
	int nArticle = (int) request.getAttribute("nArticle");
	String nomArticle = (String) request.getAttribute("nomArticle");
	String description = (String) request.getAttribute("description");
	int categorie = (int) request.getAttribute("categorie");
	int prix = (int) request.getAttribute("prixArticle");
	int prixInit = (int) request.getAttribute("prixInitial");
	String dateFin = (String) request.getAttribute("dateFin");
	String rue = (String) request.getAttribute("rueUtil");
	int codePostal = (int) request.getAttribute("codePostaleUtil");
	String ville = (String) request.getAttribute("villeUtil");
	int noUtil = (int) request.getAttribute("noUtilisateur");
	boolean connecte = (boolean) request.getAttribute("connecte");
	String estConnecte = connecte?"disabled":"";
	%>

	<!-- TODO debug java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" 
because the return value of "javax.servlet.http.HttpServletRequest.getAttribute(String)" is null -->
	<header>
		<h1>
			<a href=AccueilConnectee>ENI - Enchères</a>
		</h1>
	</header>


	<main>

		<h2>Détail vente</h2>
		<img alt="photo de l'article en vente" src="" aria-hidden="true">
		<img alt="photo de l'article " src="" aria-hidden="true">
		<!--Nom de l'article-->
		<p><%=nomArticle%></p>
		<table>
			<tr>
				<td>Description :</td>
				<td><%=description%></td>
			</tr>
			<tr>
				<td>Catégorie :</td>
				<td><%=categorie%></td>
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
				<td>Fin de l'enchère:</td>
				<td><%=dateFin%></td>
			</tr>
			<tr>
				<td>Retrait : </td>
				<td><%=rue%></br><%=codePostal%></br><%=ville%></td>
			</tr>
			<tr>
				<td>Vendeur :</td>
				<td><%=noUtil%></td>
			</tr>
		</table>
		<form action="" method="post">
			<label for="newPrixVente">Ma proposition: </label> <input
				type="number" id="newPrixVente" name="newPrixVente" min="1"
				max="1000" value="<%=prix + 1%>" <%=connecte%>/> <input type="submit"
				value="Enchérir" <%=estConnecte%>/><input type="text" name="numeroArticle"
				value="<%=nArticle%>" hidden="true">
		</form>

	</main>

</body>

</html>
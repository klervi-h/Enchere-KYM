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
<link rel="stylesheet" href="css/StyleSheetM.css">
<!-- -------------- CSS Commun ------------------- -->
<link rel="stylesheet" href="css/styleCommun.css">
<link rel="apple-touch-icon" sizes="180x180" href="images/marteau.png">
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Raleway&display=swap');
</style>
<!-- ---------------------------------------------- -->
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
	<header>
		<nav class="navbar">
			<div class="logo">
				<img src="images/handshake3.png" class="imageLogo">
				<h1>
					<a href="AccueilConnectee">ENI - Enchères</a>
				</h1>
			</div>
			<div class="link">
				<div class="nav-item">
					<a class="nav-link" href="CreationVente">Vendre un article</a>
				</div>
				<div class="nav-item">
					<a class="nav-link" href="MonProfil">Mon profil</a>
				</div>
				<div class="nav-item">
					<a class="nav-link" href="Deconnexion">Deconnexion</a>
				</div>

			</div>
		</nav>
	</header>


	<main>

		<h2>Vous avez remporté la vente</h2>
		<img alt="photo de l'article en vente" src="" aria-hidden="true">
		<div class="tab1">
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
		</div>
		<form action="/Enchere-KYM/Accueil" name="back" class="stylecentre">
			<input type="submit" value="Back" />
		</form>

	</main>

</body>

</html>
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
<link rel="stylesheet" href="css/StyleSheetM.css">
<!-- -------------- CSS Commun ------------------- -->
<link rel="stylesheet" href="css/styleCommun.css">
<link rel="apple-touch-icon" sizes="180x180" href="images/marteau.png">
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Raleway&display=swap');
</style>
<!-- ---------------------------------------------- -->
</head>

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
	String estConnecte = connecte ? "disabled" : "";
	String pseudoVendeur = (String) request.getAttribute("pseudoVendeur");
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
					<a class="nav-link" href="Connexion">Se connecter</a>
				</div>
				<div class="nav-item">
					<a class="nav-link" href="CreationCompte">S'inscrire</a>
				</div>

			</div>
		</nav>
	</header>


	<main>

		<h2>Détail vente</h2>
		<!--Nom de l'article-->
		<div class="tab1">
			<h3><%=nomArticle%></h3>
			<table>
				<tr>
					<td class="entete">Description :</td>
					<td><%=description%></td>
				</tr>
				<tr>
					<td class="entete">Catégorie :</td>
					<td><%=categorie%></td>
				</tr>
				<tr>
					<td class="entete">Meilleure offre :</td>
					<td><%=prix%></td>
				</tr>
				<tr>
					<td class="entete">Mise à Prix :</td>
					<td><%=prixInit%></td>
				</tr>
				<tr>
					<td class="entete">Fin de l'enchère:</td>
					<td><%=dateFin%></td>
				</tr>
				<tr>
					<td class="entete">Retrait :</td>
					<td><%=rue%></br><%=codePostal%></br><%=ville%></td>
				</tr>
				<tr>
					<td class="entete">Vendeur :</td>
					<td><%=pseudoVendeur%></td>
				</tr>
			</table>
		</div>
		<form action="" method="post" class="stylecentre">
			<label for="newPrixVente">Ma proposition: </label> <input
				type="number" id="newPrixVente" name="newPrixVente" min="1"
				max="1000" value="<%=prix + 1%>" <%=connecte%> /> <input
				type="submit" value="Enchérir" <%=estConnecte%> class="boutton"/><input type="text"
				name="numeroArticle" value="<%=nArticle%>" hidden="true">
		</form>

	</main>

</body>

</html>
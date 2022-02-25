<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>ENI-Enchères</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="css/StyleSheetM.css">
<!-- -------------- CSS Commun ------------------- -->
<link rel="stylesheet" href="css/styleCommun.css">
<link rel="apple-touch-icon" sizes="180x180" href="images/marteau.png">
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Raleway&display=swap');
</style>
<!-- ---------------------------------------------- -->
<body>
	<%
    String pseudo = (String) request.getAttribute("pseudonyme");
    String nom = (String) request.getAttribute("nomUtil");
    String prenom = (String) request.getAttribute("prenomUtil");
    String email = (String) request.getAttribute("emailUtil");
    String telephone = (String) request.getAttribute("telephoneUtil");
    String rue = (String) request.getAttribute("rueUtil");
    int codePostal = (int) request.getAttribute("codePostaleUtil");
    String ville = (String) request.getAttribute("villeUtil");
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
	<div>
		<main>
		<h2 class="stylecentre">Mon profil</h2>
			<table class="tab1">
				<tr>
					<td>Pseudo :</td>
					<td><%=pseudo %></td>
				</tr>
				<tr>
					<td>Nom :</td>
					<td><%=nom %></td>
				</tr>
				<tr>
					<td>Prénom :</td>
					<td><%=prenom %></td>
				</tr>
				<tr>
					<td>Email :</td>
					<td><%=email %></td>
				</tr>
				<tr>
					<td>Téléphone :</td>
					<td><%=telephone %></td>
				</tr>
				<tr>
					<td>Rue :</td>
					<td><%=rue %></td>
				</tr>
				<tr>
					<td>Code postal :</td>
					<td><%=codePostal %></td>
				</tr>
				<tr>
					<td>Ville :</td>
					<td><%=ville %></td>
				</tr>

			</table>
		</main>

	</div>
	<div class="stylecentre">
		<a href="/Enchere-KYM/MonProfilModification" >MODIFIER</a>
	</div>

</body>

</head>
</html>

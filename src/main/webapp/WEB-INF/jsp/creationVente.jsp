<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Création d'une vente</title>
<meta name="description" content="Bienvenue sur le site ENI-Enchère">
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
	<form class="tab1">
	<h3>Nouvelle Vente</h3>
		<p>
			<label for="article" class="entete"><span class="sr-only">nom de l'</span>Article
				: *</label> <input type="text" name="article" id="article" />
		</p>
		<p>
			<label for="description" class="entete">Description : *</label> <textarea
				name="description" id="description" /></textarea>
		</p>
		<p>
			<label for="categorie" class="entete">Catégorie *</label> <select name="categorie"
				id="categorie">
				<option value="1">Informatique</option>
				<option value="2">Ameublement</option>
				<option value="3">Vêtement</option>
				<option value="4">Sport&Loisirs</option>
			</select>
		</p>
		<p>
			<label for="prixInit" class="entete">Mise à prix : *</label> <input type="number"
				id="prixInit" name="prixInit" min="1" max="1000" />
		</p>
		<p>
			<label for="dateDebut" class="entete">Début de l'enchère *</label> <input type="date"
				name="dateDebut" id="dateDebut" />
		</p>
		<p>
			<label for="dateFin" class="entete">Fin de l'enchère *</label> <input type="date"
				name="dateFin" id="dateFin">
		</p>
		<fieldset>
		<legend class="entete"><span class="sr-only">Adresse du *</span>Retrait</legend>
			<p>
				<label for="rue" class="entete">rue :*</label><input type="text" name="rue" id="rue"> 
			</p>
			<p>
			<label for="codePostale" class="entete">Code postale :*</label><input type="text" name="codePostale" id="codePostaleRetrait"/>
			</p>
			<p>
			<label for="ville" class="entete">Ville :*</label><input type="text" name="ville" id="ville"/>
		</fieldset>
		<div class="stylecentre">
		<button type="submit" class="boutton">Enregistrer</button>
		<button type="button" id="annulerNewVente" class="boutton">Annuler</button>
		</div>		
	</form>
</body>
</html>

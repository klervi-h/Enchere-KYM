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
		<div class="tab2">
			<div>
				<label for="article" class="entete"><span class="sr-only">nom
						de l'</span>Article : *</label>
			</div>
			<div>
				<input type="text" name="article" id="article" />
			</div>
			<div>
				<label for="description" class="entete">Description : *</label>
			</div>
			<div>
				<textarea name="description" id="description" /></textarea>
			</div>
			<div>
				<label for="categorie" class="entete">Catégorie *</label>
			</div>
			<div>
				<select name="categorie" id="categorie">
					<option value="1">Informatique</option>
					<option value="2">Ameublement</option>
					<option value="3">Vêtement</option>
					<option value="4">Sport&Loisirs</option>
				</select>
			</div>
			<div>
				<label for="prixInit" class="entete">Mise à prix : *</label>
			</div>
			<div>
				<input type="number" id="prixInit" name="prixInit" min="1"
					max="1000" />
			</div>
			<div>
				<label for="dateDebut" class="entete">Début de l'enchère *</label>
			</div>
			<div>
				<input type="date" name="dateDebut" id="dateDebut" />
			</div>
			<div>
				<label for="dateFin" class="entete">Fin de l'enchère *</label>
			</div>
			<div>
				<input type="date" name="dateFin" id="dateFin">
			</div>
		</div>
		<fieldset class="tab2">
			<legend class="entete">
				<span class="sr-only">Adresse du *</span>Retrait
			</legend>
			<div>
				<label for="rue" class="entete">Rue :*</label></div><div><input type="text"
					name="rue" id="rue">
			</div>
			<div>
				<label for="codePostale" class="entete">Code postale :*</label></div><div><input
					type="text" name="codePostale" id="codePostaleRetrait" />
			</div>
			<div>
				<label for="ville" class="entete">Ville :*</label></div><div><input type="text"
					name="ville" id="ville" />
			</div>
		</fieldset>

		<div class="stylecentre">
			<button type="submit" class="boutton">Enregistrer</button>
			<button type="button" id="annulerNewVente" class="boutton">Annuler</button>
		</div>

	</form>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Création d'une vente</title>
</head>
<body>
	<h1>Nouvelle Vente</h1>
	<img alt="photo de l'article en vente" src="" aria-hidden="true">
	<form action="" method="post">
		<img alt="photo de l'article " src="" aria-hidden="true">
		<p>
			<label for="article"><span class="sr-only">nom de l'</span>Article
				: *</label> <input type="text" name="denominationArticle" id="article" />
		</p>
		<p>
			<label for="description">Description : *</label> <input type="text"
				name="description" id="description" />
		</p>
		<p>
			<label for="categorie">Catégorie *</label> <select name="categorie"
				id="categorie">
				<option value="1">Informatique</option>
				<option value="2">Ameublement</option>
				<option value="3">Vêtement</option>
				<option value="4">Sport&&;Loisirs</option>
			</select>
		</p>
		<p>
			<label for="uploadfoto">Photo de l'article *</label>
			<button type="button" name="uploadfoto" lang="engl">UPLOADER</button>
			<!-- uploader de foto -->
		</p>
		<p>
			<label for="prixInit">Mise à prix : *</label> <input type="number"
				id="prixInit" name="prixInit" min="10" max="100" />
		</p>
		<p>
			<label for="dateDebut">Début de l'enchère *</label> <input type="date"
				name="dateDebut" id="dateDebut" />
		</p>
		<p>
			<label for="dateFin">Fin de l'enchère *</label> <input type="date"
				name="dateFin" id="dateFin">
		</p>
		<fieldset>
		<legend><span class="sr-only">Adresse du *</span>Retrait</legend>
			<p>
				<label for="rue">rue :*</label><input type="text" name="rue" id="rue"> 
			</p>
			<p>
			<label for="codePostale">Code postale :*</label><input type="text" name="codePostale" id="codePostaleRetrait"/>
			</p>
			<p>
			<label for="ville">Ville :*</label><input type="text" name="ville" id="ville"/>
		</fieldset>
		<button type="submit" >Enregistrer</button>
		<button type="button" id="annulerNewVente">Annuler</button>		
	</form>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des Encheres</title>
</head>
<body>
	<nav>
		<a href="">acceuil</a>
		<a href="">Vendre un article</a>
		<a href="">Mon profil</a>
		<a href="">Deconnection</a>		
	</nav>
	<main>
		<h1>Liste des enchères</h1>
		<section aria-label="filtre">
			<h2>Filtres :</h2>
			<form action="" method="post">
				<p><input type="text" aria-label="Rechercher article par mot clef" name="recherche" placeholder="Le nom de l'article contient">
				<label for="categorie">Catégorie :</label> <select name="categorie"
				id="categorie">
				<option value="5" selected="selected">Toutes</option>
				<option value="1">Informatique</option>
				<option value="2">Ameublement</option>
				<option value="3">Vêtement</option>
				<option value="4">Sport&Loisirs</option>
			</select>
			<label for="achat">Achats</label>
			<input type="radio" name="achat_vente" value="achat"/>
			<label for="vente">Ventes</label>
			<input type="radio" name="achat_vente"  value="vente"/>
			 
			
			</form>
		</section><h2>Filtres :</h2>
	</main>
	
</body>
</html>
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
		<a href="">acceuil</a> <a href="">Vendre un article</a> <a href="">Mon
			profil</a> <a href="">Deconnection</a>
	</nav>
	<main>
		<h1>Liste des enchères</h1>
		<section aria-label="filtre">
			<h2>Filtres :</h2>
			<form action="" method="post">
				<p>
					<input type="text" aria-label="Rechercher article par mot clef"
						name="recherche" placeholder="Le nom de l'article contient">
					<label for="categorie">Catégorie :</label> <select name="categorie"
						id="categorie">
						<option value="5" selected="selected">Toutes</option>
						<option value="1">Informatique</option>
						<option value="2">Ameublement</option>
						<option value="3">Vêtement</option>
						<option value="4">Sport&Loisirs</option>
					</select>
				<p>
					<input type="radio" name="achat_vente" value="achat" /> <label
						for="achat">Achats</label>
				</p>
				<p>
					<input type="radio" name="achat_vente" value="vente" /> <label
						for="vente">Ventes</label>
				</p>
				<button type="submit">Rechercher</button>
				<!-- CHECKBOX
				<div id="achat">
					<p><input type="checkbox" name="encheresOuvertes" value="ouverte">
					<label for="encheresOuvertes">enchères ouvertes</label></p>
					<p><input type="checkbox" name="encheresEnCours" value="enCours"><label for="encheresEnCours">mes enchères en cours</label></p>
					<p><input type="checkbox" name="encheresRemportees" value="remportee"><label for="encheresRemportees">mes enchères remportées</label></p>
				</div>
				<div id="ventes">
				<p><input type="checkbox" name="ventesEnCours" value="ouverte">
					<label for="ventesEnCours">mes ventes en cours</label></p>
					<p><input type="checkbox" name="ventesNonDebutee" value="enCours"><label for="ventesNonDebutee">ventes non débutées</label></p>
					<p><input type="checkbox" name="ventesTerminees" value="remportee"><label for="ventesTerminees">ventes terminées</label></p>
				</div> -->
			</form>
		</section>
		<ul aria-label="Encheres">
		<%
		//List<Article> listeEncheres = new ArrayList<Article>() ;
							
		%>
		
		</ul>
	</main>

</body>
</html>
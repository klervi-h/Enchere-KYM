<%@page import="encheres.buisness.bll.UtilisateurManager"%>
<%@ page import="java.util.List"%>
<%@ page import="encheres.buisness.bo.Article"%>
<%@page import="encheres.buisness.bo.Article"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des Encheres</title>
<link rel="stylesheet" href="css/styleAcceuill_connection.css">
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
	
	<main>
		<h2>Liste des enchères</h2>
		<!-- Formulaire non actif -->
		<!-- 
		<section aria-label="filtre">
			<h3>Filtres :</h3>
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
				// CHECKBOX
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
				</div> 
			</form>
		</section>
		-->
		<ul aria-label="Listes des articles" class="container">
			<%
			List<Article> listeArticle = (List<Article>) request.getAttribute("listeArticle");
			int longeurListe = listeArticle.size();
			Article article = null;
			UtilisateurManager uM = new UtilisateurManager();

			for (int i = 0; i < listeArticle.size(); i++) {
				article = listeArticle.get(i);
			%>
			<li>
				<h3>
					<a href="DetailVente?idArticle=<%=article.getNoArticle()%>"><%=article.getNomArticle()%></a>
				</h3>
				<p class="article">
					Prix :
					<%=article.getPrixVente()%>
					points<br /> Fin de l'enchère :
					<%=article.getDateFin()%>
					<br /> Vendeur : <a
						href="ProfilVendeur?idVendeur=<%=(uM.afficherParId(article.getNoUtilisateur())).getPseudo()%>"><%=(uM.afficherParId(article.getNoUtilisateur())).getPseudo()%></a>
				</p>
			</li>
			<%
			}
			%>
		</ul>
	</main>

</body>
</html>
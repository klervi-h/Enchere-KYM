<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Modification de mon profil</title>
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
<link rel="stylesheet" href="css/StyleSheetM.css">
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Raleway&display=swap');
</style>
</head>
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
	String motDePasse = (String) request.getAttribute("password");
	int credit = (int) request.getAttribute("creditUtil");
	int noUtil = (int) request.getAttribute("noUtil");
	%>
	<header>
		<nav class="navbar">
			<div class="logo">
				<h1>ENI - Enchères</h1>
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
		<h2 class="stylecentre">Mon profil</h2>
		<form action="" method="post">
			<table class="stylecentre">
				<tr>
					<td class="tab2">
						<p>
							<label for="pseudo">Pseudo :</label> <input type="text"
								id="pseudo" name="pseudo" value="<%=pseudo%>" required />
						</p>
					</td>
					<td class="tab2">
						<p>
							<label for="nom">Nom :</label> <input type="text" id="nom"
								name="nom" value="<%=nom%>" required />
						</p>
					</td>
				</tr>

				<tr>
					<td class="tab2"><p>
							<label for="prenom">Prénom :</label> <input type="text"
								id="prenom" name="prenom" value="<%=prenom%>" required />
						</p></td>
					<td class="tab2">
						<p>
							<label for="email">Email :</label> <input type="email" id="email"
								name="email" value="<%=email%>" required />
						</p>
					</td>
				</tr>

				<tr>
					<td class="tab2">
						<p>
							<label for="telephone">Téléphone :</label> <input type="tel"
								id="telephone" name="telephone" pattern="[0-9]{10}"
								value="<%=telephone%>" required />
						</p>
					</td>
					<td class="tab2">
						<p>
							<label for="rue">Rue :</label> <input type="text" id="rue"
								name="rue" value="<%=rue%>" required />
						</p>
					</td>
				</tr>


				<tr>
					<td class="tab2">
						<p>
							<label for="codePostal">Code Postal :</label> <input type="tel"
								id="codePostal" name="codePostal" pattern="[0-9]{5}"
								value="<%=codePostal%>" required />
						</p>
					</td>
					<td class="tab2">
						<p>
							<label for="ville">Ville :</label> <input type="text" id="ville"
								name="ville" value="<%=ville%>" required />
						</p>
					</td>
				</tr>


				<tr>
					<td class="tab2">
						<p>
							<label for="password">*Ancient mot de passe :</label> <input
								type="password" id="password" name="mdp" required />
						</p>
					</td>
					<td class="tab2"></td>
				</tr>


				<tr>
					<td class="tab2">
						<p>
							<label for="fld-repeat-password">Confirmation <span
								class="sr-only">nouveau mot de passe </span>:
							</label> <input type="password" id="fld-repeat-password"
								name="fld-repeat-password" />
						</p>
					</td>
					<td class="tab2"></td>
				</tr>


				<tr>
					<td class="tab2">
						<p>
							Crédit :
							<%=credit%>
						</p>
					</td>
					<td class="tab2"></td>
				</tr>
			</table>
			<div id="validation" class="stylecentre">
				<input type="submit" name="action" value="enregistrer"
					title="Enregistrer" /> <input type="submit" name="action"
					value="supprimer" title="Supprimer" />
			</div>
		</form>
	</main>
</html>
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
		<h2 class="stylecentre">Mon profil</h2>
		<form action="" method="post">
		<div class="tab1">
			<table class="stylecentre">
				<tr>
					<td>
						<p>
							<label for="pseudo" class="entete">Pseudo :</label><br> <input type="text"
								id="pseudo" name="pseudo" value="<%=pseudo%>" required /><br>
						</p>
					</td>
					<td>
						<p>
							<label for="nom" class="entete">Nom :</label><br> <input type="text" id="nom"
								name="nom" value="<%=nom%>" required /><br>
						</p>
					</td>
				</tr>

				<tr>
					<td><p>
							<label for="prenom" class="entete">Prénom :</label><br> <input type="text"
								id="prenom" name="prenom" value="<%=prenom%>" required /><br>
						</p></td>
					<td>
						<p>
							<label for="email" class="entete">Email :</label><br> <input type="email" id="email"
								name="email" value="<%=email%>" required /><br>
						</p>
					</td>
				</tr>

				<tr>
					<td>
						<p>
							<label for="telephone" class="entete">Téléphone :</label><br> <input type="tel"
								id="telephone" name="telephone" pattern="[0-9]{10}"
								value="<%=telephone%>" required /><br>
						</p>
					</td>
					<td>
						<p>
							<label for="rue" class="entete">Rue :</label><br> <input type="text" id="rue"
								name="rue" value="<%=rue%>" required /><br>
						</p>
					</td>
				</tr>


				<tr>
					<td>
						<p>
							<label for="codePostal" class="entete">Code Postal :</label><br> <input type="tel"
								id="codePostal" name="codePostal" pattern="[0-9]{5}"
								value="<%=codePostal%>" required /><br>
						</p>
					</td>
					<td>
						<p>
							<label for="ville" class="entete">Ville :</label><br> <input type="text" id="ville"
								name="ville" value="<%=ville%>" required /><br>
						</p>
					</td>
				</tr>


				<tr>
					<td>
						<p>
							<label for="password" class="entete">*Ancient mot de passe :</label><br> <input
								type="password" id="password" name="mdp" required /><br>
						</p>
					</td>
					<td></td>
				</tr>


				<tr>
					<td>
						<p>
							<label for="fld-repeat-password" class="entete">Nouveau mot de passe: <span
								class="sr-only" class="entete">Nouveau mot de passe </span>:
							</label><br> <input type="password" id="fld-repeat-password"
								name="fld-repeat-password" /><br>
						</p>
					</td>
					<td><p>
							<label for="fld-repeat-password" class="entete">Confirmation <span
								class="sr-only" class="entete">Confirmation nouveau mot de passe </span>:
							</label><br> <input type="password" id="fld-repeat-password"
								name="fld-repeat-password" /><br>
						</p></td>
				</tr>


				<tr>
					<td class="entete">
						<p>
							Crédit :
							<%=credit%>
						</p>
					</td>
					<td></td>
				</tr>
			</table>
			<div id="validation" class="bas">
				<input type="submit" name="action" value="enregistrer"
					title="Enregistrer" class="boutton"/> <input type="submit" name="action"
					value="supprimer" title="Supprimer" class="boutton"/>
			</div>
			</div>
		</form>
	</main>
</html>
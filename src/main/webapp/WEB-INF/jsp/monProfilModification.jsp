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
<link rel="stylesheet" href="css/style2.css">
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
		<nav id="nav-menu-container">
			<h1>ENI - Enchères</h1>
		</nav>
	</header>

	<main>
		<h2>Mon profil</h2>
		<form action="" method="post">
			<input type="text" name="noUtil" value="<%=noUtil%>" hidden="true">
			<input type="text" name="credit" value="<%=credit%>" hidden="true">
			<p>
				<label for="pseudo">Pseudo :</label> <input type="text" id="pseudo"
					name="pseudo" value="<%=pseudo%>" required />
			</p>
			<p>
				<label for="nom">Nom :</label> <input type="text" id="nom"
					name="nom" value="<%=nom%>" required />
			</p>
			<p>
				<label for="prenom">Prénom :</label> <input type="text" id="prenom"
					name="prenom" value="<%=prenom%>" required />
			</p>
			<p>
				<label for="email">Email :</label> <input type="email" id="email"
					name="email" value="<%=email%>" required />
			</p>
			<p>
				<label for="telephone">Téléphone :</label> <input type="tel"
					id="telephone" name="telephone" pattern="[0-9]{10}"
					value="<%=telephone%>" required />
			</p>
			<p>
				<label for="rue">Rue :</label> <input type="text" id="rue"
					name="rue" value="<%=rue%>" required />
			</p>
			<p>
				<label for="codePostal">Code Postal :</label> <input type="tel"
					id="codePostal" name="codePostal" pattern="[0-9]{5}"
					value="<%=codePostal%>" required />
			</p>
			<p>
				<label for="ville">Ville :</label> <input type="text" id="ville"
					name="ville" value="<%=ville%>" required />
			</p>

			<p>
				<label for="password">*Ancient mot de passe :</label> <input
					type="password" id="password" name="mdp" required />
			</p>
			<p>
				<label for="newPassword">Nouveau mot de passe :</label> <input
					type="password" id="newPassword" name="newPassword" />
			</p>
			<p>
				<label for="fld-repeat-password">Confirmation <span
					class="sr-only">nouveau mot de passe </span>:
				</label> <input type="password" id="fld-repeat-password"
					name="fld-repeat-password" />
			</p>
			<p>
				Crédit :
				<%=credit%>
			</p>

			<div id="validation">
				<input type="submit" name="boutonEnregistrer" value="Enregistrer"
					title="Enregistrer" /> <input type="reset" name="boutonSupprimer"
					value="Supprimer mon compte" title="Supprimer" />
			</div>
		</form>
	</main>
</html>
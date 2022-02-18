<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>ENI-Enchères</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<body>
	<%
    String pseudo = (String) request.getAttribute("pseudonyme");
    String nom = (String) request.getAttribute("nomUtil");
    String prenom = (String) request.getAttribute("prenomUtil");
    String email = (String) request.getAttribute("emailUtil");
    int telephone = (int) request.getAttribute("telephoneUtil");
    String rue = (String) request.getAttribute("rueUtil");
    int codePostal = (int) request.getAttribute("codePostaleUtil");
    String ville = (String) request.getAttribute("villeUtil");
    %>
	<header>
		<div>
			<div>
				<h1>ENI-Enchères</h1>
			</div>
			<main>
				<table>
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
		<div>
			<button onclick="window.location.href = 'https://fr.w3docs.com/';">Modifier</button>
		</div>
	</header>
</body>

</head>
</html>

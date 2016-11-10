<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/estilo.css">
<title>Insert title here</title>
</head>
<body id="Combustible">


<header>
		<div class="row">
			<div class="col-sm-3">
				<!-- logotipo -->
				<img height="80px" src="http://labolsaporantonomasia.es/wp-content/uploads/2012/11/galp-logo.jpg" alt="Logotipo GALP">
			</div>
			<div class="col-sm-9 text-center">
				<h1>GALP Extremadura</h1>
			</div>
		</div>
	</header>

<p>Ha pagado con <%= request.getAttribute("dato1") %></p>


<h1>Selecciona combustible</h1>



			

				<form id="tipodegasolina" action="ServirCombustible" method="post">
					
					<input name="Gasolina98" type="submit" value="Gasolina98">
					<input name="GasolinaSinPlomo" type="submit" value="Gasolina sin plomo">
					<input name="GasoleoA" type="submit" value="GasoleoA">
					<input name="Diesel" type="submit" value="Diesel">
				</form>

</body>
</html>
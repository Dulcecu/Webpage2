<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>DSA</title>
  <meta charset="utf-8">
    <%-- CODIGO PARA UTILIZAR LOS BOOTSTRAPS --%>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>

<body>

<div class="container">
    <%-- DIVISION DEL BOOTSRAP LLAMADA JUMBOTRON QUE HACE LA LETRA GRANDE (ESTILO) --%>
  <div class="jumbotron">
  <h1>Proyecto servlets</h1>
  <h2>Bienvenida</h2>
      <%-- PONE LAS LETRAS EN EL MEDIO --%>
  <p class="text-center">Utiliza el menu inferior para seleccionar la opcion deseada</p>

      <%-- CREA BOTONES CON VINCULOS INTERNOS ( FIBONACCI CLACULADORA...) --%>
    <div class="container">
    <a href="Fibonacci.jsp" class="btn btn-default btn-lg btn-block" role="button">Fibonacci</a>
    <a href="Calculadora.jsp" class="btn btn-default btn-lg btn-block" role="button">Calculadora</a>
    </div>

</div>
        <%-- AÑADE UN PIE DE PAGINA ( SE PROGRAMA EN EL JS) --%>
  <footer id="foot01"></footer>
  </div>

</div>
<%-- NOMBRE DEL JS --%>
<script src="script3.js"></script>
</body>

</html>
<%--
  Created by IntelliJ IDEA.
  User: Turpitude
  Date: 24/10/2016
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
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
<nav class="navbar navbar-default">
    <%-- AÑADE BARRA DE NAVEGACION ( EL MENU SUPERIOR) --%>
    <div class="container-fluid">

        <%-- ENCABEZADO DE LA BARRA Y SU VINCULO --%>
        <div class="navbar-header">

            <a class="navbar-brand" href="https://media.makeameme.org/created/this-webpage-is.jpg">DSA</a>
        </div>
            <%-- DIVISIONES DE LA BARRA Y SUS VINCULOS --%>
        <ul class="nav navbar-nav">
            <li><a href="/index.jsp">Inicio</a></li>
            <li><a href="/Fibonacci.jsp">Fibonacci</a></li>
            <li><a href="/Calculadora.jsp">Calculadora</a></li>
            <li><a href="/Extra.jsp">Extra</a></li>
        </ul>
    </div>
</nav>
<div class="jumbotron">
    <h1 class="text-center">Resultados</h1>
<div class="container">
    <%-- EL CODIGO DE REQUEST.GETATTRIBUTE("RESULT") OBTIENE EL RESULTADO GENERADO POR EL SERVLET
    ("RESULT" ES EL NOMBRE QUE SE LE HA DADO AL RESULTADO EN EL SERVLET) --%>
    <h2 class="text-center"> EL RESULTADO DE TU OPERACIÓN ES: <%= request.getAttribute("result") %></h2>
</div>

</div>

</body>
</html>

<!DOCTYPE html>
<html>

<head>
    <title>Fibonacci</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>

<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand">DSA</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="Fibonacci.jsp">Fibonacci</a></li>
            <li><a href="index.jsp">Inicio</a></li>
            <li><a href="Calculadora.jsp">Calculadora</a></li>
        </ul>
    </div>
</nav>
<div class="container">
    <div class="jumbotron">
    <h1>Serie de Fibonacci</h1>


    <form action="/Fibonacci/" method="get">
        Selecciona la cantidad de sucesiones:<br>
        <input type="number" name="sucesiones"><br>
        <input type="submit" value="Aceptar" />
    </form>

    <footer id="foot01"></footer>
        </div>
</div>

<script src="script3.js"></script>

</body>
</html>


<head>
    <title>Calculadora</title>
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
            <a class="navbar-brand" href="https://makeameme.org/meme/this-webpage-is">DSA</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="Calculadora.jsp">Calculadora</a></li>
            <li><a href="index.jsp">Inicio</a></li>
            <li><a href="Fibonacci.jsp">Fibonacci</a></li>
        </ul>
    </div>
</nav>

<div class="container">
    <div class="jumbotron">
    <h1>Calculadora</h1>

    <form action="/Fibonacci/" method="post">
        <div class="form-group">
            <label for="operador1">Operador 1</label>
            <input class="form-control" id="operador1" type="number" step="any">
        </div>

        <div class="form-group">
            <label for="operador2">Operador 1</label>
            <input class="form-control" id="operador2" type="number" step="any">
        </div>

        <select operacion="operacion" name="operacion">
            <option value="SUMA">SUMA</option>
            <option value="RESTA">RESTA</option>
            <option value="MULTIPLICACION">MULTIPLICACION</option>
            <option value="DIVISION">DIVISION</option>
        </select>

        <input type="submit" value="Aceptar">
    </form>


    <footer id="foot01"></footer>
        </div>
</div>

<script src="script3.js"></script>

</body>
</html>
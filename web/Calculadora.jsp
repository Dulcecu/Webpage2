

<head>
    <title>Calculadora</title>
    <meta charset="utf-8">
    <%-- CODIGO PARA UTILIZAR LOS BOOTSTRAPS --%>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script>
        $(document).ready(function(){
            $("#btn1").click(function (){
                var operador1= $("#operador1").val();
                var operador2= $("#operador2").val();
                var operacion= $("#operacion :selected").text();

                $.post("/Fibonacci",{operador1:operador1,operador2:operador2,operacion:operacion},function(responseText) {
                    $("#res").text("El resultado es "+responseText);
                });
            });
        });
    </script>

</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="https://media.makeameme.org/created/this-webpage-is.jpg">DSA</a>
        </div>

        <ul class="nav navbar-nav">
            <li><a href="index.jsp">Inicio</a></li>
            <li><a href="Fibonacci.jsp">servlets.Fibonacci</a></li>
            <li class="active"><a href="Calculadora.jsp">Calculadora</a></li>
            <li><a href="Extra.jsp">Extra</a></li>

        </ul>
    </div>
</nav>

<div class="container">
    <div class="jumbotron">
    <h1>Calculadora</h1>

        <div class="form-group">
            <label>Operador 1</label>
            <input class="form-control" id="operador1" type="number" step="any">
        </div>

        <div class="form-group">
            <label>Operador 2</label>
            <input class="form-control"id="operador2" type="number" step="any">
        </div>

        <select name="operacion" id="operacion">
            <option id="suma">SUMA</option>
            <option id="resta">RESTA</option>
            <option id="multiplicacion">MULTIPLICACION</option>
            <option id="division">DIVISION</option>
        </select>

        <button id="btn1" class="btn btn-primary center-block">V2 de Calculadora</button>
        <p id="res"></p>

    <footer id="foot01"></footer>
        </div>
</div>

<script src="script3.js"></script>

</body>
</html>
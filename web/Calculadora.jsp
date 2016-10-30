

<head>
    <title>Calculadora</title>
    <meta charset="utf-8">
    <%-- CODIGO PARA UTILIZAR LOS BOOTSTRAPS --%>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
<%-- AÑADE BARRA DE NAVEGACION ( EL MENU SUPERIOR) --%>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <%-- ENCABEZADO DE LA BARRA Y SU VINCULO --%>
        <div class="navbar-header">
            <a class="navbar-brand" href="https://media.makeameme.org/created/this-webpage-is.jpg">DSA</a>
        </div>
            <%-- DIVISIONES DE LA BARRA Y SUS VINCULOS ( ACTIVE MARCA DONDE ESTAS) --%>
        <ul class="nav navbar-nav">
            <li><a href="index.jsp">Inicio</a></li>
            <li><a href="Fibonacci.jsp">Fibonacci</a></li>
            <li class="active"><a href="Calculadora.jsp">Calculadora</a></li>
            <li><a href="Extra.jsp">Extra</a></li>

        </ul>
    </div>
</nav>

<div class="container">
    <div class="jumbotron">
    <h1>Calculadora</h1>
        <%-- CODIGO PARA UTILIZAR EL SERVLET DE FIBONACCI (METODO POST )(CALCULADORA ESTE EN EL MISMO SERVLET) --%>
    <form action="/Fibonacci/" method="post">

        <%-- CODIGO PARA UTILIZAR FUNCIONES CON BOOTSTRAPS --%>
        <div class="form-group">
            <label>Operador 1</label>
            <%-- TIPO DE VARIABLE Y NOMBRE DE VARIABLE ( EL NOMBRE SE USA EN EL SERVLET)(STEP ANY PERMITE DECIMALES) --%>
            <input class="form-control" name="operador1" type="number" step="any">
        </div>

        <div class="form-group">
            <label>Operador 2</label>
            <%-- TIPO DE VARIABLE Y NOMBRE DE VARIABLE ( EL NOMBRE SE USA EN EL SERVLET)(STEP ANY PERMITE DECIMALES) --%>
            <input class="form-control" name="operador2" type="number" step="any">
        </div>

            <%-- CODIGO QUE PERMITE ELEGIR MULTIPLES OPCIONES Y EL NOMBRE DE LA VARIABLE(EL NOMBRE SE USA EN EL SERVLET)  --%>
        <select operacion="operacion" name="operacion">
            <option value="SUMA">SUMA</option>
            <option value="RESTA">RESTA</option>
            <option value="MULTIPLICACION">MULTIPLICACION</option>
            <option value="DIVISION">DIVISION</option>
        </select>
            <%-- ESTILO DEL BOTON PARA REALIZAR EL SERVLET Y EL TEXTO QUE TIENE --%>
        <input type="submit" class="btn btn-primary center-block " value="Aceptar">




    </form>


    <footer id="foot01"></footer>
        </div>
</div>

<script src="script3.js"></script>

</body>
</html>
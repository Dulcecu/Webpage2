<!DOCTYPE html>
<html>
<head>
    <title>Fibonacci</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="script3.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script>
        $(document).ready(function(){
            $("#btn1").click(function (){
                $.get("/Fibonacci/", function(responseJson) {
                    var $ul = $("<ul>").appendTo($("#res")); // Create HTML <ul> element and append it to HTML DOM element with ID "somediv".
                    $.each(responseJson, function(index, item) { // Iterate over the JSON array.
                        $("<li>").text(item).appendTo($ul);
                });
            });
        });
    });
    </script>
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
            <li class="active"><a href="Fibonacci.jsp">Fibonacci</a></li>
            <li><a href="Calculadora.jsp">Calculadora</a></li>
            <li><a href="Extra.jsp">Extra</a></li>
        </ul>
    </div>
</nav>
<div class="container">
    <div class="jumbotron">
    <h1>Serie de Fibonacci</h1>

        <%-- CODIGO PARA UTILIZAR EL SERVLET DE FIBONACCI (METODO GET) --%>

        <%-- CODIGO PARA UTILIZAR FUNCIONES CON BOOTSTRAPS --%>
        <div class="form-group">
            <label>Selecciona la cantidad de sucesiones</label>
            <%-- TIPO DE VARIABLE Y NOMBRE DE VARIABLE ( EL NOMBRE SE USA EN EL SERVLET) --%>
            <input class="form-control" name="sucesiones" type="number">
            <%-- ESTILO DEL BOTON PARA REALIZAR EL SERVLET Y EL TEXTO QUE TIENE --%>
            <input type="submit" class="btn btn-primary center-block" value="Aceptar" />
        </div>

        <button id="btn1" class="btn btn-primary center-block">V2 de Fibonacci</button>
        <h2 id="res"></h2>

        <footer id="foot01"></footer>
        </div>

</div>
</body>
</html>
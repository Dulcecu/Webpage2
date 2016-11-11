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
                var sucesiones=$("#sucesiones").val();
                $("#res").text("");
                $.get("/Fibonacci",{sucesiones:sucesiones}, function(responseJson) {
                    if(responseJson!="ERROR")
                    {
                        var $ul = $("<ul>").appendTo($("#res"));
                        $.each(responseJson, function(index, item) {
                            $("<li>").text(item).appendTo($ul)});
                    }
                    else{

                   alert("No puedes poner numeros negativos")}

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
            <li class="active"><a href="Fibonacci.jsp">Fibonacci</a></li>
            <li><a href="Calculadora.jsp">Calculadora</a></li>
            <li><a href="Extra.jsp">Extra</a></li>
        </ul>
    </div>
</nav>
<div class="container">
    <div class="jumbotron">
    <h1>Serie de Fibonacci</h1>

        <div class="form-group">
            <label>Selecciona la cantidad de sucesiones</label>
            <input class="form-control" id="sucesiones" type="number">


        <button id="btn1" class="btn btn-primary center-block">V2 de Fibonacci</button>
        <p id="res"></p>

        </div>

        <footer id="foot01"></footer>
        </div>

</div>
</body>
</html>
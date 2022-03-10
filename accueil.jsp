<html>

<head>
    <title>Accueil App Serv</title>
</head>
<script>
    var date = new Date();
    var currentDate = date.toISOString().slice(0,10);
    console.log(currentDate);

    document.getElementById('date').value = currentDate;
</script>
<body>
<h1 style="align-content: center"> Accueil </h1>
<h2> Bonjour, on est  <h3 id="date"></h3> !</h2>
</body>



</html>
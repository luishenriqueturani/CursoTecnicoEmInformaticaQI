<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Exercício 03</title>
    </head>
    <body>
        <h3>Exercício 03</h3>
        <p>Enunciado: Faça um formulário que leia três valores e calcule a média dos três valores.</p>
        <form action="exercicio03.php" method="get">
            <p>Número 1:</p><input type="number" name="n1"><br>
            <p>Número 2:</p><input type="number" name="n2"><br>
            <p>Número 3:</p><input type="number" name="n3"><br>
            <input type="submit" name="btn"><br>
        </form>
        <?php
            if(isset($_GET['btn'])){
                $n1=$_GET['n1'];
                $n2=$_GET['n2'];
                $n3=$_GET['n3'];

                echo 'Média= '.($n1+$n2+$n3)/3;
    
            }
            ?>
        
    </body>
</html>
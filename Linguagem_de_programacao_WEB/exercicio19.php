<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 19</title>
    </head>
    <body>
        <h3>Exercício 19</h3>
        <p>Enunciado: Faça um programa que calcule o fatórial de um número. Ex.: 5!= 1x2x3x4x5= 120.</p>
        <form action="exercicio19.php" method="get">
            <p>Número:</p><input type="number" name="n1"><br>
            <input type="submit" name="btn"><br>
        </form>
        <?php
            if(isset($_GET['btn'])){
                $n1 = $_GET['n1'];
                $cont=1;
                for($i = 1; $i<=$n1; $i++){
                    $cont*=$i;
                    
                }
                echo"Resultado: ".$cont;
            }
        ?>
    </body>
</html>

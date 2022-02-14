<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 16</title>
    </head>
    <body>
        <h3>Exercício 16</h3>
        <p>Enunciado: Faça um programa que leia dois valores e mostre todos valores entre eles. . 
        Exemplo 5 e 12 = 5 6 7 8 9 10 11 12
        </p>
        
        <form action="exercicio16.php" method="get">
            <p>Número 1:</p><input type="number" name="n1">
            <p>Número 2:</p><input type="number" name="n2">
            <input type="submit" name="btn" value="Contar">
        </form>
        <?php
            if(isset($_GET['btn'])){
                $n1 = $_GET['n1'];
                $n2 = $_GET['n2'];
                
                for ($n1; $n1 <= $n2; $n1++) {
                    echo $n1."<br>";
                }
            }
        ?>
    </body>
</html>

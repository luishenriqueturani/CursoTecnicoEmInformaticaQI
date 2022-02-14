<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 17</title>
    </head>
    <body>
        <h3>Exercício 17</h3>
        <p>Enunciado: Faça um programa que o usuário escolhe e inicio de um intervalo e soma todos valores entre eles. 
            Exemplo  3 e 8 =  3+4+5+6+7+8
        </p>
        
        <form action="exercicio17.php" method="get">
            <p>Número 1:</p><input type="number" name="n1">
            <p>Número 2:</p><input type="number" name="n2">
            <input type="submit" name="btn" value="Contar">
        </form>
        <?php
            if(isset($_GET['btn'])){
                $n1 = $_GET['n1'];
                $n2 = $_GET['n2'];
                $calc=0;
                
                for ($n1; $n1 <= $n2; $n1++) {
                    $calc += $n1;
                }
                echo $calc;
            }
        ?>
    </body>
</html>

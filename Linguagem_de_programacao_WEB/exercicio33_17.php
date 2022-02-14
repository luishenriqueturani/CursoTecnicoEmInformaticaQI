<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 33 17</title>
    </head>
    <body>
        <h3>Exercício 33 17</h3>
        <p>Enunciado: Faça um programa que o usuário escolhe e inicio de um intervalo e soma todos valores entre eles. 
            Exemplo  3 e 8 =  3+4+5+6+7+8. Fazer em POO.
        </p>
        
        <form action="exercicio33_17.php" method="post">
            <p>Número 1:</p><input type="number" name="n1">
            <p>Número 2:</p><input type="number" name="n2">
            <input type="submit" name="btn" value="Contar">
        </form>
        <?php
        include 'exercicio33_17calc.php';
            if(isset($_REQUEST['btn'])){
                $calc = new exercicio33_17calc();
                $calc->calc($calc->setN1($_REQUEST['n1']), $calc->setN2($_REQUEST['n2']));
                               
            }
        ?>
    </body>
</html>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 21</title>
    </head>
    <body>
        <h3>Exercício 21</h3>
        <p>Enunciado: Faça um programa que leia um valor e calucle sua tabuada de 10 à dez e exiba-os em uma tabela.</p>
        
        <form action="exercicio21.php" method="post">
            <p>Numero:</p><input type="number" name="n1"><br>
            <input type="submit" name="btn" value="Calcular"><br>
        </form>
        <?php
            if(isset($_POST['btn'])){
                $n1 = $_POST['n1'];
                echo "<table border=1>";
                for($i=1;$i<=10;$i++){
                    echo "<tr><td>".$n1." X ".$i."</td><td>".$n1*$i."</td></tr>";
                }
                echo "</table>";
            }
        ?>
    </body>
</html>

<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Exercicio 05</title>
    </head>
    <body>
        <h3>Exercício 05</h3>
        <p>Enunciado: Faça um programa que leia duas notas de uma pessoa e calcule a média entre elas. Lembre que para aprovação a média deve ser maior do que 6</p>
        <form action="exercicio05.php" method="post">
            <p>Nota 1:</p><input type="number" name="n1"><br>
            <p>Nota 2:</p><input type="number" name="n2"><br>
            <input type="submit" name="btn"><br>
        </form>
        <?php
            if(isset($_POST['btn'])){
                $n1= $_POST['n1'];
                $n2= $_POST['n2'];
                $n3= ($n1+$n2)/2;

                if($n3 >= 6){
                    echo "Você está aprovado com a nota ".$n3.".";
                }else{
                    echo "Você está reprovado, pois sua nota foi ".$n3.".";
                }    
            }
            
        ?>
    </body>
</html>
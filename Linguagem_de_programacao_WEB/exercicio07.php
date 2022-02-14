<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Exercício 07</title> 
    </head>
    <body>
        <h3>Exercício 07</h3>
        <p>Enunciado: Faça um programa que leia dois valores e diga se são iguais ou diferentes.</p>
        <form action="exercicio07.php" method="get">
            <p>Número 1: </p><input type="number" name="n1"><br>
            <p>Número 2: </p><input type="number" name="n2"><br>
            <input type="submit" name="btn">
        </form>
        <?php
            if(isset($_GET['btn'])){
                $n1=$_GET['n1'];
                $n2=$_GET['n2'];

                if($n1==$n2){
                    echo 'Os números '.$n1.' e '.$n2.' são iguais.';
                }else{
                    echo 'Os números '.$n1.' e '.$n2.' são diferentes.';
                }    
            }
            
        ?>
    </body>
</html>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 10</title>
    </head>
    <body>
        <h3>Exrcício 10</h3>
        <p>Enunciado: Faça um programa que leia um valor e mostre se é par positivo, 
            par negativo, impar positivo, impar negativo ou zero.</p>
        
        <form action="exercicio10.php" method="get">
            <p>Digite um número</p><input type="number" name="n1"><br>
            <input type="submit" name="btn"><br>
        </form>
        <?php
            if(isset($_GET['btn'])){
                $n1 = $_GET['n1'];
                if($n1 > 0){
                    if($n1%2==0){
                        echo "O número ".$n1." é par e é positivo";
                    }else{
                        echo "O número ".$n1." é impar e é positivo";
                    }
                }else if($n1 < 0){
                    if($n1%2==0){
                        echo "O número ".$n1." é par e é negativo";
                    }else{
                        echo "O número ".$n1." é impar e é negativo";
                    }
                }else{
                    echo "O número é ".$n1;
                }
            }
            
            
        ?>
    </body>
</html>

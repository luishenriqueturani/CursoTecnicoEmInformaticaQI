<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Exercício 08</title>
    </head>
    <body>
        <h3>Exercício 08</h3>
        <p>Enunciado: Faça um programa que leia um valor e mostre se é par ou impar</p>
        <form action="exercicio08.php" method="post">
            <input type="number" name="n1">
            <input type="submit" name="btn">
        </form>
        <?php
            if(isset($_POST['btn'])){
                $n1=$_POST['n1'];
                if($n1%2==0){
                    echo "par";
                }
                else if($n1%2==1){
                    echo "impar";
                }
            }
            
        ?>
    </body>
</html>
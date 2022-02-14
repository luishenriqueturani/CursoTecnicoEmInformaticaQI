<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Exercício 06</title>
            
    </head>
    <body>
        <h3>Exercício 06</h3>
        <p>Enunciado: Faça um  programa que leia um valor e diga se é positivo ou  negativo</p>
        <form action="exercicio06.php" method="get">
            <p>Digite um número: </p><input type="number" name="n1"><br>
            <input type="submit" name="btn"><br>
        </form>
        <?php 
            if(isset($_GET['btn'])){
                $n1= $_GET['n1'];
        
                if($n1 < 0){
                    echo "O número ".$n1." é negativo.";
                }else{
                    echo "O número ".$n1." é positivo.";
                }
            }
            
        ?>
    </body>
</html>
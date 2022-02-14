<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 9</title>
    </head>
    <body>
        <h3>Exercício 09</h3>
        <p>Enunciado: Faça uma página com dois valores e verifique se são iguais, ou qual é o maior</p>
        <form action="exercicio09.php" method="post">
            <p>Número 1: </p><input type="number" name="n1"><br>
            <p>Número 2: </p><input type="number" name="n2"><br>
            <input type="submit" name="btn"><br>
        </form>
        <?php
            if(isset($_POST['btn'])){
                $n1 = $_POST['n1'];
                $n2 = $_POST['n2'];
                
                if($n1 == $n2){
                    echo "O número ".$n1." é igual ao ".$n2.".";
                }else if($n1 > $n2){
                    echo "O número ".$n1." é maior que ".$n2.".";
                }else{
                    echo "O número ".$n1." é menor que ".$n2.".";
                }
            }
        
        ?>
    </body>
</html>

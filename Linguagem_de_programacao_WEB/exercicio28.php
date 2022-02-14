<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 28</title>
    </head>
    <body>
        <h3>Exercício 28</h3>
        <p>
            Enunciado: Faça uma página que o usuário digita um texto e a 
            quantidade de vezes que deseja ver este valor na tela. Aloque em um vetor e exiba este vetor.
        </p>
        <form action="exercicio28.php" method="post">
            <p>Texto: <input type="text" name="txt"></p>
            <p>Repetições: <input type="number" name="n1"></p>
            <input type="submit" name="btn"><br> 
        </form>
        
        <?php
            if(isset($_REQUEST['btn'])){
                $ar = array($_REQUEST['txt'],$_REQUEST['n1']);
                for ($i=0; $i<$ar[1]; $i++){
                    echo $i." -> ".$ar[0].".<br>";
                }
            }
        ?>
    </body>
</html>

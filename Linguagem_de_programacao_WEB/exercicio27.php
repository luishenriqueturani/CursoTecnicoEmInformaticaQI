<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 27</title>
    </head>
    <body>
        <h3>Exercício 27</h3>
        <p>Enunciado: Faça um programa que leia 4 campos:</p>
        <ul>
            <li>Mostre um vetor</li>
            <li>Junte todos valores em uma String, separados por “-”</li>
            <li>mostre em ordem crescente</li>
            <li>mostre em ordem decrescente</li>
            <li>`s valores sorteados aleatóriamente</li>
        </ul>
        <form action="exercicio27.php" method="get">
            <p>Numero 1: <input type="number" name="n1"></p>
            <p>Numero 2: <input type="number" name="n2"></p>
            <p>Numero 3: <input type="number" name="n3"></p>
            <p>Numero 4: <input type="number" name="n4"></p>
            <input type="submit" name="btn" ><br>
        </form>
        <?php
            if(isset($_REQUEST['btn'])){
                $ar = array($_REQUEST['n1'],$_REQUEST['n2'],$_REQUEST['n3'],$_REQUEST['n4']);
                echo "Vetor Original: ";
                print_r($ar);
                $arimp = implode("-", $ar);
                echo "<br>Array em um String: ".$arimp;
                echo "<br>Em ordem crescente: ";
                asort($ar);
                print_r($ar);
                echo "<br>Em ordem decrescente: ";
                arsort($ar);
                print_r($ar);
                echo "<br>Aleatório: ";
                shuffle($ar);
                print_r($ar);
            }
        ?>
    </body>
</html>

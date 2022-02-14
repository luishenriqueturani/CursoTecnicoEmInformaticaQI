<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 26</title>
    </head>
    <body>
        <h3>Exercício 26</h3>
        <p>Enunciado: Faça uma página que receba 5 valores numéricos, 
            aloque em um vetor e sorteie (reposicione) ordene-os, imprima na ordem inversa e some-os</p>
        
        <form action="exercicio26.php" method="get">
            <p>Numero 1: <input type="number" name="n1"></p>
            <p>Numero 2: <input type="number" name="n2"></p>
            <p>Numero 3: <input type="number" name="n3"></p>
            <p>Numero 4: <input type="number" name="n4"></p>
            <p>Numero 5: <input type="number" name="n5"></p>
            <input type="submit" name="btn" ><br>
        </form>
        <?php
            if(isset($_REQUEST['btn'])){
                $ar = array($_REQUEST['n1'],$_REQUEST['n2'],$_REQUEST['n3'],$_REQUEST['n4'],$_REQUEST['n5']);
                
                echo "Array Original: ";
                print_r($ar);
                echo "<br>Soma dos valores: ".array_sum($ar);
                echo "<br>Ordem decrescente: ";
                arsort($ar);
                print_r($ar);
                echo "<br>Ordem crescente: ";
                asort($ar);
                print_r($ar);
                echo "<br>Sorteados aleatoriamente: ";
                shuffle($ar);
                print_r($ar);
                echo "<br>Inverso:";
                for($i = count($ar)-1; $i>=0; $i--){
                    echo $ar[$i]."<br>";
                }
            }
        ?>
    </body>
</html>

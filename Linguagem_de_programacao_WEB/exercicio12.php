<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 12</title>
    </head>
    <body>
        <h3>Exercício 12</h3>
        <p>Enunciado: Faça um programa que leia um valor em Reais e 
            converta-o em cinco moedas (ex: dolar, Euro, Peso, Libra, iene). </p>
        
        <form action="exercicio12.php" method="get">
            <p>Digite o valor em reais: R$</p> <input type="number" name="n1">
            <input type="submit" name="btn"><br>
        </form>
        
        <?php
            if(isset($_GET['btn'])){
                $n1 = $_GET['n1'];
                echo "Dolar: ".$n1*4.03."<br>Euro: ".$n1*4.74."<br>Peso Argentino: ".$n1*0.1."<br>Iene Japones: ".$n1*0.036."<br>Libra Esterlina ".$n1*5.31;
            }
            
        ?>
    </body>
</html>

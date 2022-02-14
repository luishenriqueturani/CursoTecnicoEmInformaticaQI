<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Exercicio 02</title>
    </head>
    <body>
        <h3>Exercício 02</h3>
        <p>Enunciado: Faça um formulário com dois campos numéricos e realize operações aritméticas entre os dois 
            (Adição, Subtração, multiplicação divisão, raiz, exponencial (pot}encia), resto). Apenas um botão de cálculo.</p>
        <form action="exercicio02.php" method="get">
            <p>Número 1:</p><input type="number" name="n1"><br>
            <p>Número 2:</p><input type="number" name="n2"><br>
            <input type="submit" name="btn">
            <br>
        </form>    
            <?php 
                if(isset($_GET['btn'])){
                    $n1=$_GET['n1'];
                    $n2=$_GET['n2'];

                    echo 'Soma: '.($n1+$n2).'<br>';
                    echo 'Subtração: '.($n1-$n2).'<br>';
                    echo 'Multiplicação: '.($n1*$n2).'<br>';
                    echo 'Divizão: '.($n1/$n2).'<br>';
                    echo 'Potência: '.($n1**$n2).'<br>';
                    echo 'Raiz n1: '.sqrt($n1).'<br>';
                    echo 'Raiz n2: '.sqrt($n2).'<br>';
                    echo 'Resto: '.($n1%$n2).'<br>';
                
                }
                
            ?>
        
        
    </body>

</html>
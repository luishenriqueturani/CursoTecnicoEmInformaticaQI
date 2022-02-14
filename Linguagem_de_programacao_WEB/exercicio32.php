<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 32</title>
    </head>
    <body>
        <h3>Exercício 32</h3>
        <p>
            Enunciado: Faça uma página que leia dois valores e calcule as 6 operações. 
            (Adição, Subtração,Multiplicação,Divisão, Potenciação, Radiciação). Com botão de seleção, e duas classes no mínimo.
        </p>
        
        <form action="exercicio32.php" method="post">
            <p>Número 1: <input type="number" name="n1"></p>
            <p>Número 2: <input type="number" name="n2"></p>
            <p>Cálculo: <select name="select">
                    <option value="som">Soma</option>
                    <option value="sub">Subtração</option>
                    <option value="mult">Multiplicação</option>
                    <option value="div">Divisão</option>
                    <option value="pot">Potência</option>
                    <option value="raiz">Raiz</option>
                </select></p>
            <input type="submit" name="btn">
        </form>
        <?php
            include 'exercicio32calculos.php';
            if(isset($_REQUEST['btn'])){
                $calc = new exercicio32calculos();
                $cond = $_REQUEST['select'];
                if($cond == "som"){
                    $calc->soma($_REQUEST['n1'],$_REQUEST['n2']);
                }
                if($cond == "sub"){
                    $calc->subtracao($_REQUEST['n1'],$_REQUEST['n2']);
                }
                if($cond == "mult"){
                    $calc->multiplicacao($_REQUEST['n1'],$_REQUEST['n2']);
                }
                if($cond == "div"){
                    $calc->divisao($_REQUEST['n1'],$_REQUEST['n2']);
                }
                if($cond == "pot"){
                    $calc->potencia($_REQUEST['n1'],$_REQUEST['n2']);
                }
                if($cond == "raiz"){
                    $calc->raiz($_REQUEST['n1'],$_REQUEST['n2']);
                }
                    
            }                
        ?>
    </body>
</html>

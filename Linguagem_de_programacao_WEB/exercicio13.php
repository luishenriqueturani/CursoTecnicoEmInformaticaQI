<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 13</title>
    </head>
    <body>
        <h3>Exercício 13</h3> 
        <p>Enunciado:Faça um formulário com dois campos numéricos e realize operações 
            aritméticas entre os dois (Adição, Subtração, multiplicação divisão, raiz, exponencial (potência), resto).
            Um botão para cada operação ou um botão de seleção de qual operação desejas realizar
        </p>
        
        <form action="exercicio13.php" method="get">
            <p>Número 1:      </p><input type="text" name="n1"> 
            <p>Número 2:      </p><input type="text" name="n2">
            <br>
            <input type="submit" name="btnsoma" value="SOMA">
            <input type="submit" name="btnsubtracao" value="SUBTRAÇÃO">
            <input type="submit" name="btnmultiplicacao" value="MULTIPLICAÇÃO">
            <br>
            <input type="submit" name="btndivisao" value="DIVISÃO">
            <input type="submit" name="btnraiz" value="RAIZ">
            <input type="submit" name="btnpotencia" value="POTÊNCIA">
            <input type="submit" name="btnresto" value="RESTO">
        </form>
        <?php
            if(isset($_GET['btnsoma'])||isset($_GET['btnsubtracao'])||isset($_GET['btnmultiplicacao'])||isset($_GET['btndivisao'])||isset($_GET['btnraiz'])||isset($_GET['btnpotencia'])||isset($_GET['btnresto'])){
                $num1=$_GET['n1'];
                $num2=$_GET['n2'];
                $operacao;
                if(isset($_GET['btnsoma'])){ 
                    $operacao = $num1 + $num2;
                    echo "Resultado: ".$operacao;
                }else if(isset($_GET['btnsubtracao'])){
                    $operacao = $num1 - $num2;
                    echo "Resultado: ".$operacao;
                }else if(isset($_GET['btnmultiplicacao'])){
                    $operacao = $num1 * $num2;
                    echo "Resultado: ".$operacao;
                }else if(isset($_GET['btndivisao'])){
                    $operacao = $num1 / $num2;
                    echo "Resultado: ".$operacao;
                }else if(isset($_GET['btnraiz'])){
                    $operacao = sqrt($num1)."<br>".sqrt($num2);
                    echo "Resultado: ".$operacao;
                }else if(isset($_GET['btnpotencia'])){
                    $operacao = pow($num1,$num2).", ".pow($num2,$num1);
                    echo "Resultado: ".$operacao;
                }else if(isset($_GET['btnresto'])){
                    $operacao = $num1%$num2;
                    echo "Resultado: ".$operacao;
                }
            }
            
            
        ?>
    </body>
</html>

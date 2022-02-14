<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 33 23</title>
    </head>
    <body>
        <h3>Exercício 33 23</h3>
        <p>Enunciado: Faça uma página que possua 4 campos 
            (tipo range que aceita 10 no máximo) e um botão normal, que quando utilizado calcula</p>
        <ul>
            <li>Somatório;</li>
            <li>Produto;</li>
            <li>Média.</li>
        </ul>
        <p>
            Utilize vetores e POO.
        </p>
        
        
        <form action="exercicio33_23.php" method="post">
            <p></p><input type="range" name="n1" list="tickmarks" min="0" max="10" step="1"><br>
            <datalist id="tickmarks">
                <option value="0">
                <option value="1">
                <option value="2">
                <option value="3">
                <option value="4">
                <option value="5">
                <option value="6">
                <option value="7">
                <option value="8">
                <option value="9">
                <option value="10">
            </datalist>
            <p></p><input type="range" name="n2" min="0" max="10" step="1" list="tickmarks2"><br>
            <datalist id="tickmarks2">
                <option value="0">
                <option value="1">
                <option value="2">
                <option value="3">
                <option value="4">
                <option value="5">
                <option value="6">
                <option value="7">
                <option value="8">
                <option value="9">
                <option value="10">
            </datalist>
            <p></p><input type="range" name="n3" min="0" max="10" step="1" list="tickmarks3"><br>
            <datalist id="tickmarks3">
                <option value="0">
                <option value="1">
                <option value="2">
                <option value="3">
                <option value="4">
                <option value="5">
                <option value="6">
                <option value="7">
                <option value="8">
                <option value="9">
                <option value="10">
            </datalist>
            <p></p><input type="range" name="n4" min="0" max="10" step="1" list="tickmarks4"><br>
            <datalist id="tickmarks4">
                <option value="0">
                <option value="1">
                <option value="2">
                <option value="3">
                <option value="4">
                <option value="5">
                <option value="6">
                <option value="7">
                <option value="8">
                <option value="9">
                <option value="10">
            </datalist>
            <input type="submit" name="btn" value="calcular"><br>
        </form>
        <?php
            include 'exercicio33_23calc.php';
            if(isset($_REQUEST['btn'])){
                $calc = new exercicio33_23calc();
                
                $calc->cont($_REQUEST['n1'],$_REQUEST['n2'],$_REQUEST['n3'],$_REQUEST['n4']);
            }
        ?>
    </body>
</html>

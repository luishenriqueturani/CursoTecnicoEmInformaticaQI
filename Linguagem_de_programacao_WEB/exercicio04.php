<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Exercício 04</title>
    </head>
    <body>
        <h3>Exercício 04</h3>
        <p>Enunciado: Faça um formulário que leia o nome e idade de uma pessoa e diga se ela é de maior ou menor de idade.</p>
        <form action="exercicio04.php" method="get">
            NOME:<input type="text" name="nome"><br>
            IDADE:<input type="number" name="idade"><br>
            <input type="submit" name="btn">
        </form>
        <?php
            if(isset($_GET['btn'])){
                $nome=$_GET['nome'];
                $idade=$_GET['idade'];
                echo "Nome: ".$nome."<br>";
                if($idade >= 18){
                    echo "Maior de idade";
                }else{
                    echo "Menor de idade";
                }
             }
            
        ?>
    </body>
</html>
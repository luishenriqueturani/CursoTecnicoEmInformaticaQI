<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 15</title>
    </head>
    <body>
        <h3>Exercício 15</h3>
        <p>Enunciado: Faça um programa que o usuário digita seu nome e escolhe quantas vezes seu nome será enviado para tela. 
            Exemplo : Renato 4 vezes.  Renato Renato Renato Renato (exiba em lista)</p>
        
        <form action="exercicio15.php" method="get">
            <p>Nome: </p><input type="text" name="nome">
            <p>Quantidade de repetições: </p><input type="number" name="quant">
            <input type="submit" name="btn">
        </form> 
        <?php
            if(isset($_GET['btn'])){
                $nome = $_GET['nome'];
                $quant = $_GET['quant'];
                
                if(strlen($nome)>10){
                    echo $nome = "Muito grande seu comunista";
                }
                
                for ($i = 0; $i < $quant; $i++) {
                    echo $nome."<br>";
                }
            }
        ?>
    </body>
</html>

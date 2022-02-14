<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 33 11</title>
    </head>
    <body>
        <h3>Exercício 33 11</h3>
        <form action="exercicio33_11.php" method="post">
            <p>Nome<input type="text" name="nome"></p>
            <p>Data de nascimento<input type="datetime-local" name="data"></p>
            <p>Idade<input type="number" name="idade" max="200" min="0"></p>
            <p>Gênero<input type="text" name="genero"></p>
            <input type="submit" name="btn">
            
        </form>
        
        <?php
            include 'exercicio33_11sec.php';
            if(isset($_POST['btn'])){
                
                $sec = new exercicio33_11sec();
                $sec->nome=$_POST['nome'];
                $sec->data= $_POST['data'];
                $sec->idade= $_POST['idade'];
                $sec->genero= $_POST['genero'];
                $sec->tabela();                
            }
       ?>
    </body>
</html>

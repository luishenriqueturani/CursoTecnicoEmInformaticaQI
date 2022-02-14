<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 14</title>
    </head>
    <body>
        <h3>Exercício 14</h3>
        <form action="exercicio14.php" method="post">
            <p>Nome: </p><input type="text" name="nome">
            <p>Quantidade: </p><input type="number" name="quant">
            <p>Preço Unitário: </p><input type="text" name="preco">
            <p>Data: </p><input type="date" name="data">
            <input type="submit" name="btn" value="cadastrar"><br>
            
        </form>
        <?php
            if((isset($_POST['btn']))){
                if(empty($_POST['nome']) || empty($_POST['quant']) || empty($_POST['preco']) || empty($_POST['data'])){
                    echo "Campo vazio";
                }else{
                    if(strlen($_POST['nome'])>10 || strlen($_POST['quant'])>10 || strlen($_POST['preco'])>10 || strlen($_POST['data'])>10){
                        echo "Erro, deve ser no máximo 10 caracteres";
                    }else{
                        $nome = $_POST['nome'];
                        $quant = $_POST['quant'];
                        $preco = $_POST['preco'];
                        $total = $quant * $preco;
                        echo '<br><table border=1>';
                        echo "<tr><td>Nome</td><td>".$nome."</td></tr>";
                        echo "<tr><td>Quantidade</td><td>".$quant."</td></tr>";
                        echo "<tr><td>Preço Unitário</td><td>".$preco."</td></tr>";
                        echo "<tr><td>Data</td><td>".$_POST['nome']."</td></tr>";
                        echo "<tr><td>Valor Total</td><td>".$total."</td></tr>";
                        echo "</table>";
                    }
                }
            }
        ?>
        
        
    </body>
</html>

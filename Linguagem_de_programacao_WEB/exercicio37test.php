<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <form action="exercicio37test.php" method="post">
            <p>CPF:<input type="text" name="t1"></p>
            <p>Nome:<input type="text" name="t2"></p>
            <p>Idade: <input type="number" name="idade"></p>
            <p>cep: <input type="text" name="cep"></p>
            <p>Gênero: <input type="text" name="gen"></p>
            <input type="submit" name="btn1" value="cadastro">
            <input type="submit" name="btn2" value="Ler">
        </form>
        <?php
            if(isset($_REQUEST['btn1'])){
                $banco = mysqli_connect("localhost", "root", "", "teste");
                if(!$banco){
                    die ("Erro ao conectar.");
                }else{
                    echo "Conectado<br><br>";
                    $v1 = $_REQUEST['t1'];
                    $v2 = $_REQUEST['t2'];
                    $v3 = $_REQUEST['idade'];
                    $v4 = $_REQUEST['cep'];
                    $v5 = $_REQUEST['gen'];
                    $cadastro="INSERT INTO `cadastro`( `cpf`, `nome`, 'genero', 'idade', 'cep') VALUES ('$v1','$v2', '$v5', '$v3', '$v4')";
                    $retorno = $banco->query($cadastro);
                    echo $retorno;
                }
            }
            if(isset($_REQUEST['btn2'])){
                $banco = mysqli_connect("localhost", "root", "", "teste");
                if(!$banco){
                    die ("Erro ao conectar.");
                }else{
                    echo "Conectado<br>";
                    $ler="SELECT * FROM cadastro";
                    $retorno = $banco->query($ler);
                    if($retorno->num_rows > 0){
                        while ($row = $retorno->fetch_assoc()){
                            echo "<br>CPF: ".$row['cpf']."<br>Nome: ".$row['nome']."<br>Idade: ".$row['idade']."<br>CEP: ".$row['cep']."<br>Gênero: ".$row['genero'];
                        }
                    }
                }
            }
        ?>
    </body>
</html>

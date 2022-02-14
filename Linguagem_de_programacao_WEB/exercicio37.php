<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <title>Exercício 37</title>
    </head>
    <body>
        <h3>Exercício 37</h3>
        <p>Faça um programa que possua um cadastro de cinco campos (tipos alternados entre datas, textos e número) 
            e mostre para cada campo: Grave os dados em um banco de dados</p>
        
        <form action="exercicio37.php" method="post">
            <p>Nome: <input type="text" name="nome"></p>
            <p>Data de nascimento: <input type="date" name="data"></p>
            <p>CPF: <input type="text" name="cpf"></p>
            <p>Idade: <input type="number" name="idade"></p>
            <p>cep: <input type="text" name="cep"></p>
            <input type="submit" name="btn1" value="gravar">
            <input type="submit" name="btn2" value="ler">
            <input type="submit" name="btn3" value="Testar conexão">
        </form>
        <?php

            define("DSN", "mysql");
            define("SERVIDOR", "sql202.epizy.com");
            define("USUARIO", "epiz_28871846");
            define("SENHA", "a1L09N1lTjHB4DW");
            define("BANCODEDADOS", "epiz_28871846_ativ_desaf");
            function conectar() {

                $conn = new PDO(DSN.':host='.SERVIDOR.';dbname='.BANCODEDADOS,USUARIO,SENHA);//a conexão é estabelecida, recebendo as constantes como valor nos seus campos
                return $conn;
            }
            
            if(isset($_REQUEST['btn3'])){
                if(!conectar()){
                    echo "Falha ao conectar.";
                    exit();
                }else{
                    echo "Conectado com sucesso.";
                }
            }
            if(isset($_REQUEST['btn1'])){
                $cpf = $_REQUEST['cpf'];
                $nome = $_REQUEST['nome'];
                $data = $_REQUEST['data'];
                $idade = $_REQUEST['idade'];
                $cep = $_REQUEST['cep'];
                if(!conectar()){
                    echo "Falha ao conectar.";
                    exit();
                }else{
                    try {
                        $query = 'INSERT INTO cadastro VALUES("'.$cpf.'","'.$nome.'","'.$data.'","'.$idade.'","'.$cep.'");';
                        $gravar = conectar()->prepare("$query");
                        $gravar->execute();
                        echo 'Dados gravados, clique em ler para ver seus dados.';
                        
                    } catch (Exception $ex) {
                        echo "$ex";
                    }
                }
            }
            if(isset($_REQUEST['btn2'])){
                $cpf = $_REQUEST['cpf'];
                $nome = $_REQUEST['nome'];
                $data = $_REQUEST['data'];
                $idade = $_REQUEST['idade'];
                $cep = $_REQUEST['cep'];
                if(!conectar()){
                    echo "Falha ao conectar.";
                    exit();
                }else{
                    try {
                        $ler = conectar()->prepare("SELECT * FROM cadastro");
                        $ler->execute();
                        $retorno = "";
                        while($registro = $ler->fetch()){
                            $retorno .= $registro["cpf"]." - ".$registro["nome"]."<br>";
                        }
                        echo $retorno;
                    } catch (Exception $ex) {
                        echo "$ex";
                    }
                }
            }
            
            
        ?>
    </body>
</html>

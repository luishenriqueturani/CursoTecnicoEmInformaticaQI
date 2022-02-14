<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 36</title>
    </head>
    <body>
        <h3>Exercício 36</h3>
        <p>Faça um programa que possua um cadastro de cinco campos (tipos alternados entre datas, textos e número) 
            e mostre para cada campo: Grave os dados em um arquivo e faça um botão que leia o arquivo</p>
        
        <form action="exercicio36.php" method="post">
            <p>Nome: <input type="text" name="nome"></p>
            <p>Data de nascimento: <input type="date" name="data"></p>
            <p>CPF: <input type="text" name="cpf"></p>
            <p>Idade: <input type="number" name="idade"></p>
            <p>cep: <input type="text" name="cep"></p>
            <input type="submit" name="btn1" value="gravar">
            <input type="submit" name="btn2" value="ler">
        </form>
        <?php
            if(isset($_REQUEST['btn1'])){
                $ar = array ($_REQUEST['nome'],$_REQUEST['data'],$_REQUEST['cpf'],$_REQUEST['idade'],$_REQUEST['cep']);
                $arq = fopen("exercicio36.txt","a+");
                for($i=0; $i<count($ar); $i++){
                    fwrite($arq, $ar[$i]."<br>");
                }
                fclose($arq);
            }
            if(isset($_REQUEST['btn2'])){
                $arq = fopen("exercicio36.txt","a+");
                $t = fread($arq, 1000);
                echo $t;
                fclose($arq);
            }
                
        ?>
    </body>
</html>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 34</title>
    </head>
    <body>
        <h3>Exercício 34</h3>
        <p>
            Faça um programa que possua um cadastro de cinco campos 
            (tipos alternados entre datas, textos e número) e mostre para cada campo:
            <ul>
                <li>Se valores são numéricos;</li>
                <li>Possue números e letras;</li>
                <li>Quantas palavras existem e quantos caractéres foram digitados;</li>
                <li>Se possui endereço de IP e MAC;</li>
                <li>Se possui email ou URL.</li>
            </ul>
        </p>
        <form action="exercicio34.php" method="post">
            <p>Nome: <input type="text" name="nome"></p>
            <p>URL: <input type="text" name="url"></p>
            <p>Ip: <input type="text" name="ip"></p>
            <p>MAC: <input type="text" name="mac"></p>
            <p>E-mail: <input type="text" name="email"></p>
            <p><input type="submit" name="btn"></p>
        </form>
        
        <?php
        include 'exercicio34sec.php';
            if(isset($_REQUEST['btn'])){
                $sec = new exercicio34sec();
                $ar = array ($_REQUEST['nome'],$_REQUEST['url'],$_REQUEST['ip'],$_REQUEST['mac'],$_REQUEST['email']);
                for($i=0; $i<count($ar); $i++){
                    echo $sec->numero($ar[$i])."<br>";
                }
                echo "<br>";
                for($i=0; $i<count($ar); $i++){
                    echo $sec->possuiNumero($ar[$i])."<br>";
                    echo $sec->possuiLetras($ar[$i])."<br>";
                }
                for($i=0; $i<count($ar); $i++){
                    echo $sec->palavras($ar[$i])."<br>";
                    echo $sec->caracteres($ar[$i])."<br>";
                }
                echo $sec->ip($ar[2])."<br>".$sec->mac($ar[3])."<br>".$sec->email($ar[4])."<br>".$sec->url($ar[1]);
                
            }
        ?>
    </body>
</html>

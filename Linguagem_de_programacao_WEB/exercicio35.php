<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 35</title>
    </head>
    <body>
        <h3>Exercício 35</h3>
        <p>
            Faça um programa que leia valores e salve-os em session ou cookie, e mostre-os na tela.
        </p>
        
        <form action="exercicio35.php" method="post">
            <p>Nome: <input type="text" name="t1"></p>
            <p>E-mail: <input type="text" name="t2"></p>
            <input type="submit" name="btn" value="Salvar valores">
            <input type="submit" name="btn2" value="Verificar">
        </form>
        <?php
            if(isset($_REQUEST['btn'])){
                $cookie_nome = $_REQUEST['t1'];
                $cookie_valor = $_REQUEST['t1'];
                $cookie_nome2 = $_REQUEST['t2'];
                $cookie_valor2 = $_REQUEST['t2'];
                echo "Valores salvos de nome: ".$cookie_nome." e ".$cookie_valor."<br>Valores salvos de e-mail: ".$cookie_nome2." e ".$cookie_valor2;
            
                $_COOKIE[$cookie_nome]=$cookie_valor;
                $_COOKIE[$cookie_nome2]=$cookie_valor2;
                setcookie($cookie_nome, $cookie_valor);
                setcookie($cookie_nome2, $cookie_valor2);
            }
            if(isset($_REQUEST['btn2'])){
                if(count($_COOKIE)) {
                    echo " Cookie setado ";
                } else {
                        echo "Cookie desativado";
                }
            
            }
        ?>
    </body>
</html>

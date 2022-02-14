<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 25</title>
    </head>
    <body>
        <h3>Exercício 25</h3>
        <p>Enunciado: Faça um programa que leia uma data e coloque cada valor das datas.</p>
        
        <form action="exercicio25.php" method="post">
            <p></p><input type="date" name="date"><br>
            <input type="submit" name="btn"><br>
        </form>
        <?php
            if(isset($_REQUEST['btn'])){
                $ar = $_REQUEST['date'];
                $explode = explode("-", $ar);
                print_r($explode);
            }
        ?>
    </body>
</html>

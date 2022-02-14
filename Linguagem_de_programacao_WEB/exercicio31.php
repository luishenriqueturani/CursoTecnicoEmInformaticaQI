<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 31</title>
    </head>
    <body>
        <h3>Exercício 31</h3>
        <p>Enunciado: Faça um programa que leia nome, curso, 
            e trabalho e imprima em lista estes valores (com duas classes)
        </p>
        <form action="exercicio31.php" method="post">
            <p>Nome: <input type="text" name="t1"></p>
            <p>Curso: <input type="text" name="t2"></p>
            <p>Trabalho: <input type="text" name="t3"></p>
            <input type="submit" name="btn">
        </form>
        <?php
            include 'exercicio31sec.php';
            if(isset($_REQUEST['btn'])){
                $class2 = new exercicio31sec();
                
                $class2->printar($_REQUEST['t1'], $_REQUEST['t2'], $_REQUEST['t3']);
            }
        ?>
    </body>
</html>

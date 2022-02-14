<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 20</title>
    </head>
    <body>
        <h3>Exercício 20</h3>
        <p>Enunciado: Faça uma página que o usuário escolhe quantas linhas e colunas possui uma tabela 
            e escreva dentro de cada célula da tabela a palavra que o usuário digitar.</p>
        
        <form action="exercicio20.php" method="get">
            <p>Linhas:</p><input type="number" name="n1"><br>
            <p>Colunas:</p><input type="number" name="n2"><br>
            <p>Texto:</p><input type="text" name="text"><br>
            <input type="submit" name="btn"><br>
        </form>
        <?php
            if(isset($_GET['btn'])){
                $n1=$_GET['n1'];
                $n2=$_GET['n2'];
                $text=$_GET['text'];
                echo "<table border=1>";
                for($i=0;$i<$n1;$i++){
                    echo "<tr>";
                    for($j=0;$j<$n2;$j++){
                        echo "<td>".$text."</td>";
                    }
                    echo "</tr>";
                }
                echo "</table>";
            }
        ?>
    </body>
</html>

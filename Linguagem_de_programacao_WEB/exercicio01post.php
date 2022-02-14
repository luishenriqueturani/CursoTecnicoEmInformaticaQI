<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Exercício 1</title>
    </head>
    <body>
        <p>Exercicio 1</p>
        <p>Faça um programa php que receba pelo menos cinco campos (duas versões uma com GET e outra com POST)</p>
        <ul>
            <li>Nome - texto</li>
            <li>Data Nascimento - data</li>
            <li>Idade - número</li>
            <li>gênero - lista</li>
            <li>Metas - Texto </li>
        </ul>
        <p>exiba os dados como uma tabela de cadastro.</p>
        <p>parte 2: post</p>
        <form action="exercicio01post.php" method="post">
            <p>Nome</p><input type="text" name="nome"><br>
            <p>Data</p><input type="date" name="data"><br>
            <p>Idade</p><input type="number" name="idade"><br>
            <p>Gênero</p><input type="text" name="genero"><br>
            <input type="submit" name="btn">
            
        </form>
        <?php 
            if(isset($_POST['btn'])){
                $nome= $_POST['nome'];
                $data= $_POST['data'];
                $idade= $_POST['idade'];
                $genero= $_POST['genero'];
                    echo "<table>";
                    echo "<tr>";
                        echo "<th>NOME</th>";
                        echo "<td>".$nome."</td>";
                    echo "</tr>";
                    echo "<tr>";
                        echo "<th>DATA</th>";
                        echo "<td>".$data."</td>";
                    echo "</tr>";
                    echo "<tr>";
                        echo "<th>IDADE</th>";
                        echo "<td>".$idade."</td>";
                    echo "</tr>";
                    echo "<tr>";
                        echo "<th>GENERO</th>";
                        echo "<td>".$genero."</td>";
                    echo "</tr>";
                echo "</table>";                
                
            }
                       
                       
        ?>
        
    </body>
</html>
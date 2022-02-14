
<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Exercício 1</title>
    </head>
    <body>
        <h3>Exercicio 1</h3>
        <p>Faça um programa php que receba pelo menos cinco campos (duas versões uma com GET e outra com POST)</p>
        <ul>
            <li>Nome - texto</li>
            <li>Data Nascimento - data</li>
            <li>Idade - número</li>
            <li>gênero - lista</li>
            <li>Metas - Texto </li>
        </ul>
        <p>exiba os dados como uma tabela de cadastro.</p>
        <p>parte 1: get</p>
        <form action="exercicio01get.php" method="get">
            <p>Nome</p><input type="text" name="nome"><br>
            <p>Data</p><input type="date" name="data"><br>
            <p>Idade</p><input type="number" name="idade"><br>
            <p>Gênero</p><input type="text" name="genero"><br>
            <input type="submit" name="btn">
            
        </form>
        
        <?php
            if(isset($_GET['btn'])){
                $nome= $_GET['nome'];
                $data= $_GET['data'];
                $idade= $_GET['idade'];
                $genero= $_GET['genero'];
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
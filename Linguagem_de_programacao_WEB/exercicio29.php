<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 29</title>
    </head>
    <body>
        <h3>Exercício 29</h3>
        <p>Enunciado: Faça uma página com botão, coloque em um vetor 10 valores. Monte uma String,  e utilize funções:</p>
        <ul>
            <li>array_fill</li>
            <li>implode</li>
            <li>hex2bin</li>
            <li>bin2hex</li>
            <li>chunk_split</li>
        </ul>
        
        <form action="exercicio29.php" method="post">
            <input type="submit" name="btn">
        </form>
        <?php
            if(isset($_REQUEST['btn'])){
                $vet1 = array_fill(0, 10, "ah lah");
                echo "Array fill<br>";
                print_r($vet1);
                echo "<br>Implode:<br>". implode(" ", $vet1);
                echo "<br>bin2hex:";
                $bin = bin2hex("Kauan");
                echo "<br>".$bin;
                echo "<br>hex2bin:";
                $hex = hex2bin($bin);
                echo "<br>".$hex;
                echo "<br>Chunk_split:";
                echo "<br>".chunk_split($hex, 3, "a");
                
            }
        ?>
    </body>
</html>

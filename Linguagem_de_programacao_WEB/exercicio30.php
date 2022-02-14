<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 30</title>
    </head>
    <body>
        <h3>Exercício 30</h3>
        <p>Enunciado: Faça uma página que leia 3 palavras:</p>
        <ul>
            <li>Unifique as palavras;</li>
            <li>repita cem vezes as três palavras juntas;</li>
            <li>Misture as letras e exiba duas versões das palavras;</li>
            <li>Mostre-as em letras maiúsculas e minúsculas;</li>
            <li>coloque em padrão md5;</li>
            <li>retire as vogais;</li>
            <li>nas extremidades não permita letras “o”;</li>
        </ul>
        <form action="exercicio30.php" method="post">
            <p>Palavra 1:<input type="text" name="t1"><br></p>
            <p>Palavra 2:<input type="text" name="t2"><br></p>
            <p>Palavra 3:<input type="text" name="t3"><br></p>
            <input type="submit" name="btn"><br>
        </form>
        <?php
            if(isset($_REQUEST['btn'])){
                $array = array($_REQUEST['t1'],$_REQUEST['t2'],$_REQUEST['t3']);
                echo "Original:<br>";
                foreach ($array as $key) {
                    echo "//".$key."//";
                }
                echo "<br>Implode:<br>";
                $imp = implode("<->", $array);
                echo $imp;
                echo "<br>Repetido:<br>". str_repeat($imp, 100);
                echo "<br>Bagunçando letras:<br>";
                $shuffle = str_shuffle($imp);
                echo $shuffle;
                $shuffle = str_shuffle($imp);
                echo $shuffle;
                $low = strtolower($imp);
                $up = strtoupper($imp);
                echo "<br>Lower: ".$low."<br>";
                echo "Upper: ".$up;
                echo "<br>MD5:<br>";
                $md5 = md5($imp);
                echo $md5;
                echo "<br>Sem vogais:<br>";
                $tri = trim($imp, "a");
                $tri = trim($tri, "e");
                $tri = trim($tri, "i");
                $tri = trim($tri, "o");
                $tri = trim($tri, "u");
                $tri = trim($tri, "A");
                $tri = trim($tri, "E");
                $tri = trim($tri, "I");
                $tri = trim($tri, "O");
                $tri = trim($tri, "U");
                echo $tri;
                
            }
        ?>
    </body>
</html>

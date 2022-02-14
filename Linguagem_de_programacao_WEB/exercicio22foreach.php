<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 22 foreach</title>
    </head>
    <body>
        <h3>Exercício 22 Foreach</h3>
        <p>Enunciado: Faça um formulário com pelo menos 5 campos de tipos variados 
            (textos, número e datas). Aloque todos os campos em um vetor e exiba de 3 formas diferentes:
        </p>
        <ul>
            <li>Imprima vetor normal com print_r;</li>
            <li>Imprima o vetor dentro de uma tabela com os nomes de campos;</li>
            <li>Imprima em formato de lista na ordem inversa;</li>
        </ul>
        <p>Valide se existe algum campo vazio e coloque um limite entre 1 e 10 carácteres por campos.</p>
        <br>
        <form action="exercicio22foreach.php" method="post">
            <p>Nome: </p><input type="text" name="nome"><br>
            <p>Fone: </p><input type="number" name="fone"><br>
            <p>Endereço: </p><input type="text" name="end"><br>
            <p>Idade: </p><input type="number" name="idade"><br>
            <p>Qualquer merd...: </p><input type="text" name="merda"><br>
            <input type="submit" name="btn"><br>
        </form>
        <?php
            if(isset($_POST['btn'])){
                if(empty($_POST['nome']) || empty($_POST['fone']) || empty($_POST['end']) || empty($_POST['idade']) || empty($_POST['merda'])){
                    echo "Algum campo está vazio";
                }else{
                    if(strlen($_POST['nome'])>10 || strlen($_POST['fone'])>10 || strlen($_POST['end'])>10 || strlen($_POST['idade'])>10 || strlen($_POST['merda'])>10){
                        echo "Tamanho mázimo excedido. Digite no máximo 10 caracteres.";
                    }if(strlen($_POST['nome'])<1 || strlen($_POST['fone'])<1 || strlen($_POST['end'])<1 || strlen($_POST['idade'])<1 || strlen($_POST['merda'])<1){
                        echo "Limite mínimo de 1.";
                    }else{
                        
                        $ar = array($_POST['nome'],$_POST['fone'],$_POST['end'],$_POST['idade'],$_POST['merda']);
                        echo "<table border=1>";
                        /*
                        for ($i=0; $i<count($ar); $i++){
                            echo "<td>".$ar[$i]."</td>";
                        }
                         * usando for normal
                         */
                        foreach ($ar as $key){
                            echo "<td>".$key."</td>";
                        }
                        echo "</table>";
                    }
                }
                
            }
        ?>
    </body>
</html>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 11 GET</title>
    </head>
    <body>
        <h3>Exercício 11 Get</h3>
        <form action="exercicio11get.php" method="get">
            <p>Nome</p><input type="text" name="nome"><br>
            <p>Data de nascimento</p><input type="datetime-local" name="data"><br>
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
                        
                        if($idade<0 || $idade>200){
                            echo "<td> Idade inválida</td>";
                        }else{
                            if($idade>0 && $idade<15){
                                echo "<td>".$idade.", infantil</td>";
                            }else if($idade>14 && $idade<22){
                                echo "<td>".$idade.", jovem</td>";
                            }else if($idade>21 && $idade<51){
                                echo "<td>".$idade.", adulto</td>";
                            }else if($idade>50){
                                echo "<td>".$idade.", veterano</td>";
                            }
                        }
                        
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

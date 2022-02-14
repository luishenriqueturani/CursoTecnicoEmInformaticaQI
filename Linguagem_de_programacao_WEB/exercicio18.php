<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Exercício 18</title>
    </head>
    <body>
        <h3>Exercício 18</h3> 
        <p>Enunciado: Faça um programa que leia um valor e verifique se é primo ou não. 
            Todo número primo é divisivel por um ou ele mesmo.
        </p>
        <form action="exercicio18.php" method="get">            
            <input type="number" name="n1">
            <input type="submit" name="btn" value="Verificar">
        </form>
        
        <?php
            if(isset($_GET['btn'])){
                $num1=$_GET['n1'];
                $contdiv=0;
                for($i=1;$i<=$num1;$i++){
                    if($num1%$i==0){
                        $contdiv++;
                    }
                }
                if($contdiv==2){
                    echo"Meu Primo";
                        
                }else{
                    echo"Não é meu Primo";
                }
            }
        ?>              
    </body>
</html>

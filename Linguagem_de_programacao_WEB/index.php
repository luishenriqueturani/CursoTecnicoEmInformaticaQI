<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <form action="index.php" method="post">
            <select name="select">
                <option value="01g">Exercício 1 GET</option>
                <option value="01p">Exercício 1 POST</option>
                <option value="02">Exercício 2</option>
                <option value="03">Exercício 3</option>
                <option value="04">Exercício 4</option>
                <option value="05">Exercício 5</option>
                <option value="06">Exercício 6</option>
                <option value="07">Exercício 7</option>
                <option value="08">Exercício 8</option>
                <option value="09">Exercício 9</option>
                <option value="10">Exercício 10</option>
                <option value="11g">Exercício 11 GET</option>
                <option value="11p">Exercício 11 POST</option>
                <option value="12">Exercício 12</option>
                <option value="13">Exercício 13</option>
                <option value="14">Exercício 14</option>
                <option value="15">Exercício 15</option>
                <option value="16">Exercício 16</option>
                <option value="17">Exercício 17</option>
                <option value="18">Exercício 18</option>
                <option value="19">Exercício 19</option>
                <option value="20">Exercício 20</option>
                <option value="21">Exercício 21</option>
                <option value="22pr">Exercício 22 com print_r</option>
                <option value="22in">Exercício 22 em ordem inversa</option>
                <option value="22fe">Exercício 22 com foreach em tabela</option>
                <option value="23">Exercício 23</option>
                <option value="24">Exercício 24</option>
                <option value="25">Exercício 25</option>
                <option value="26">Exercício 26</option>
                <option value="27">Exercício 27</option>
                <option value="28">Exercício 28</option>
                <option value="29">Exercício 29</option>
                <option value="30">Exercício 30</option>
                <option value="31">Exercício 31</option>
                <option value="32">Exercício 32</option>
                <option value="3311">Exercício 33_11</option>
                <option value="3317">Exercício 33_17</option>
                <option value="3323">Exercício 33_23</option>
                <option value="34">Exercício 34</option>
                <option value="35">Exercício 35</option>
                <option value="36">Exercício 36</option>
                <option value="37">Exercício 37</option>
            </select>
            <input type="submit" name="btn">
        </form>
        
        
        <?php
            if(isset($_REQUEST['btn'])){
                $select = $_REQUEST['select'];
                
                if($select == '01g'){
                    header('Location: exercicio01get.php');
                    exit;
                }
                if($select == '01p'){
                    header('Location: exercicio01post.php');
                    exit;
                }
                if($select == '02'){
                    header('Location: exercicio02.php');
                    exit;
                }
                if($select == '03'){
                    header('Location: exercicio03.php');
                    exit;
                }
                if($select == '04'){
                    header('Location: exercicio04.php');
                    exit;
                }
                if($select == '05'){
                    header('Location: exercicio05.php');
                    exit;
                }
                if($select == '06'){
                    header('Location: exercicio06.php');
                    exit;
                }
                if($select == '07'){
                    header('Location: exercicio07.php');
                    exit;
                }
                if($select == '08'){
                    header('Location: exercicio08.php');
                    exit;
                }
                if($select == '09'){
                    header('Location: exercicio09.php');
                    exit;
                }
                if($select == '10'){
                    header('Location: exercicio10.php');
                    exit;
                }
                if($select == '11g'){
                    header('Location: exercicio11get.php');
                    exit;
                }
                if($select == '11p'){
                    header('Location: exercicio11post.php');
                    exit;
                }
                if($select == '12'){
                    header('Location: exercicio12.php');
                    exit;
                }
                if($select == '13'){
                    header('Location: exercicio13.php');
                    exit;
                }
                if($select == '14'){
                    header('Location: exercicio14.php');
                    exit;
                }
                if($select == '15'){
                    header('Location: exercicio15.php');
                    exit;
                }
                if($select == '16'){
                    header('Location: exercicio16.php');
                    exit;
                }
                if($select == '17'){
                    header('Location: exercicio17.php');
                    exit;
                }
                if($select == '18'){
                    header('Location: exercicio18.php');
                    exit;
                }
                if($select == '19'){
                    header('Location: exercicio19.php');
                    exit;
                }
                if($select == '20'){
                    header('Location: exercicio20.php');
                    exit;
                }
                if($select == '21'){
                    header('Location: exercicio21.php');
                    exit;
                }
                if($select == '22pr'){
                    header('Location: exercicio22print_r.php');
                    exit;
                }
                if($select == '22in'){
                    header('Location: exercicio22inverso.php');
                    exit;
                }
                if($select == '22fe'){
                    header('Location: exercicio22foreach.php');
                    exit;
                }
                if($select == '23'){
                    header('Location: exercicio23.php');
                    exit;
                }
                if($select == '24'){
                    header('Location: exercicio24.php');
                    exit;
                }
                if($select == '25'){
                    header('Location: exercicio25.php');
                    exit;
                }
                if($select == '26'){
                    header('Location: exercicio26.php');
                    exit;
                }
                if($select == '27'){
                    header('Location: exercicio27.php');
                    exit;
                }
                if($select == '28'){
                    header('Location: exercicio28.php');
                    exit;
                }
                if($select == '29'){
                    header('Location: exercicio29.php');
                    exit;
                }
                if($select == '30'){
                    header('Location: exercicio30.php');
                    exit;
                }
                if($select == '31'){
                    header('Location: exercicio31.php');
                    exit;
                }
                if($select == '32'){
                    header('Location: exercicio32.php');
                    exit;
                }
                if($select == '3311'){
                    header('Location: exercicio33_11.php');
                    exit;
                }
                if($select == '3317'){
                    header('Location: exercicio33_17.php');
                    exit;
                }
                if($select == '3323'){
                    header('Location: exercicio33_23.php');
                    exit;
                }
                if($select == '34'){
                    header('Location: exercicio34.php');
                    exit;
                }
                if($select == '35'){
                    header('Location: exercicio35.php');
                    exit;
                }
                if($select == '36'){
                    header('Location: exercicio36.php');
                    exit;
                }
                if($select == '37'){
                    header('Location: exercicio37.php');
                    exit;
                }
                
            }
        ?>
        </body>
</html>
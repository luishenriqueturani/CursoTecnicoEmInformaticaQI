<?php

class exercicio33_23calc {
    
    function cont($n1, $n2, $n3, $n4){
        $ar2 = array ($n1,$n2,$n3,$n4);
        
        $cont = 0;
        $cont2 = 1;
        for($i=0; $i<count($ar2); $i++){
            $cont += $ar2[$i];
            $cont2 *= $ar2[$i];
        }
        echo "Somatório: ".$cont."<br>";
        echo "Média: ".$cont/$i."<br>";
        echo "Produto da multiplicação dos números: ".$cont2."<br>";
    }

}

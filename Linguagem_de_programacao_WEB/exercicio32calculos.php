<?php

class exercicio32calculos {
    function soma($n1, $n2){
        echo "Soma: ".$n1." + ".$n2." = ".($n1+$n2);
    }
    function subtracao($n1, $n2){
        echo "Subtração: ".$n1." - ".$n2." = ".($n1-$n2);
    }
    function multiplicacao($n1, $n2){
        echo "Multiplicação: ".$n1." X ".$n2." = ".($n1*$n2);
    }
    function divisao($n1, $n2){
        echo "Divisão: ".$n1." / ".$n2." = ".($n1/$n2);
    }
    function potencia($n1, $n2){
        echo "Potência base N1: ".pow($n1, $n2);
        echo "Potência base N2: ".pow($n2, $n1);
    }
    function raiz($n1, $n2){
        echo "Raiz de N1: ".sqrt($n1);
        echo "Raiz de N2: ".sqrt($n2);
    }
}

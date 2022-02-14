<?php

class exercicio33_17calc {
    private $n1, $n2;
    
    function getN1() {
        return $this->n1;
    }

    function getN2() {
        return $this->n2;
    }

    function setN1($n1) {
        $this->n1 = $n1;
    }

    function setN2($n2) {
        $this->n2 = $n2;
    }

    function calc($v1, $v2){
        $v1= $this->getN1();
        $v2= $this->getN2();
        $cont=0;
        for ($v1; $v1 <= $v2; $v1++) {
            $cont += $v1;
        }
        echo $cont;
    }
}

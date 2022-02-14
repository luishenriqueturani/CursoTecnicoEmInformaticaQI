<?php

class exercicio34sec {
    function numero($v){
        if(is_numeric($v)){
            return $v." é número.";
        }else {
            return $v." não é número.";
        }
    }
    
    function url($v){
        if(filter_var($v,FILTER_VALIDATE_URL)){
            return "URL ".$v." é válida.";
        }else{
            return "URL ".$v." é inválida.";
        }
    }
    
    function ip($v){
        if(filter_var($v, FILTER_VALIDATE_IP)){
            return "IP ".$v." é válido.";
        }else{
            return "IP ".$v." é inválido.";
        }
    }
    
    function mac($v){
        if(filter_var($v, FILTER_VALIDATE_MAC)){
            return "MAC ".$v." é válido.";
        }else{
            return "MAC ".$v." é inválido.";
        }
    }
    
    function email($v){
        if(filter_var($v, FILTER_VALIDATE_EMAIL)){
            return "E-mail ".$v." é válido.";
        }else{
            return "E-mail ".$v." é inválido.";
        }
    }
    
    function palavras($v){
        return "Foram digitadas ".str_word_count($v)." palavras.";
    }
    
    function caracteres($v){
        return "Foram digitados ".strlen($v)." caracteres.";
    }
    
    function possuiNumero($v){
        $regex="/[0-9]/";
        if(preg_match($regex,$v)){
            echo "O valor ".$v." digitado possui números.";
        }else{
            echo "O valor ".$v." digitado não possui números.";
        }
    }
    
    function possuiLetras($v){
        $regex="/[a-Z]/";
        if(preg_match($regex,$v)){
            echo "O valor ".$v." digitado possui letras.";
        }else{
            echo "O valor ".$v." digitado não possui letras.";
        }
    }
}

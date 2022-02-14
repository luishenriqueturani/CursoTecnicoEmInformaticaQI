<?php

class exercicio33_11sec {
    private $nome, $data, $idade, $genero;
    
    function __get($atrib){
        return $this->$atrib;
    }
    function __set($atrib,$valor){
        return $this->$atrib=$valor;
    }
    
    function idade(){
        if($this->idade<0 || $this->idade>200 ){
            echo "Idade inválida";
        }else{
            if($this->idade>0 && $this->idade<15){
                echo "<td>".$this->idade.", infantil</td>";
            }else if($this->idade>14 && $this->idade<22){
                echo "<td>".$this->idade.", jovem</td>";
            }else if($this->idade>21 && $this->idade<51){
                echo "<td>".$this->idade.", adulto</td>";
            }else if($this->idade>50){
                echo "<td>".$this->idade.", veterano</td>";
            }
        }
    }
    
    function tabela(){
        echo "<table style:'border=1'>";
                    echo "<tr>";
                        echo "<td>NOME</td>";
                        echo "<td>".$this->nome."</td>";
                    echo "</tr>";
                    echo "<tr>";
                        echo "<td>DATA</td>";
                        echo "<td>".$this->data."</td>";
                    echo "</tr>";
                    echo "<tr>";
                        echo "<td>IDADE</td>";
                        $this->idade();
                        
                    echo "</tr>";
                    echo "<tr>";
                        echo "<td>GENERO</td>";
                        echo "<td>".$this->genero."</td>";
                    echo "</tr>";
                echo "</table>";
    }
}

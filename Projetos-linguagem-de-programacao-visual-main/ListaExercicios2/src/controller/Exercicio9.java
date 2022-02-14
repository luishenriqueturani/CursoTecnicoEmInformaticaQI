package controller;

import view.Tela;

/**
 *
 * @author luis_
 */
public class Exercicio9 {
    //Escreva um algoritmo que mostre todos os números ímpares de 1 até 100.
    Tela t = new Tela();
    
    public void iniciarExercicio9(){
        String cont = "";
        for (int i = 1; i <= 100; i++) {
            if(!(i%2==0)){
                cont += i +"\n";
            }
        }
        
        t.mostrarMensagem(cont, "Resposta", 1);
    }
}

package controller;

import view.Tela;

/**
 *
 * @author luis_
 */
public class Exercicio8 {
    //Escreva um algoritmo que receba um valor inteiro. 
    //Mostre a soma de todos os números de 1 até o valor informado.
    
    Tela t = new Tela();
    
    public void iniciarExercicio8(){
        int num = Integer.parseInt(t.informarDado("numero"));
        
        String cont = "";
        for (int i = 0; i <= num; i++) {
            cont += i+" + "+ num +" = "+ (i+num)+"\n";
        }
        
        t.mostrarMensagem(cont, "Resposta", 1);
    }
}

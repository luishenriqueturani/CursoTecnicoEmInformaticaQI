package controller;

import view.Tela;

/**
 *
 * @author luis_
 */
public class Exercicio5 {
    //Escreva um algoritmo em JavaScript que receba um número e verifique se é Par ou Ímpar. (Fórmula: variável % 2 == 0)
    
    Tela t = new Tela();
    
    public void iniciarExercicio5(){
        if(Integer.parseInt(t.informarDado("número")) % 2 == 0){
            t.mostrarMensagem("Ele é par", "Resposta", 1);
        }else{
            t.mostrarMensagem("Ele é impar", "Resposta", 1);
        }
    }
}

package controller;

import view.Tela;

/**
 *
 * @author Luís Henrique
 */
public class Exercicio3 {
    Tela t = new Tela();
    
    public void iniciarExercicio3(){
        //Escreva um algoritmo que calcule a área de um quadrado. Mostre na tela.
        double lado = Double.parseDouble(t.informarDado("valor do lado do quadrado"));
        t.mostrarMensagem("A área do quadrado é: "+ (lado*lado), "Resultado", 1);
    }
}

package controller;

import view.Tela;

/**
 *
 * @author Luís Henrique
 */
public class Exercicio1 {
    //Escreva um algoritmo que receba 3 notas. Calcule a média das notas e mostre na tela.
    Tela t = new Tela();
    
    
    public void iniciarExercício(){
        double n1 = Double.parseDouble(t.informarDado("valor 1"));
        double n2 = Double.parseDouble(t.informarDado("valor 2"));
        double n3 = Double.parseDouble(t.informarDado("valor 3"));
        t.mostrarMensagem("A média das notas é " + (n1+n2+n3)/3, "Resultado", 1);
    }
}

package controller;

import view.Tela;

/**
 *
 * @author Luís Henrique
 */
public class Exercicio2 {
    //Escreva um algoritmo que receba 4 valores. 
    //Calcule o produto dos dois primeiros e some com o produto dos dois últimos. Mostre na tela.
    Tela t = new Tela();
    
    public void iniciarExercicio2(){
        double p1 = Double.parseDouble(t.informarDado("primeiro valor")) * Double.parseDouble(t.informarDado("segundo valor"));
        double p2 = Double.parseDouble(t.informarDado("terceiro valor")) * Double.parseDouble(t.informarDado("quarto valor"));
        t.mostrarMensagem("O resultado da soma das multiplicações entre o 1º e 2º e 3º e 4º é: "+(p1+p2), "Resultado", 1);
    }
}

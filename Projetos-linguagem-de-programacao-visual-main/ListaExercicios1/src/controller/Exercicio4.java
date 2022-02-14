package controller;

import view.Tela;

/**
 *
 * @author Luís Henrique
 */
public class Exercicio4 {
    //Escreva um algoritmo que calcule o desconto de 10% sobre o preço de um produto. Apresente o novo preço na tela.
    Tela t = new Tela();
    
    public void iniciarExercicio4(){
        double prod = Double.parseDouble(t.informarDado("preço do produto"));
        double desc = prod *0.1;
        t.mostrarMensagem("O valor do produto com desconto é: "+(prod-desc), "Resultado", 1);
    }
}

package controller;

import view.Tela;

/**
 *
 * @author Luís Henrique
 */
public class Exercicio6 {
    //Escreva um algoritmo que receba 2 valores e inverta os valores informados 
    //(valor1 passa a ter o conteúdo de valor2 e valor2 passa a ter o conteúdo de valor1.
    Tela t = new Tela();
    
    public void iniciarExercicio6(){
        double v1 = Double.parseDouble(t.informarDado("v1"));
        double v2 = Double.parseDouble(t.informarDado("v2"));
        double v3 = v1;
        v1 = v2;
        v2 = v3;
        t.mostrarMensagem("Agora este é o v1: "+v1+"\nAgora este é o v2: "+v2, "Resultado", 1);
    }
}

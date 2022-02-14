package controller;

import view.Tela;

/**
 *
 * @author luis_
 */
public class Exercicio2 {
    //Escreva um algoritmo que receba 3 valores. 
    //Mostre os valores em ordem crescente, ou seja, o menor valor primeiro e por último o maior valor.
    Tela t = new Tela();
    
    
    public void iniciarExercicio2(){
        double v1 = Double.parseDouble(t.informarDado("primeiro valor"));
        double v2 = Double.parseDouble(t.informarDado("segundo valor"));
        double v3 = Double.parseDouble(t.informarDado("terceiro valor"));
        double aux;
        double vetor[] = {v1,v2,v3};
        
        for (int i = 0; i < 2; i++) {
            if(vetor[i] > vetor[i+1]){
                aux = vetor[i+1];
                vetor[i+1]=vetor[i];
                vetor[i] = aux;
            }
        }
        for (int i = 0; i < 2; i++) {
            if(vetor[i] > vetor[i+1]){
                aux = vetor[i+1];
                vetor[i+1]=vetor[i];
                vetor[i] = aux;
            }
        }
        t.mostrarMensagem("Nova ordem numérica: \nValor 1: " + vetor[0] + "\n"
                + "Valor 2: " + vetor[1] + "\nVetor 3: " + vetor[2], "Resultado", 1);
    }
    
    
}

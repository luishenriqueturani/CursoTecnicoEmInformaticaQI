package controller;

import view.Tela;

/**
 *
 * @author luis_
 */
public class Exercicio10 {
    //Escreva um algoritmo que receba um valor inteiro. Mostre todos os números pares de 2 até o valor informado.
    
    Tela t = new Tela();
    
    public void iniciarExercicio10(){
        int num = Integer.parseInt(t.informarDado("número"));
        String cont = "";
        
        for (int i = 2; i <= num; i++) {
            if(i % 2 == 0){
                cont += i + "\n";
            }
        }
        t.mostrarMensagem(cont, "Resposta", 1);
    }
}

package controller;

import view.Tela;

/**
 *
 * @author luis_
 */
public class Exercicio7 {
    //Escreva um algoritmo que receba um valor inteiro. 
    //Mostre todos os números de 1 até o valor informado, um abaixo do outro.
    
    Tela t = new Tela();
    
    public void iniciarExercicio7(){
        double num = Double.parseDouble(t.informarDado("número"));
        String cont = "";
        for (int i = 1; i <= num ; i++) {
            cont += "" + i + "\n";
        }
        t.mostrarMensagem("Contagem de 1 até o número digitado\n"+cont, "Resposta", 1);
    }
}

package controller;

import view.Tela;

/**
 *
 * @author luis_
 */
public class Exercicio4 {
    //Escreva um algoritmo que receba 3 notas. Calcule a média das notas.
    //- Se a média for 7 ou maior, mostre: Aprovado!
    //- Se a média for menor que 7, mostre: Reprovado.
    Tela t = new Tela();
    
    public void iniciarExercicio4(){
        double n1 = Double.parseDouble(t.informarDadoA("nota 1"));
        double n2 = Double.parseDouble(t.informarDadoA("nota 2"));
        double n3 = Double.parseDouble(t.informarDadoA("nota 3"));
        
        if(((n1+n2+n3)/3) >= 7){
            t.mostrarMensagem("A média é : " + ((n1+n2+n3)/3) + "\nVocê está aprovado!", "Resposta", 1);
        }else if(((n1+n2+n3)/3) < 7){
            t.mostrarMensagem("A média é : " + ((n1+n2+n3)/3) + "\nVocê está reprovado!", "Resposta", 1);
        }
        
        
    }
}

package controller;

import view.Tela;

/**
 *
 * @author luis_
 */
public class Exercicio8 {
    //Considerando que, para um consórcio, sabe-se o número total de prestações, 
    //a quantidade de prestações pagas e o valor da prestação (fixa), escreva um 
    //algoritmo que mostre o saldo devedor do cliente.
    Tela t = new Tela();
    
    public void iniciarExercicio8(){
        int totPres = Integer.parseInt(t.informarDado("total de prestações"));
        int presPago = Integer.parseInt(t.informarDadoA("quantidade de prestações pagas"));
        double valor = Double.parseDouble(t.informarDado("valor das prestações"));
        t.mostrarMensagem("Isto é o que falta a ser pago: "+(valor*(totPres-presPago)), "Resposta", 1);
    }
}

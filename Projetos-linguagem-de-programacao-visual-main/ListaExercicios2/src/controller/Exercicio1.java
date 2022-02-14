package controller;

import view.Tela;

/**
 *
 * @author luis_
 */
public class Exercicio1 {
    //Escreva um algoritmo que receba a idade de uma pessoa. 
    //Verifique a idade e mostre se a pessoa é maior ou menor de 18 anos.
    Tela t = new Tela();
    
    public void iniciarExercicio1(){
        if(Integer.parseInt(t.informarDadoA("idade")) >= 18){
            t.mostrarMensagem("Maior ou igual à 18 anos", "Resposta", 1);
        }else{
            t.mostrarMensagem("Menor que 18 anos", "Resposta", 1);
        }
    }
}

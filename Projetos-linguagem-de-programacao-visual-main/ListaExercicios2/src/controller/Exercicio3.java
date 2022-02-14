package controller;

import view.Tela;

/**
 *
 * @author luis_
 */
public class Exercicio3 {
    //Escreva um algoritmo que receba os valores dos lados de um triângulo.
    //- Se os três lados forem iguais, mostre: Triângulo Equilátero.
    //- Se apenas dois lados forem iguais, mostre: Triângulo Isóscele.
    //- Se nenhum dos lados forem iguais, mostre: Triângulo Escaleno.
    
    Tela t = new Tela();
    
    public void iniciarExercicio3(){
        double v1 = Double.parseDouble(t.informarDado("primeiro lado do triângulo"));
        double v2 = Double.parseDouble(t.informarDado("segundo lado do triângulo"));
        double v3 = Double.parseDouble(t.informarDado("terceiro lado do triângulo"));
        
        //Faz as comparações
        if(v1 == v2 && v2 == v3){
            t.mostrarMensagem("É um triângulo equilátero!", "Resposta", 1);
        }else if(v1 == v2 && v2 != v3){
            t.mostrarMensagem("É um triângulo Isóceles!", "Resposta", 1);
        }else if(v1 != v2 && v2 == v3){
            t.mostrarMensagem("É um triângulo Isóceles!", "Resposta", 1);
        }else if(v1 != v2 && v1 == v3){
            t.mostrarMensagem("É um triângulo Isóceles!", "Resposta", 1);
        }else {
            t.mostrarMensagem("É um triângulo Escaleno!", "Resposta", 1);
        }
        
    }
}

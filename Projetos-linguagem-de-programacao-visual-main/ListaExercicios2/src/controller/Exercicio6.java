package controller;

import view.Tela;

/**
 *
 * @author luis_
 */
public class Exercicio6 {
    //Escreva um algoritmo em JavaScript que receba uma região do país e informe o nome da região informada. 
    //Regiões: 1) Sul, 2) Sudeste, 3) Centro-Oeste, 4) Norte, 5) Nordeste.
    Tela t = new Tela();
    
    public void iniciarExercicio6(){
        int menu = Integer.parseInt(t.informarDado("número de acordo com a região:\n1 - Sul\n2 - Sudeste\n3 - Centro-Oeste\n4 - Norte\n5 - Norte"));
        
        switch(menu){
            case 1:
                t.mostrarMensagem("Região Sul", "Resposta", 1);
                break;
            case 2:
                t.mostrarMensagem("Região Sudeste", "Resposta", 1);
                break;
            case 3:
                t.mostrarMensagem("Região Centro-Oeste", "Resposta", 1);
                break;
            case 4:
                t.mostrarMensagem("Região Norte", "Resposta", 1);
                break;
            case 5:
                t.mostrarMensagem("Região Nordeste", "Resposta", 1);
                break;
            default:
                t.mostrarMensagem("Erro de digitação, digite uma opção válida!", "Errou", 0);
                break;
        }
    }
}

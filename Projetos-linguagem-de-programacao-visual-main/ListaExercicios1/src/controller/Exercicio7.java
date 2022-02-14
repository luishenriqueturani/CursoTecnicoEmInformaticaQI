package controller;

import view.Tela;
import view.TelaExercicios;

/**
 *
 * @author Luís Henrique
 */
public class Exercicio7 {
    //Uma sorveteria vende três tipos de picolés: o de fruta custa R$1,50, o de chocolate R$ 2,00 e o com recheio R$2,50. 
    //Escreva um algoritmo que receba a quantidade de picolés vendida de cada tipo e 
    //mostre quanto a sorveteria faturou por cada tipo de picolé e no total de vendas.
    Tela t = new Tela();
    TelaExercicios tE = new TelaExercicios();
    
    public void iniciarExercicio7(){
        boolean menu = true;
        double picFru = 1.5, picChoco = 2.0, picRech = 2.5;
        int venFru = 0, venChoco = 0, venRech = 0;
        
        //menu de loop
        while(menu){
            try {
                //chama a tela do menu atribuindo seu valor retornado pelo usuário na variável esc
                int esc = Integer.parseInt(tE.criaMenuE7());
                
                //valor da variável é usado nos cases, que forma o menu
                switch(esc){
                    case 0:
                        //fechar
                        if(t.confirmarFechar() == 0){
                            menu = false;
                            t.mostrarMensagem("Fechando o App...", "Fechando", 1);
                        }
                        break;
                    case 1:
                        //picolé fruta 1.5
                        int venFruTemp = 0;
                        venFruTemp = Integer.parseInt(t.informarDado("quanto deseja comprar"));
                        t.mostrarMensagem("Total a pagar: R$" + (venFruTemp*picFru), "A pagar", 1);
                        venFru += venFruTemp;
                        break;
                    case 2:
                        //picolé choco 2.0
                        int venChocoTemp = 0;
                        venChocoTemp = Integer.parseInt(t.informarDado("quanto deseja comprar"));
                        t.mostrarMensagem("Total a pagar: R$" + (venChocoTemp*picChoco), "A pagar", 1);
                        venChoco += venChocoTemp;
                        break;
                    case 3:
                        //picolé recheado 2.5
                        int venRechTemp = 0;
                        venRechTemp = Integer.parseInt(t.informarDado("quanto deseja comprar"));
                        t.mostrarMensagem("Total a pagar: R$" + (venRechTemp*picRech), "A pagar", 1);
                        venRech += venRechTemp;
                        break;
                    case 4:
                        //ver valores e vendas
                        t.mostrarMensagem("Totais do picolé de fruta, quantidade: " + venFru + " . Valor: R$ " + (venFru*picFru) +"\n"
                                + "Totais do picolé de Chocolate, quantidade: " + venChoco + " . Valor: R$ " + (venChoco*picChoco) +"\n"
                                + "Totais do picolé recheado, quantidade: " + venRech + " . Valor: R$ " + (venRech*picRech) +"\n"
                                + "Totais geral, quantidade " + (venChoco+venFru+venRech) + " . valor: R$ "
                                        + ((venFru*picFru)+(venChoco*picChoco)+(venRech*picRech)),
                                "Resultado", 1);
                        break;    
                    default:
                        t.mostrarMensagem("Erro de digitação, escolha uma opção válida!", "Errou", 0);
                        break;
                }
            } catch (Exception e) {
                t.mostrarMensagem("Erro de digitação! Digite apenas números!", "Errou", 0);
            }
        }
        
        
        
        
        
        
    }
}

package controller;

import view.Tela;

/**
 *
 * @author Luís Henrique
 */
public class Exercicio5 {
    //Escreva um algoritmo que receba um percentual de desconto e calcule esse desconto sobre o preço do produto, 
    //apresentando o valor do desconto e o novo preço do produto.
    Tela t = new Tela();
    
    public void iniciarExercicio5(){
        double prod = Double.parseDouble(t.informarDado("valor do produto"));
        double desc = Double.parseDouble(t.informarDado("desconto em %"));
        double vDes = (desc*100)/prod;
        t.mostrarMensagem("O valor do desconto é: "+vDes, "Resultado", 1);
        t.mostrarMensagem("O novo preço é: "+(prod-vDes), "Resultado", 1);
    }
}

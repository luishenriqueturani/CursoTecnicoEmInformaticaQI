package view;

import javax.swing.JOptionPane;

/**
 *
 * @author luis_
 */
public class TelaExercicios {
    
    
    //método do menu do exercício 7
    public String criaMenuE7(){
        //Cria a janela de escolhas do menu
        String menu = JOptionPane.showInputDialog(null,
                "Faça sua escolha:\n\n"
                        + "1 - Comprar picolé de Frutas, R$ 1.50\n"
                        + "2 - Comprar picolé de Chocolate, R$ 2.00\n"
                        + "3 - Comprar picolé Recheado, R$ 2.50\n"
                        + "4 - Ver o total das vendas\n"
                        + "0 - Sair",
                "Exercício 7", 
                JOptionPane.PLAIN_MESSAGE);
        
        return menu;
    }//fecha método do criaMenuE7
    
    
}

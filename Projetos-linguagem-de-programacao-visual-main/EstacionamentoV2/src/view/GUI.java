package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Luís Henrique && Fernando César
 */
public class GUI {
    String aux = "";
    
    //Confirma 
    public int confirmar(){
        int info = JOptionPane.showConfirmDialog(
                null, 
                "Tem certeza?", 
                "Tem certeza?", 
                JOptionPane.YES_NO_OPTION);
        
        return info;
    }//Fecha Confirmar
    //Cria tela para cadastro de dados no feminino
    public String informarDadoA(String tipo) { 
        
        aux = JOptionPane.showInputDialog(
                null,
                "Informe a " + tipo,
                "Informar dado", //Título
                JOptionPane.INFORMATION_MESSAGE);
               
        return aux;
    
    }// fecha informar dado a
    //cria mensagem
    public void criarMensagem(String msg,  String titulo, int icon){
        JOptionPane.showMessageDialog(null, msg, titulo, icon);
        /*
        LISTA DE ÍCONES
        
        -1 = PLAIN_MESSAGE
        0 = ERROR_MESSAGE
        1 = INFORMATION_MESSAGE
        2 = WARNING_MESSAGE
        3 = QUESTION_MESSAGE
        
        */
    }
}

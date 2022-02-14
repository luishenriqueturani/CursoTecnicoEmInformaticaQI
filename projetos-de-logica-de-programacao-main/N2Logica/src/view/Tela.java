package view;

import javax.swing.JOptionPane;

/**
 *
 * @author luis_
 */
public class Tela {
    
    
    //Cria o menu inicial em JOptionPane
    public String criarMenu(){
        return JOptionPane.showInputDialog(null,"1 - Ver vagas\n2 - Cadastrar\n3 - Dar a saída\n4 - Tabela de preços\n0 - Encerrar",
                "Cadastro de vagas", JOptionPane.PLAIN_MESSAGE);
    }//Fecha criarMenu()
    
    //Confirma fechamento
    public int confirmarFechar(){
        int info = JOptionPane.showConfirmDialog(
                null, 
                "Tem certeza?", 
                "Fechar o Sistema?", 
                JOptionPane.YES_NO_OPTION);
        
        return info;
    }//Fecha ConfirmarFechar
    
    //Cria tela para cadastro de dados
    public String informarDado(String tipo, String topo) { 
        
        return JOptionPane.showInputDialog(
                null,
                "Informe o " + tipo,
                "Informar "+topo, //Título
                JOptionPane.INFORMATION_MESSAGE);
    
    }// fecha informar dado
    
    //Mostrar informação
    public void mostrarMensagem(String msg, String titulo, int numIcone){
        /*
        LISTA DE ÍCONES
        
        -1 = PLAIN_MESSAGE
        0 = ERROR_MESSAGE
        1 = INFORMATION_MESSAGE
        2 = WARNING_MESSAGE
        3 = QUESTION_MESSAGE
        
        */
        
        JOptionPane.showMessageDialog(null, msg, titulo, numIcone);
        
    }//fecha mostrarMensagem
}

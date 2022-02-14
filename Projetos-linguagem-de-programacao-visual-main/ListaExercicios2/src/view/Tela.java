package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Luís Henrique
 */
public class Tela {
    String aux;
    
    //Criao menu do app
    public String criarMenu(){
     
        aux = JOptionPane.showInputDialog(
                null,
                "1. Exercício 1\n" + 
                "2. Exercício 2\n"+
                "3. Exercício 3\n"+
                "4. Exercício 4\n"+
                "5. Exercício 5\n"+
                "6. Exercício 6\n"+
                "7. Exercício 7\n"+
                "8. Exercício 8\n"+
                "9. Exercício 9\n"+
                "10. Exercício 10\n"+
                "0.Sair\n\n", //Mensagem
                "Lista de Exercícios", //Título
                JOptionPane.PLAIN_MESSAGE);
        
        return aux;
    }//fecha criar menu
    
    //Cria tela para cadastro de dados
    public String informarDado(String tipo) { 
        
        aux = JOptionPane.showInputDialog(
                null,
                "Informe o " + tipo,
                "Informar dado", //Título
                JOptionPane.INFORMATION_MESSAGE);
               
        return aux;
    
    }// fecha informar dado
    
    public String informarDadoA(String tipo) { 
        
        aux = JOptionPane.showInputDialog(
                null,
                "Informe a " + tipo,
                "Informar dado", //Título
                JOptionPane.INFORMATION_MESSAGE);
               
        return aux;
    
    }// fecha informar dado
    
    //Confirma fechamento
    public int confirmarFechar(){
        int info = JOptionPane.showConfirmDialog(
                null, 
                "Tem certeza?", 
                "Fechar o Sistema?", 
                JOptionPane.YES_NO_OPTION);
        
        return info;
    }//Fecha ConfirmarFechar
    
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

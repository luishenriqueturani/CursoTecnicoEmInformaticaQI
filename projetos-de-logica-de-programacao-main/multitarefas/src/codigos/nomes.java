package codigos;

/**
 *
 * @author Luís Henrique
 * @since 14/12/17
 */
import java.util.*;
public class nomes {
    Scanner s = new Scanner(System.in);
   
    //atributos
    String nomes[]= new String[5];
    


//listar
    public void listar(){
        
    
        for (int indice= 0; indice<nomes.length;indice++){
            
            System.out.print("["+nomes[indice]+"]\t\t");
        }//for    
    }//listar()
    
    //incerir
    public void inserir(){
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o/a "+(i+1)+"º nome: ");
            nomes[i]=s.next();
            
        }//for
    }//inserir()
    
    //apagar posição
    public void apagar_posicao(){
        
        System.out.print("Qual posição você deseja apagar o nome? ");
        nomes[s.nextInt()] = null;
    
    }//apagar posição
    
    //apagar tudo
    public void apagar_tudo(){
        System.out.print("Deseja realmente apagar todos os nomes? ");
        String resposta = s.next();
        if (resposta.equals("sim")){
            for (int i = 0; i < nomes.length; i++) {
                nomes[i]= null;
            }
            
            System.out.println("Apagado com sucesso!");
        }
    
    
    }//apagar tudo   
    
    //alterar
    public void alterar(){
        System.out.println("Qual posição você deseja alterar? ");
        int posicao = s.nextInt();
        System.out.println("Qual é o novo nome? ");
        nomes[posicao]=s.next();
        System.out.println("Nome alterado com sucesso!");
    
    }//alterar
    
    //listar elemento pela posição
    public void lstar_pela_posicao(){
        System.out.print("Qual a posição desejada? ");
        int posicao = s.nextInt();
        System.out.println(nomes[posicao]);
        
    }//listar elemento pela posição
    
    
    public void verificar(){
        System.out.println("Qual nome deseja procurar? ");
        String nome = s.next();
        for (int i = 0; i < nomes.length; i++) {
             if(nomes[i].equals(nome)){
                 System.out.println("Achei o "+nome+" na posição "+i+".");
                 break;
             }
             else{System.out.println("Não achei nada na posição "+i+".");}
            }
    }   
}

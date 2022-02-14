package codigos;

/**
 *
 * @author Luís Henrique
 * @since 14/12/17
 */
import java.util.*;
public class executor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        tabuada t = new tabuada();
        nomes n = new nomes();
        hotel h = new hotel();
        jogo_de_dados d = new jogo_de_dados ();
        perguntas p = new perguntas();
        notas not = new notas();
        onibus o = new onibus();
        
    //menu
        String volta="Sim";
        int opcao, opcao2;
        do{
        System.out.println("Digite\n(1)-Para tabuada:\n(2)-Listagem de nomes:\n(3)-Cálculos de estadia em hotel:\n(4)-Jogo de Dados:\n(5)-Responder 10 perguntas:\n(6)-Para fazer um cálculo de notas:\n(7)-Escolha de lugar em ônibus de viagens:");
        System.out.print("Digite aqui: ");
        opcao = s.nextInt();
        switch(opcao){
            //tabuada
            case 1:
                t.tabuada();break;
            //listagem dos nomes
            case 2:
                System.out.println("Escolha a sua opção entre\n(1)-Incerir\n(2)-Listar\n(3)-Apagar\n(4)-Alterar\n(5)-Apagar todos os nomes\n(6)-Listar apenas de uma posição\n(7)-Verificar se nome está na lista");
                System.out.print("Digite aqui: ");
                opcao2= s.nextInt();
            
                switch(opcao2){
                    case 1:
                        n.inserir();
                    break;
                    case 2:
                        n.listar();
                    break;    
                    case 3:
                        n.apagar_posicao();
                        System.out.println("Nome apagado com sucesso!");
                    break;    
                    case 4:
                        n.alterar();
                        System.out.println("Nome alterado com sucesso!");
                    break;  
                    case 5:
                        n.apagar_tudo();
                    break;
                    case 6:
                        n.lstar_pela_posicao();
                    break;
                    case 7:
                        n.verificar();
                    break;
                    default:  
                        System.out.println("Digitação errada!");
                } 
                break;
            //hotel
            case 3:
                h.hotel();
            break;    
            //Jogo de Dados
            case 4:
                d.dados();
            break;
            //perguntas
            case 5:
                p.perguntas();
            break;
            //notas
            case 6:
                not.notas();
            break;
            //ônibus
            case 7:
                o.onibus();
            break;
            //digitação errada
            default:
                System.out.println("Digitação errada.");
        
        }
        System.out.println("\nNova operação?");
        System.out.print("Digite aqui: sim ou não: ");
        volta= s.next();
        }while(volta.equals("Sim")||volta.equals("sim"));    
    }
    
}

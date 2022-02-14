package codigos;

/**
 *
 * @author Luís Henrique
 * @since 14/12/17
 */
import java.util.*;
public class jogo_de_dados {
    public void dados(){
        Random random=new Random();
        Scanner leia=new Scanner(System.in);
        
        String rodada;
        float creditUSU, creditCPU, apUSU, apCPU;
        int somaddUSU, somaddCPU;
        
        
        //Início
        System.out.println("Bom vindo");
        //créditos
        System.out.print("Digite aqui seus Créditos iniciais: ");
        creditUSU= leia.nextFloat();
        creditCPU= creditUSU;
        System.out.println("Você depositou "+creditUSU+" de créditos. O computador começa com o mesmo valor.");
        
        System.out.print("Você está pronto? ");
        rodada= leia.next();
        
        //rodada
        while((rodada.equals("sim"))||(rodada.equals("Sim"))){
                    
        //aposta
        System.out.print("Digite o valor da aposta: ");
        apUSU= leia.nextFloat();
        apCPU= apUSU;
        
        //condição para que a aposta seja menor que os créditos
        while(apUSU>creditUSU){
            System.out.print("O valor da aposta não pode ser maior que o valor do seu crédito, digite novamente: ");
            apUSU= leia.nextFloat();
            apCPU= apUSU;}
        
        // Dados
        int du1=random.nextInt(6)+1;
        int du2=random.nextInt(6)+1;
        int dc1=random.nextInt(6)+1;
        int dc2=random.nextInt(6)+1;
        
        //Soma dos dados
        somaddUSU=du1+du2;
        somaddCPU=dc1+dc2;
        
        //print dos dados
        System.out.println("Dado número 1 do jogador: "+du1+"\nDado número 2 do jogador: "+du2);
        System.out.println("Dado número 1 do computador: "+dc1+"\nDado número 2 do computador: "+dc2);
        System.out.println("Soma dos dados do jogador: "+somaddUSU+"\nSoma dos dados do computador: "+somaddCPU);
        
        if(somaddUSU>somaddCPU){
            creditUSU=apUSU+creditUSU;
            creditCPU=creditCPU-apCPU;
            System.out.println("O vencedor da rodada foi o jogador. Seus créditos atuais são: "+creditUSU+"\nOS creditos do computador são: "+creditCPU);
        }
        else if ((somaddUSU)==(somaddCPU)){
            System.out.println("Houve um empate");
        }
        else{
            creditUSU=creditUSU-apUSU;
            creditCPU=creditCPU+apCPU;
            System.out.println("O vencedor da rodada foi o computador. Seus créditos atuais são: "+creditUSU+"\nOS creditos do computador são: "+creditCPU);
        }
        
            System.out.print("Deseja jogar novamente, seus créditos são "+creditUSU+"? ");
            rodada= leia.next();
            if(creditUSU<1){
                System.out.println("Seus creditos são insuficientes");
                rodada="nao";
            }
        
        
        }//fim do while rodada
        System.out.println("Obrigado por ter jogado. \nSeus créditos finais são: "+creditUSU);
    }
}

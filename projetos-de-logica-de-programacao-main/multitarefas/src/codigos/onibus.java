package codigos;

/**
 *
 * @author Luís Henrique
 * @since 21/12/17
 */
import java.util.*;
public class onibus {
    public void onibus(){
    Scanner s=new Scanner(System.in);
        float vp=40.5f;
        String rep, nome;
        int cont=0;
        String lugares[][]=new String[5][7];
        
        
        System.out.print("Digite seu nome: ");
        nome=s.next();
        do{
        System.out.println("Cada passagem custa R$ 40,50.\nEscolha seu lugar para sentar: ");
        
        for (int linha = 0; linha < 5 ; linha++) {
            do{
            System.out.print("Digite a linha do assento de 0 a 4: ");
            linha=s.nextInt();
            if(linha==2){System.out.println("Não é possível selecionar esta linha pois é o corredor.");}
            }while(linha==2);           
            for (int coluna = 0; coluna < 7; coluna++) {
                do {                    
                    System.out.print("Digite a coluna do seu assento de 1 a 6: ");
                    coluna=s.nextInt();
                    if(coluna==0){System.out.println("Não há acento nesta coluna.");}
                } while (coluna==0);
                System.out.print("Quem sentará aqui? ");
                lugares[linha][coluna]=s.next();
            break;   
            }
        break;
        }
        lugares[1][0]="Porta";lugares[0][0]="Porta";
        lugares[3][0]="Motorista";lugares[4][0]="Motorista";
        lugares[2][0]="Corredor";lugares[2][1]="Corredor";lugares[2][2]="Corredor";lugares[2][3]="Corredor";lugares[2][4]="Corredor";
        lugares[2][5]="Corredor";lugares[2][6]="Corredor";
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 7; coluna++) {
                System.out.print("["+lugares[linha][coluna]+"] ");
                
            }
            System.out.println("");
        }
            System.out.println("Deseja comprar nova passagem? ");
            rep=s.next();
            cont++;
        }while((rep.equals("sim"))||(rep.equals("Sim")));
        
        System.out.println(nome+" o custo das passagens será: R$ "+(vp*cont));
        
    }
}

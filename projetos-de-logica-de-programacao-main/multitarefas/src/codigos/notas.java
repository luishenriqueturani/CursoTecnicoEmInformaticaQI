package codigos;

/**
 *
 * @author Luís Henrique
 * @since 14/12/17
 */
import java.util.*;
public class notas {
    public void notas(){
    Scanner s = new Scanner(System.in);
        
        int n1, calculo;
        int n2[]={0,1,2,3,4,5,6,7,8,9,10};
        int n3[]={10,9,8,7,6,5,4,3,2,1,0};
        int cont=0;
        int cont2=0;
        System.out.print("Digite a sua nota: ");
        n1=s.nextInt();
        while(n1<0||n1>10){
            System.out.println("Nota digitada errada! Tente denovo.");
            System.out.print("Digite a sua nota: ");
            n1=s.nextInt();
        }          
        calculo= 12-n1;
        
        System.out.println("Notas para ser aprovado:");
        for (int i = 0; i < n2.length-calculo; i++) {
            System.out.print("["+(n2[calculo]+cont)+"] ");
            cont++;
        }
        
        System.out.println("\nNotas que te deixarão em recuperação:");
        for (int j = 0; j < n3.length-calculo; j++) {
            cont2++;
            System.out.print("["+(n3[calculo+cont2])+"] ");
            
        }
        
        
    }
}

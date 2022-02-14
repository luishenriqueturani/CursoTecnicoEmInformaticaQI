package codigos;

import java.util.Scanner;

/**
 *
 * @author Luís Henrique
 * @since 14/12/17
 */
public class tabuada {
    public void tabuada(){
    int volta=0;
        int num;
        
        Scanner leia=new Scanner(System.in);
        
        System.out.print("Escolha qual tabuada você deseja: ");
        num=leia.nextInt();
        while (volta<=10){
            System.out.println(num+" X "+volta+" = "+(num*volta));
        volta++;
        }

    }
}

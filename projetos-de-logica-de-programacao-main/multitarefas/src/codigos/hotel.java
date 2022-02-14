package codigos;

import java.util.Scanner;

/**
 *
 * @author Luís Henrique
 * @since 14/12/17
 */

public class hotel {
    public void hotel(){
    
    String nome, quarto;
    double diaria, vdiaria, consumo, subtotal, taxa;
    Scanner leia=new Scanner(System.in);
    
    // Nome do hóspede
        System.out.print("Digite seu nome: ");
        nome= leia.next();
    // Tipo de quarto
        System.out.print("Digite seu tipo de quarto, (A)-para Luxo, (B)-Para semi-luxo, (C)-normal e (D)-barato: ");
        quarto= leia.next();
       
        // Número de diárias
        System.out.print("Digite seu número de diárias: ");
        diaria= leia.nextFloat();
    // Valor do consumo interno
        System.out.print("Digite o valor do seu consumo interno: R$ ");
        consumo=  leia.nextFloat();
        
        switch(quarto){
            case "A":
                vdiaria= 150;
                subtotal= (diaria*vdiaria)+consumo;
        
                taxa= subtotal*0.1;
    
                System.out.println("Nome do hóspede: "+nome);
                System.out.println("Tipo de quarto usado: "+quarto);
                System.out.println("Número de diárias: "+diaria);
                System.out.println("Valor unitário da diária: R$ "+vdiaria);
                System.out.println("Valor total da diária: R$ "+(diaria*vdiaria));
                System.out.println("O subtotal é: R$ "+subtotal);
                System.out.println("Valor da taxa de serviço: R$ "+taxa);
                System.out.println("Total: R$ "+(subtotal+taxa));
                break;    
            case "B":
                vdiaria= 100;
                subtotal= (diaria*vdiaria)+consumo;
        
                taxa= subtotal*0.1;
    
                System.out.println("Nome do hóspede: "+nome);
                System.out.println("Tipo de quarto usado: "+quarto);
                System.out.println("Número de diárias: "+diaria);
                System.out.println("Valor unitário da diária: R$ "+vdiaria);
                System.out.println("Valor total da diária: R$ "+(diaria*vdiaria));
                System.out.println("O subtotal é: R$ "+subtotal);
                System.out.println("Valor da taxa de serviço: R$ "+taxa);
                System.out.println("Total: R$ "+(subtotal+taxa));
                break;    
            case "C":
                vdiaria= 75;
                subtotal= (diaria*vdiaria)+consumo;
        
                taxa= subtotal*0.1;
    
                System.out.println("Nome do hóspede: "+nome);
                System.out.println("Tipo de quarto usado: "+quarto);
                System.out.println("Número de diárias: "+diaria);
                System.out.println("Valor unitário da diária: R$ "+vdiaria);
                System.out.println("Valor total da diária: R$ "+(diaria*vdiaria));
                System.out.println("O subtotal é: R$ "+subtotal);
                System.out.println("Valor da taxa de serviço: R$ "+taxa);
                System.out.println("Total: R$ "+(subtotal+taxa));
                break;    
            case "D":    
                vdiaria= 50;
                subtotal= (diaria*vdiaria)+consumo;
        
                taxa= subtotal*0.1;
    
                System.out.println("Nome do hóspede: "+nome);
                System.out.println("Tipo de quarto usado: "+quarto);
                System.out.println("Número de diárias: "+diaria);
                System.out.println("Valor unitário da diária: R$ "+vdiaria);
                System.out.println("Valor total da diária: R$ "+(diaria*vdiaria));
                System.out.println("O subtotal é: R$ "+subtotal);
                System.out.println("Valor da taxa de serviço: R$ "+taxa);
                System.out.println("Total: R$ "+(subtotal+taxa));
                break;
            default:
                System.out.print("ERRO na digitação. Verifique se digitou em maiúsculo ou se digitou a letra certa.");
                System.exit(0);
        }// fim Switch
    
    }
}

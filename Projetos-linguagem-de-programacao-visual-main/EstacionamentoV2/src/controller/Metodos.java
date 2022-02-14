package controller;

/**
 *
 * @author luis_
 */
public class Metodos {
    private final double PRECOHORA = 5;
    private final double PRECO12HORAS = 57;
    private final double PRECO15HORAS = 62;
    private int hora;
    private double pagar;
    
    public int stringToInt(String string){
        int inteiro = Integer.parseInt(string);
        return inteiro;
    }
    
    public double pagar(int horaEntrada, int horaSaida){
        hora = horaSaida - horaEntrada;
        
        if(hora >= 15){
            pagar = PRECO15HORAS;
        }else if(hora >= 12){
            pagar = PRECO12HORAS;
        }else{
            pagar = hora * PRECOHORA;
        }
        
        return pagar;
    }
    
    
}

package com.example.alunos.calculadora_de_descontos;

public class Calculadora {
    private double valor;
    private double desconto;

    public void setValor(double v){
        this.valor = v;
    }

    public void setDesconto(double d) {
        this.desconto = d;
    }

    public double totalDesconto(){
        return this.valor*(this.desconto/100);
    }

    public double totalPagar(){
        return this.valor-totalDesconto();
    }

    public String toString(){
        return "Desconto de: R$ "+this.totalDesconto()+"\nTotal a Pagar: R$ "+this.totalPagar();
    }
}

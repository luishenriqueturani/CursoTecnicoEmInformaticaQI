package com.example.alunos.transacao_bancaria;

public class Transacao {
    private float saldo = 10000;
    private float valor;
    private String control;




    public void setControl(String control) {

        this.control = control;
    }
    public String getControl(){

        return this.control;
    }
    public void setValor(float v) {

        this.valor = v;
    }
    public float poupanca(){

        return this.saldo = this.saldo+(this.saldo * 6/100);
    }

    public float corrente(){

        return this.saldo = this.saldo-(this.saldo * 12/100);
    }

    public String saque(){
        if(this.saldo<this.valor){
            return "Valor maior do que seu saldo.";
        }else {
            this.saldo -= this.valor;
            return "Saque realizado com sucesso.";
        }
    }
    public String deposito(){
        this.saldo += this.valor;
        return "Depósito realizado com sucesso.";
    }
    public String toString(){
        String resultado = "";
        if(control.equals("Depositar")){
            resultado = deposito();
        }else if(control.equals("Saque")){
            resultado = saque();
        }else if (control.equals("Saldo")){
            resultado = ""+getSaldo();
        }
        setValor(0);
        return resultado;
    }
    public float getSaldo( ){

        return this.saldo;
    }
}



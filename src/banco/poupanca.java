/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author IFSC
 */
public class poupanca {
    double saldo;
    double movimentacao;
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void deposita(){   
        saldo += movimentacao;
        System.out.println("novo saldo"+saldo);
    }
    public poupanca (){
        
    }
    public poupanca(double saldo, double movimentacao) {
        this.saldo = saldo;
        this.movimentacao = movimentacao;
    }
    public void saque (){       
        saldo -= movimentacao;
        System.out.println("novo saldo"+saldo);
    }
    public void extrato (){
        System.out.println(""+saldo);
    }
    
}

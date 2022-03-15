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
public class contaSalario {

    double saldo;
    double movimentacao;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(double movimentacao) {
        this.movimentacao = movimentacao;
    }

    public void deposita() {
        saldo += movimentacao;
        System.out.println("novo saldo" + saldo);
    }

    public void saque() {
        saldo -= movimentacao;
        System.out.println("novo saldo" + saldo);
    }

    public void extrato() {
        System.out.println("" + saldo);
    }

    public contaSalario(double saldo, double movimentacao) {
        this.saldo = saldo;
        this.movimentacao = movimentacao;
    }

    public contaSalario() {

    }
}

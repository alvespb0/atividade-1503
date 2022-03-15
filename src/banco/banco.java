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
public class banco {

    contaSalario[] conta;
    poupanca[] poupanca;
    int numConta = 1;
    int numpoupanca = 1;

    public contaSalario[] getConta() {
        return conta;
    }

    public void setConta(contaSalario[] conta) {
        this.conta = conta;
    }

    public poupanca[] getPoupanca() {
        return poupanca;
    }

    public void setPoupanca(poupanca[] poupanca) {
        this.poupanca = poupanca;
    }

    public void iniciabanco() {
        conta = new contaSalario[100];
        poupanca = new poupanca[100];

    }

    public void abreconta() {
        conta[numConta] = new contaSalario[100];
    }

    public void abrepoupanca() {

    }

    public void encerraconta() {

    }
}

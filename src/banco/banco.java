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
    int numConta ;
    int numpoupanca;
    //contaSalario c1;

    /*public banco(contaSalario c1) {
        this.c1 = c1;
        c1.deposita();
        c1.getSaldo();
    }*/

    public void iniciabanco() {
        conta = new contaSalario[100];
        poupanca = new poupanca[100];
        numConta = 1;
        numpoupanca = 1;
    }

    public void abreconta() {
        conta[numConta] = new contaSalario();
        numConta ++;
    }

    public void abrepoupanca() {
        poupanca[numpoupanca] = new poupanca ();
        numpoupanca ++;
    }

    public void encerraconta() {
        for (int i = 1; i >=100; i++){
            conta[i] = null;
            poupanca[i]= null;
                    
        }
    }
}

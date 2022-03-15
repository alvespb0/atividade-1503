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
public class principal {
    public static void main(String[] args) {
        contaSalario c1 = new contaSalario (100, 10);
        banco b1 = new banco ();
        b1.iniciabanco();
        b1.abreconta();
        b1.abrepoupanca();
        b1.conta[1].setMovimentacao(100);
        b1.conta[1].deposita();
        System.out.println(b1.conta[1].getSaldo());
        b1.conta[1].getMovimentacao();
        System.out.println(b1.conta[1].getMovimentacao());
        
    }
    
}

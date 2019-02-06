
package calculoimc;

import javax.swing.JFrame;
import telas.PainelPrincipal;


public class CalculoImc {

    public static void main(String[] args) {
        JFrame janela =  new JFrame("calculadora de Palmitos");
        PainelPrincipal painel = new PainelPrincipal();
        
        //definir os atributos da tela
        janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
        janela.setSize(500, 550);
        janela.add(painel);
        janela.setVisible(true);
    }
    
}
 

package hora_idioma_tamanho_sistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;


public class Hora_Idioma_tamanho_Sistema {

    public static void main(String[] args) {
         //CAPTURANDO A HORS DO SITEMA
        Date relogio = new Date();
        System.out.print("A hora do sistema é ");
        System.out.println(relogio.toString());
        //CAPTURANDO O IDIOMA DO SITEMA
        Locale loc = Locale.getDefault();
        System.out.print("O idioma  sistema é ");
        System.out.println (loc.getDisplayLanguage()); 
        //CAPTURANDO A RESOLUCAO DA TELA
        Toolkit tk = Toolkit.getDefaultToolkit();  
        Dimension d = tk.getScreenSize();  
        System.out.println("A resolução do seu sistema é: " + d.width +" X " + d.height); 
    }
    
}

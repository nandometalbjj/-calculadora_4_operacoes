/* CTRL+BARRA DE ESPACO = PARA EVOCAR
   SOUT+TAB = System.out.println
   PSVM+TAB = public static void main
*/
package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // DECLARACAO DE VARIAVEIS
        int n1, n2, op;
        float total;
        
        //CRIACAO E INSTANCIA DO OBJETO CLASSE SCANNER
        Scanner entrada = new Scanner(System.in);
        
        //APRESENTACAO
        System.out.println("\n\t\t\t***PROGRAMA CALCULADORA***\n");
        
        //MENU
        System.out.println("[1]-SOMA");
        System.out.println("[2]-SUBTRACAO");
        System.out.println("[3]-MULTIPLICACAO");
        System.out.println("[4]-DIVISAO");
        System.out.print("OPCAO: ");
        op = entrada.nextInt();
        
        if(op==1){
        
            //ENTRADA DE DADOS
            System.out.println("\nSOMA");
            System.out.print("DIGITE UM NUMERO: ");
            n1 = entrada.nextInt();
            System.out.print("DIGITE OUTRO NUMERO: ");
            n2 = entrada.nextInt();
        
            //PROCESSAMENTO
            total = n1+n2;
        
            //SAIDA DE DADOS
            System.out.println("\nA SOMA DOS NUMEROS INFORMADOS É: " + n1 + "+" + n2 + "= " + total); 
        } 
        else if(op==2){
              //ENTRADA DE DADOS
            System.out.print("\nSUBTRACAO");
            System.out.print("DIGITE UM NUMERO: ");
            n1 = entrada.nextInt();
            System.out.print("DIGITE OUTRO NUMERO: ");
            n2 = entrada.nextInt();
        
            //PROCESSAMENTO
            total = n1-n2;
        
            //SAIDA DE DADOS
            System.out.println("\nA SOMA DOS NUMEROS INFORMADOS É: " + n1 + "-" + n2 + "=" + total); 
       }
        else if(op==3){
            //ENTRADA DE DADOS
            System.out.println("\nMULTIPLICACAO");
            System.out.print("DIGITE UM NUMERO: ");
            n1 = entrada.nextInt();
            System.out.print("DIGITE OUTRO NUMERO: ");
            n2 = entrada.nextInt();
            
            //PROCESSAMENTO
            total = n1*n2;
             
            //SAIDA DE DADOS
            System.out.println("\nA SOMA DOS NUMEROS INFORMADOS É: " + n1 + "x" + n2 + "= " + total);
        }
        else if(op==4){
            //DIVISAO  
            System.out.println("\nDIVISAO");
            System.out.print("DIGITE UM NUMERO: ");
            n1 = entrada.nextInt();
            System.out.print("DIGITE OUTRO NUMERO:");
            n2 = entrada.nextInt();
            
            //PROCESSAMENTO
            total = n1/n2;
                
            //SAIDA DE DADOS
            System.out.println("\nA DIVISAO DOS NUMEROS INFORMADOS É: " + n1 + "/" + n2  + "= " + total);
                        
        }
        else{
            System.out.println("OPCAO ERRADA! DIGITE A OPCAO 1 OU 2.");
        }
    } 
}

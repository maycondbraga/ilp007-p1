/* Camila Rocha Massoli RA: 20200395
Maycon Douglas Braga dos Santos RA: 20200484 */

import java.util.Scanner;

public class ProvaP1Questao01 {
  public static void main(String[] args) {
      Divida novaDivida;
      Scanner input = new Scanner(System.in);
      
      System.out.println("\n---------------------");
      System.out.println("Calculadora de Divida\n");

      try {

         System.out.println("Valor da divida: ");
         double valor = input.nextDouble();
         
         System.out.println("Taxa de juros: ");
         double taxaDeJuros = input.nextDouble();
         
         System.out.println("Total de parcelas:  ");
         int totalDeParcelas = input.nextInt();            
         
         novaDivida = new Divida(valor, taxaDeJuros, totalDeParcelas);
         System.out.println(novaDivida.toString());
      }
      catch (Exception ex) {
         System.out.printf("Erro durante a emissao da divida: %s \n", ex.getMessage());
         System.out.printf("Finalizando programa...");
      }

      input.close();
  }
}
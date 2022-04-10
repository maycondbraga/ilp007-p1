//
//Maycon Douglas Braga dos Santos RM: 20200484

import java.util.Scanner;

public class ProvaP1Questao01
{
  public static void main(String[] args) 
  {
      Divida novaDivida;
      boolean dividaValida = false;
      Scanner input = new Scanner(System.in);
      
      do
      {
         System.out.println("\n---------------------");
         System.out.println("Calculadora de Divida\n");

         try
         {

            System.out.println("Valor da divida: ");
            double valor = input.nextDouble();
            
            System.out.println("Taxa de juros: ");
            double taxaDeJuros = input.nextDouble();
            
            System.out.println("Total de parcelas:  ");
            int totalDeParcelas = input.nextInt();            
            
            novaDivida = new Divida(valor, taxaDeJuros, totalDeParcelas);
            System.out.println(novaDivida.toString());
            dividaValida = true;
         }
         catch (Exception ex)
         {
            System.out.println("Erro durante a emissao da divida: " + ex.getMessage());
            dividaValida = true;
         }
      }
      while (!dividaValida);

      input.close();
  }
}
//
//Maycon Douglas Braga dos Santos RM: 20200484

import java.util.Scanner;

public class ProvaP1Questao02 {
    public static void main(String[] args) {
        boolean continuaTestando = true;
        Scanner inputPrincipal = new Scanner(System.in);

        do {
            System.out.printf("\n\n-----------------------------------\n");
            System.out.printf("Software: Pontos no Eixo Cartesiano\n");
            
            try{
                System.out.println("\nDigite o número para selecionar: \n1 - Calcular pontos no eixo \n2 - Sair\n");
                String escolhaUsuario = inputPrincipal.next();
                
                switch (tryParseInt(escolhaUsuario, 100)){
                    case 1:
                        int totalDePontos = 0;

                        System.out.println("\nQuantos pontos deseja calcular?\n");
                        try{
                            if (inputPrincipal.hasNext()){
                                totalDePontos = inputPrincipal.nextInt();
                            }
                
                            for (int contador = 1; contador <= totalDePontos; contador++){
                                double x, y;
                                
                                System.out.printf("\n--------------------------------");
                                System.out.printf("\n%do ponto. Digite o valor de x: ", contador);
                                x = inputPrincipal.nextDouble();
                
                                System.out.printf("\n%do ponto. Digite o valor de y: ", contador);
                                y = inputPrincipal.nextDouble();
                
                                if (x == 0 && y == 0) {
                                    System.out.printf("\n%do ponto. A coordenada %.2f, %.2f pertence a ORIGEM\n", contador, x, y);
                                } else if (x == 0 && y != 0) {
                                    System.out.printf("\n%do ponto. A coordenada %.2f, %.2f pertence ao EIXO Y\n", contador, x, y);
                                } else if (x != 0 && y == 0) {
                                    System.out.printf("\n%do ponto. A coordenada %.2f, %.2f pertence ao EIXO X\n", contador, x, y);
                                } else if (x > 0 && y > 0) {
                                    System.out.printf("\n%do ponto. A coordenada %.2f, %.2f pertence ao QUADRANTE - 1\n", contador, x, y);
                                } else if (x < 0 && y > 0) {
                                    System.out.printf("\n%do ponto. A coordenada %.2f, %.2f pertence ao QUADRANTE - 2\n", contador, x, y);
                                } else if (x <0 && y < 0) {
                                    System.out.printf("\n%do ponto. A coordenada %.2f, %.2f pertence ao QUADRANTE - 3\n", contador, x, y);
                                } else if (x > 0 && y < 0) {
                                    System.out.printf("\n%do ponto. A coordenada %.2f, %.2f pertence ao QUADRANTE - 4\n",contador, x, y);
                                }
                
                                System.out.printf("--------------------------------\n");
                            }
                        }
                        catch (Exception ex){
                            System.out.printf("\nErro durante o processamento: %s.\n", ex.getMessage());
                        }

                        System.out.println("\nDeseja continuar? \n1 - Sim \n2 - Não\n");

                        String voltaInicio = "";
                        if (inputPrincipal.hasNext()){
                            voltaInicio = inputPrincipal.next();
                        }
                        
                        if (tryParseInt(voltaInicio, 100) == 1){
                            System.out.println("\nVoltando para inicio...\n");
                        }
                        else if (tryParseInt(voltaInicio, 100) == 2){
                            continuaTestando = false;
                            System.out.println("\nSaindo...\n");
                        }
                        else{
                            System.out.printf("\nComando %s invalido. Finalizando programa.\n", voltaInicio);
                            continuaTestando = false;
                        }

                        break;
                    case 2:
                        continuaTestando = false;
                        System.out.println("\nSaindo...\n");
                        break;
                    default:
                        System.out.printf("\nComando %s invalido. Tente novamente.\n", escolhaUsuario);
                }
            }
            catch (Exception ex){
                System.out.printf("\nErro durante o processamento. Erro: \n %s\n", ex.getMessage());
                continuaTestando = false;
                System.out.println("\nSaindo...\n");
            }
        }
        while (continuaTestando);
        
        inputPrincipal.close();
    }

    public static int tryParseInt(String valor, int valorPadrao) {
        try {
            return Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            return valorPadrao;
        }
    }
}
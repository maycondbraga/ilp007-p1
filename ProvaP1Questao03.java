/* Camila Rocha Massoli RA: 20200395
Maycon Douglas Braga dos Santos RA: 20200484 */

public class ProvaP1Questao03{
    public static void main(String[] args) {
        System.out.println("Criando 1o baú:\n");
        
        Bau bau1 = new Bau(25, 25, 25);
        System.out.println("1o Bau SEM modificação:" + bau1);
        bau1.openBau();
        bau1.setLargura(40);
        bau1.setAltura(20);
        bau1.setProfundidade(60);
        System.out.println("\n1o Bau COM modificação:" + bau1);

        System.out.println("\n----------------------");

        System.out.println("\nCriando 2o baú:\n");
        Bau bau2 = new Bau(30, 30, 30, "Azul");
        System.out.println("2o Bau SEM modificação:" + bau2);
        bau2.setLargura(40);
        bau2.paintBau("Rosa");
        bau2.openBau();
        bau2.closeBau();
        System.out.println("\n2o Bau COM modificação:" + bau2);
    }
}
/* Camila Rocha Massoli RA: 20200395
Maycon Douglas Braga dos Santos RA: 20200484 */

public class ProvaP1Questao03{
    public static void main(String[] args) {
        Bau bau1 = new Bau(25,25,25);
        Bau bau2 = new Bau(30,30,30,"Azul");

        bau1.openBau();
        bau1.closeBau();
        bau1.setPeso(40);
        bau1.setProfundidade(60);
        bau1.setAltura(20);
        System.out.println(bau1);
        System.out.println(bau2);

        bau1.paintBau("Azul");
        bau1.openBau();
        bau1.paintBau("Rosa");
        System.out.println(bau1);
        System.out.println(bau2);
    }
}
/* Camila Rocha Massoli RA: 20200395
Maycon Douglas Braga dos Santos RA: 20200484 */

public class Bau {
    private double altura;
    private double peso;
    private double profundidade;
    private String cor;
    private boolean aberto;

    public Bau(double peso, double altura, double profundidade) {
        setPeso(peso);
        setAltura(altura);
        setProfundidade(profundidade);
        cor ="Marrom";
        aberto =false;
    }

    public Bau(double peso, double altura, double profundidade, String cor) {
        setPeso(peso);
        setAltura(altura);
        setProfundidade(profundidade);
        this.cor = cor;
        aberto =false;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura < 0){
            System.out.println("A altura nao pode ser menor que 0!");
            System.exit(1);
        }
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso < 0){
            System.out.println("O comprimento deve ser maior ou igual a 0!");
            System.exit(1);
        }
        this.peso = peso;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        if(profundidade < 0){
            System.out.println("A profundidade deve ser maior ou igual a 0!");
            System.exit(1);
        }
        this.profundidade = profundidade;
    }

    public void openBau() {
        aberto = true;
    }

    public void closeBau() {
        aberto = false;
    }

    public void paintBau(String cor) {
        if (cor.length() < 3){
            System.out.println("A cor deve ter mais de 2 letras");
            System.exit(1);
        }
        this.cor = cor;
    }

    public String getAberto() {
        return aberto ?" Sim, o Bau esta aberto":" Nao, o Bau esta fechado! ";
    }

    @Override
    public String toString() {
        return "\n\nDimensoes do bau:\nAltura: "+getAltura()+"\nComprimento: "+getPeso()+"\nLargura: "+getProfundidade()+"\nCor: "+cor+"\nEsta aberto? "+getAberto();
    }
}

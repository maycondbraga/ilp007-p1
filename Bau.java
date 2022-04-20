/* Camila Rocha Massoli RA: 20200395
Maycon Douglas Braga dos Santos RA: 20200484 */

public class Bau {
    private double largura;
    private double altura;
    private double profundidade;
    private String cor;
    private boolean aberto;

    public Bau(double largura, double altura, double profundidade) {
        setLargura(largura);
        setAltura(altura);
        setProfundidade(profundidade);
        cor = "Marrom";
        aberto = false;
    }

    public Bau(double largura, double altura, double profundidade, String cor) {
        setLargura(largura);
        setAltura(altura);
        setProfundidade(profundidade);
        paintBau(cor);
        aberto = false;
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

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(largura < 0){
            System.out.println("O comprimento deve ser maior ou igual a 0!");
            System.exit(1);
        }
        this.largura = largura;
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
        return aberto ? " Sim, o Bau esta aberto!" : " Não, o Bau esta fechado!";
    }

    @Override
    public String toString() {
        return "\n\nDimensoes do bau:\nLargura: "+getLargura()+"\nAltura: "+getAltura()+"\nProfundidade: "+getProfundidade()+"\nCor: "+cor+"\nEsta aberto? "+getAberto();
    }
}

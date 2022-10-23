public class CarroDeCorrida {
    private Integer numeroCarro;
    private Piloto piloto;
    private float velocidadeMaxima;
    private float velocidadeAtual;
    private boolean ligado;

    public CarroDeCorrida(Integer numeroCarro, Piloto piloto, float velocidadeMaxima, float velocidadeAtual, boolean ligado) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.ligado = ligado;
    }

    public Integer getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(Integer numeroCarro) {
        this.numeroCarro = numeroCarro;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void acelerar(float aceleracao){
        if(ligado){
            velocidadeAtual += aceleracao;
            if (velocidadeAtual > velocidadeMaxima) {
                velocidadeAtual = velocidadeMaxima;
                System.out.println("O carro "+numeroCarro+" atingiu a velocidade máxima.\nA velocidade atual agora é de " + velocidadeAtual + "Km/h.");
            }else {
                System.out.println("A velocidade atual do carro "+numeroCarro+"agora é de " + velocidadeAtual + "Km/h.");
            }
        }else {
            System.out.println("O carro "+numeroCarro+" está desligado.");
        }
    }

    public void frear(float frenagem){
        if(ligado) {
            velocidadeAtual -= frenagem;
            if(velocidadeAtual <= 0){
                velocidadeAtual = 0;
                System.out.println("O carro "+numeroCarro+" parou.");
            }else {
                System.out.println("A velocidade atual do carro "+numeroCarro+" agora é de " + velocidadeAtual + "Km/h.");
            }
        }else {
            System.out.println("O carro "+numeroCarro+" está desligado.");
        }
    }

    public void parar(){
        velocidadeAtual = 0;
        System.out.println("O carro "+numeroCarro+" parou.");
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("O carro "+numeroCarro+" está ligado.");
    }

    public void desligar(){
        if(velocidadeAtual == 0){
            this.ligado = false;
            System.out.println("O carro "+numeroCarro+" está desligado.");
        }else {
            System.out.println("O carro "+numeroCarro+" não pode ser desligado em movimento.");
        }
    }

    @Override
    public String toString() {
        return "CarroDeCorrida:\n" +
                "NumeroCarro:" + numeroCarro + ";\n" +
                piloto + ";\n" +
                "VelocidadeMaxima:" + velocidadeMaxima + ";\n" +
                "VelocidadeAtual:" + velocidadeAtual + ";\n" +
                "Ligado:" + ligado + ";\n";
    }
}

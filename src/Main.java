public class Main {
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto("Pedro", 25, Sexo.MASCULINO, "Ferrari");
        CarroDeCorrida carro1 = new CarroDeCorrida(1,piloto1,240,0,false);
        System.out.println(carro1);
        carro1.acelerar(20);
        carro1.ligar();
        carro1.acelerar(20);
        carro1.acelerar(300);
        carro1.frear(100);
        carro1.parar();
        carro1.desligar();
        carro1.setVelocidadeMaxima(200);
        carro1.ligar();
        carro1.acelerar(210);
        carro1.frear(210);
        carro1.acelerar(50);
        carro1.desligar();
        carro1.parar();
        carro1.desligar();
    }
}
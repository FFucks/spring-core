package normal.java.models;

public class Carro {
    private Motor motor;

    public Carro() {
        this.motor = new Motor();
    }

    public void dirigir() {
        motor.ligar();
        System.out.println("Carro em movimento!");
    }
}

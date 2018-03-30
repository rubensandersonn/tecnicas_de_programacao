/* 
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    Classe concreta circulo que é uma figura.
 */

public class Circulo extends Figura{
    
    private double raio;
    private final double pi = 3.1416;
    
    public Circulo(){        

    }
    public Circulo(double x, double y){

        this.raio = 1.0;
        super.x = x;
        super.y = y;
    }
    public Circulo(double x, double y, double raio){
        this.raio = raio;
        super.x = x;
        super.y = y;
    }
    public double calcularArea(){
        return pi * raio * raio;
    }

    @Override
    public void desenhar(){

        super.desenhar();
        System.out.println("\tRaio: " + raio);
        System.out.println("\tArea: " + calcularArea());

    }

}
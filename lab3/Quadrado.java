/* 
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    Classe concreta quadrado que é uma figura.
 */

public class Quadrado extends Figura implements FiguraColorida{
    
    private double side;
    
    public Quadrado(){        

    }
    public Quadrado(double x, double y){

        this.side = 1.0;
        super.x = x;
        super.y = y;
    }
    public Quadrado(double x, double y, double side){
        this.side = side;
        super.x = x;
        super.y = y;
    }
    public double calcularArea(){
        return super.x * super.y;
    }

    @Override
    public void desenhar(){

        super.desenhar();
        System.out.println("\tTamanho do lado: " + side);
        System.out.println("\tArea: " + calcularArea());

    }

    public void desenharColorido(String cor){
        desenhar();
        System.out.println("\tCor: "+ cor);
    }

}
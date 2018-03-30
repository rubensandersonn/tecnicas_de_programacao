/* 
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    Classe abstrata Figura em 2D.
 */

public abstract class Figura{

    // Coordenadas da figura.
    protected double x = 0.0, y = 0.0;

    // Deve retornar a área da figura em u.a. Como cada figura é diferente, delegar esta tarefa é a melhor escolha
    public abstract double calcularArea();
    // Deve mover a figura para o ponto (dx,dy). Como cada figura é diferente, delegar esta tarefa é a melhor escolha
    public void mover(double dx, double dy){
        this.x = dx;
        this.y = dy;
    }
    
    public void desenhar(){
        System.out.println("=================="); 
        System.out.println(this.toString()); 
        System.out.println("Pos: " + x + ", " + y);
    }
}
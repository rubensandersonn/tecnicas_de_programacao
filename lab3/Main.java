import java.util.ArrayList;

import com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList;

/* 
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    Classe principal. Ela testa todo mundo.
 */

class Main{
    public static void main(String arg[]){
        // Chamando as funções alvo desta tarefa.
        System.out.println("\n\n===Tecnicas de Programacao/Lab 3: Figuras geometricas, heranca e interfaces!\n\tAutor: Rubens Anderson, 362984 - 2018.1\n===");
        Q3();
        Q5();
    }

    //Questão 3: Deve imprimir dois quadrados e dois circulos. Quadrado é colorido e circulo não é.
    public static void Q3(){

        System.out.println("\n==============QUESTAO 3===============");
        System.out.println("===Deve imprimir dois quadrados e dois circulos.\n===");
        Quadrado q1 = new Quadrado(1.0, 0.0, 2.0);
        Quadrado q2 = new Quadrado(4.0, 0.0, 2.0);
        Circulo c1 = new Circulo(10, 8.5, 3);
        Circulo c2 = new Circulo(6, 6.5, 2);
        
        q1.desenhar();
        q2.desenhar();
        
        c1.desenhar();
        c2.desenhar();
    }
    
    // Questao 5: 10 figuras mas deve imprimir somente as coloridas, que são os quadrados
    public static void Q5(){
        System.out.println("\n==============QUESTAO 5===============");
        System.out.println("===10 figuras, mas so deve imprimir as coloridas, que sao os quadrados\n===");
        String cores[] = {"BRANCO", "AZUL", "VERDE", "VERMELHO", "ROSA"};
        // ArrayList que armazena as figuras.
        ArrayList <Figura> shapes = new ArrayList<Figura>();

        // criando os objetos. Quadrado é colorido, e círculo não é.
        for(int i = 0; i < 5; i++){
            shapes.add(new Quadrado(i, i, 2));
        }
        for(int i = 5; i < 10; i++){
            shapes.add(new Circulo(i, i, 2));
        }

        for(int i = 0; i < 10; i++){
            if(shapes.get(i) instanceof FiguraColorida){
                FiguraColorida f = (FiguraColorida) shapes.get(i);
                f.desenharColorido(cores[i]);
            }
        }
    }
}

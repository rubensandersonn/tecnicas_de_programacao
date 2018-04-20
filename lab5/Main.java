/* 
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    Classe principal. Ela testa todo mundo.
 */

public class Main{
    public static void main(String[] args) {

        Operando o1 = new Operando(10);
        Operando o2 = new Operando(7);
        Operando o3 = new Operando(-3);
        Operando o4 = new Operando(0.5);
        DecoSeno seno = new DecoSeno(o4);
        DecoCos cosseno = new DecoCos(o4);
        Mult m = new Mult(o1, o2);
        Divisao d = new Divisao(m, o3);
        ObsPositive ob1 = new ObsPositive(m);
        ObsNonPositive ob2 = new ObsNonPositive(d);
        
        ObsPositive ob3 = new ObsPositive(seno);
        ObsNonPositive ob4 = new ObsNonPositive(cosseno);

        System.out.println("\n\n=== Tecnicas de Programacao/Lab 5: Padroes de projeto composite, decorator e observer!\n\tAutor: Rubens Anderson, 362984 - 2018.1\n===");
        // agora, mostrando os dados...
        System.out.println("== Dados:");
        System.out.println("\t== "+ o1.avaliar());
        System.out.println("\t== "+ o2.avaliar());
        System.out.println("\t== "+ o3.avaliar());
        System.out.println("\t== "+ o4.avaliar());
        
        System.out.println("== multiplicando o1 por o2:");
        System.out.println("\t== "+ m.avaliar());
        
        System.out.println("== dividindo m por o3:");
        System.out.println("\t== "+ d.avaliar());
        
        System.out.println("== seno de o4:");
        System.out.println("\t== "+ seno.avaliar());
        
        System.out.println("== cosseno de o4:");
        System.out.println("\t== "+ cosseno.avaliar());
        System.out.println();
    }
}
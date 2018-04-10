
/* 
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    Classe principal. Ela testa todo mundo.
 */

public class Main{
    public static void main(String[] args) {
        System.out.println("\n\n===Tecnicas de Programacao/Lab 4: Polimorfismo com contas bancarias!\n\tAutor: Rubens Anderson, 362984 - 2018.1\n===");
        Sistema s = new Sistema();
        s.criarConta(1);
        s.criarConta(2);
        s.criarConta(3);

        // aqui ha coercao pois creditar espera receber um double, mas eh passado um int
        for (int i = 0; i < 3; i++) {
            s.creditar(i, 1000);
        }
        // aqui ha coercao pois debitar espera receber um double, mas eh passado um int
        for (int i = 0; i < 3; i++) {
            s.debitar(i, 10);
        }

        System.out.println(s.show(0));
        System.out.println(s.show(1));
        System.out.println(s.show(2));
        
        System.out.println("=== saldo da conta 0 = 990? " + (s.consultarSaldo(0) == 990));
        System.out.println("=== saldo da conta 1 = 995? " + (s.consultarSaldo(1) == 995));
        System.out.println("=== saldo da conta 2 = 992.02? " + (s.consultarSaldo(2) == 992.02));


    }
}
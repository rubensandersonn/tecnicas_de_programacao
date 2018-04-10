/* 
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    Classe basic. sem beneficios.
 */

 public class ContaBasic extends ContaAbs{
    public ContaBasic(long id){
        super.tipo = "Basic";
        super.id = id;
    }
    
    // Polimorfismo de sobrecarga...
    public ContaBasic(double val, long id){
        super.saldo += val;
        super.id = id;
    }

    protected double bonus(double val){
        return 0;
    }
    protected double restituicao(double val){
        return 0;
    }
 }
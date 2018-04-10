/* 
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    Classe Plus.sem beneficios.
 */

 public class ContaPlus extends ContaAbs{
    public ContaPlus(long id){
        super.tipo = "Plus";
        super.id = id;
    }
    
    // Polimorfismo de sobrecarga...
    public ContaPlus(double val, long id){
        super.saldo += val;
        super.id = id;
    }

    protected double bonus(double val){
        return val*(0.5/100);
    }
    protected double restituicao(double val){
        return 0;
    }
 }
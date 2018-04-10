/* 
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    Classe Extreme. Mais top?
 */

 public class ContaExtreme extends ContaAbs{
    public ContaExtreme(long id){
        super.tipo = "Extreme";
        super.id = id;
    }
    
    // Polimorfismo de sobrecarga...
    public ContaExtreme(double val, long id){
        super.saldo += val;
        super.id = id;
    }

    protected double bonus(double val){
        return val*(0.2/100);
    }
    protected double restituicao(double val){
        return -val*(0.2/100);
    }
 }
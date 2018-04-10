
/* 
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    Classe principal. Ela eh a mae.
 */

 public abstract class ContaAbs{
    protected double saldo = 0;
    protected String tipo;
    protected long id;
        
    abstract protected double bonus(double val);
    abstract protected double restituicao(double val);
    
    public void depositar(double val){
        this.saldo+=(val + bonus(val));
    }
    
    public void debitar(double val){
        this.saldo-=(val + restituicao(val));
    }
    
    public double consultar(){
        return this.saldo;
    }
        
    // polimorfismo de inclusao 
    @Override 
    public String toString(){
        String r = "=== id:" + id + ", tipo:" + tipo + ", saldo:" + saldo;
        
        return r;
    }
 }
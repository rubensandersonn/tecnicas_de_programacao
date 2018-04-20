/*
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    Padrao composite, decorator e observer.
    composite: Divisao de duas expressoes
*/

class Divisao extends Operador{   
    
    public Divisao(Expression e1, Expression e2){
        super.e1 = e1;
        super.e2 = e2;
    }

    public double avaliar(){
        
        try{
            state  = super.e1.avaliar() / super.e2.avaliar();            
            notifyObs("\t==(Observando Divisao)=="); // o nesse caso eh o getState.
            return state;
        }catch(Exception e){
            System.err.println("O dividendo eh zero! (Divisao)");
            e.printStackTrace();
        }
        return 0;
    }
}
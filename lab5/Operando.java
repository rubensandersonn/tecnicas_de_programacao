/*
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    Padrao composite: leaf
*/

class Operando extends Expression{

    public Operando(double v){        
        state = v;
    }

    public double get(){
        return state;
    }

    public double avaliar(){
        return state;
    }
    
}
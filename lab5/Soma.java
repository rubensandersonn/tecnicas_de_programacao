/*
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    composite: soma duas expressoes
*/

class Soma extends Operador{

    public Soma(Expression e1, Expression e2){
        super.e1 = e1;
        super.e2 = e2;
    }
    public double avaliar(){
        state = super.e1.avaliar() + super.e2.avaliar();
        notifyObs("\t==(Observando  Soma)==");
        return state;
    }
}
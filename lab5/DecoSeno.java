/*
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    Decorator: sin
*/
import java.lang.Math;

class DecoSeno extends DecoExpression{
    public DecoSeno(Expression e1){
        super.e = e1;
    }

    public double avaliar(){
        state = Math.sin(super.e.avaliar());
        notifyObs("\t==(Observando  Seno)==");
        return state;
    }
}
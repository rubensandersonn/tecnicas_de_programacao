/*
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    Decorator: cos
*/
import java.lang.Math;

class DecoCos extends DecoExpression{
    public DecoCos(Expression e1){
        super.e = e1;
    }

    // state eh atributo da classe Observable
    public double avaliar(){
        state = Math.cos(super.e.avaliar());
        notifyObs("\t==(Observando  Cosseno)==");
        return state;
    }
}
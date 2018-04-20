/*
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    Padrao observer.
*/

import java.util.ArrayList;

abstract class Observer{
    protected Observable obs;
    double s;
    // coloquei uma mensagem para saber de onde vem o update
    abstract void update(String msg);
}
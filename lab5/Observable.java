/*
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    padrao observer: observable
*/

import java.util.ArrayList;

abstract class Observable{
    protected ArrayList<Observer> obsr = new ArrayList<Observer>();
    protected double state;

    public void notifyObs(String msg){
        for (Observer o : obsr) {
            o.update(msg);
        }
    }
    public void attach(Observer o){
        obsr.add(o);
    }
    public void dettach(Observer o){
        obsr.remove(o);
    }
    public void dettach(int o){
        obsr.remove(o);
    }
    public double getState(){
        return state;
    }
}
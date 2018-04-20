/*
    Universidade Federal do Ceará, 2018.1
    @Author: Rubens Anderson, 362984, Ciência da Computação
    @Version: 1.0

    observer: positivo
*/

class ObsPositive extends Observer{
    public ObsPositive(Observable o){
        obs = o;
        o.attach(this);
    }
    public void update(String msg){
        s = obs.getState();
        if(s > 0){
            System.out.println(msg + " resultado positivo");
        }
    }
}
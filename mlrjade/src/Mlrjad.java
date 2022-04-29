import jade.core.Agent;
import jade.core.behaviours.*;

public class Mlrjad extends Agent {
    private guis gui;
    @Override
    protected void setup() {
        System.out.println("Inica el agente " + getLocalName());
        Dataset dat = new Dataset();
        dat.datos();
        gui = new guis(this);
        gui.showGui();
    }

    public void  res(double x1, double x2) {
        System.out.println("-Agente activado-");
        addBehaviour(new Behaviour(){
            boolean end=false;
            @Override
            public void action(){

                resultado r = new resultado();
                System.out.printf("El resultado es: %.4f\n",r.yhat(x1,x2));
                end =true;
            }

            public boolean done() {
                if (end==true){
                    return true;
                }
                else{
                    return false;
                }
            }

            public int onEnd(){
                System.out.println("-Agente muriendo-");
                myAgent.doDelete();
                return super.onEnd();
            }
        });


    }

}



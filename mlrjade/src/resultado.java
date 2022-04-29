public class resultado {
    Operaciones o = new Operaciones();
    public double yhat(double date1, double date2){
        double Yhat=0;

        System.out.printf("Y=b0 + b1 * x1+ b2 * x2\n");
        System.out.printf("y=%.4f + %.4f * %.4f+ %.4f * %.4f \n",o.beta0(),o.beta1(),date1,o.beta2(),date2);
        Yhat=o.beta0() + o.beta1() * date1+ o.beta2() * date2;
        return Yhat;
    }

}

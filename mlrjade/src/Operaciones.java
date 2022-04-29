public class Operaciones {
Matrix mat = new Matrix();
    double[][] mds=mat.matrix();
    double[][] mb0=mat.matrix2();
    double[][] mb1=mat.matrix3();
    double[][] mb2=mat.matrix4();

    public double determinanteSistema(){
        double ds=0;
        ds=((mds[0][0]*mds[1][1]*mds[2][2])+(mds[0][1]*mds[1][2]*mds[2][0])+(mds[0][2]*mds[1][0]*mds[2][1])-
                (mds[2][0]*mds[1][1]*mds[0][2])-(mds[2][1]*mds[1][2]*mds[0][0])-(mds[2][2]*mds[1][0]*mds[0][1]));
        return ds;
    }
    public double determinanteBeta0(){
        double dB0=0;
        dB0=((mb0[0][0]*mb0[1][1]*mb0[2][2])+(mb0[0][1]*mb0[1][2]*mb0[2][0])+(mb0[0][2]*mb0[1][0]*mb0[2][1])-
                (mb0[2][0]*mb0[1][1]*mb0[0][2])-(mb0[2][1]*mb0[1][2]*mb0[0][0])-(mb0[2][2]*mb0[1][0]*mb0[0][1]));
        return dB0;
    }
    public double determinanteBeta1(){
        double dB1=0;
        dB1=((mb1[0][0]*mb1[1][1]*mb1[2][2])+(mb1[0][1]*mb1[1][2]*mb1[2][0])+(mb1[0][2]*mb1[1][0]*mb1[2][1])-
                (mb1[2][0]*mb1[1][1]*mb1[0][2])-(mb1[2][1]*mb1[1][2]*mb1[0][0])-(mb1[2][2]*mb1[1][0]*mb1[0][1]));
        return dB1;
    }

    public double determinanteBeta2(){
        double dB2=0;
        dB2=((mb2[0][0]*mb2[1][1]*mb2[2][2])+(mb2[0][1]*mb2[1][2]*mb2[2][0])+(mb2[0][2]*mb2[1][0]*mb2[2][1])-
                (mb2[2][0]*mb2[1][1]*mb2[0][2])-(mb2[2][1]*mb2[1][2]*mb2[0][0])-(mb2[2][2]*mb2[1][0]*mb2[0][1]));
        return dB2;
    }

    public double beta0(){
        double b0=0;
        b0=determinanteBeta0()/determinanteSistema();
        return b0;
    }
    public double beta1(){
        double b1=0;
        b1=determinanteBeta1()/determinanteSistema();
        return b1;
    }
    public double beta2(){
        double b2=0;
        b2=determinanteBeta2()/determinanteSistema();
        return b2;
    }
}
public class Matrix {
    Sumatorias s =new Sumatorias();
    public double[][] matrix(){
        double [][] ds={{s.t,s.sumx1(),s.sumx2()},{s.sumx1(),s.sumx1sql(),s.sumx1x2()},{s.sumx2(),s.sumx1x2(),s.sumx2sql()}};
        return ds;
    }
    public double[][] matrix2(){
        double [][] b0={{s.sumy(),s.sumx1(),s.sumx2()},{s.sumx1y(),s.sumx1sql(),s.sumx1x2()},{s.sumx2y(),s.sumx1x2(),s.sumx2sql()}};
        return b0;
    }
    public double[][] matrix3(){
        double [][] b1={{s.t,s.sumy(),s.sumx2()},{s.sumx1(),s.sumx1y(),s.sumx1x2()},{s.sumx2(),s.sumx2y(),s.sumx2sql()}};
        return b1;
    }
    public double[][] matrix4(){
        double [][] b2={{s.t,s.sumx1(),s.sumy()},{s.sumx1(),s.sumx1sql(),s.sumx1y()},{s.sumx2(),s.sumx1x2(),s.sumx2y()}};
        return b2;
    }
}

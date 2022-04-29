public class Dataset {

    public double x1[] = {1,2,2,4,2,1,5,4,2,4,4,3,6,5,3,4,6,2,1,2};
    public double x2[] = {1,3,3,5,2,2,1,1,0,3,4,3,2,4,4,4,5,1,0,1};
    public double y[] = {76,78,85,88,72,69,94,94,88,92,90,75,96,90,82,85,99,83,62,76};
    public int n = 20;



    public void datos(){

        System.out.printf("\t n\t x1 \t x2 \t y \n");

        for (int i = 0; i < n; i++) {
            System.out.printf("\t %d\t %.2f \t %.2f\t %.2f \n", i + 1, x1[i], x2[i], y[i]);
        }
    }

}

import java.util.Random;

public class Main {
     public static void main(String[] args) {
        short[] z = new short[9];
        for (short i = 0; i < 9; ++i) {
            z[i] = (short) (22 - (i * 2));
        }
        double[] x = new double[10];
        Random rnd = new Random();
        for (int i = 0; i < 10; ++i) {
            x[i] = rnd.nextDouble(6.0) - rnd.nextDouble(15.0);
        }
        double[][] z1 = new double[9][10];
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 10; ++j) {
                if (z[i] == 22) {
                    z1[i][j] = Math.cos(Math.asin(1.0 / Math.exp(x[j])));
                    continue;
                }
                if (z[i] == 10 || z[i] == 12 || z[i] == 16 || z[i] == 20) {
                    z1[i][j] = Math.pow((1.0 / 2.0) / (0.25 * Math.log(Math.abs(x[j]))), Math.pow(((3 - Math.log(Math.abs(x[j])) / 1.0) / 2.0), 2.0));
                    continue;
                }
                else {
                    z1[i][j] = Math.pow(((1.0 / 4.0) / (1 - Math.pow(((1.0 / 3.0) / (Math.pow(x[j], x[j] / (2.0 / 3.0 - x[j])) / 1.0 / 2.0)), 3.0))), 3.0);
                    continue;
                }
            }
        }
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 10; ++j) {
                System.out.printf("%.4f ", z1[i][j]);
            }
            System.out.println();
        }
    }
}
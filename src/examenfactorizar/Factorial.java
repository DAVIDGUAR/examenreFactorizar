package examenfactorizar;

public class Factorial {

    public static void main(String[] args) {

        int numj;
        int factor;

        numj = 8;

        int i;
        if (numj == 0) {
            factor = 1;
        } else {
            factor = 1;
            for (i = numj; i >= 1; i--) {
                factor = factor * i;
            }
        }

        System.out.println(factor);

    }

}

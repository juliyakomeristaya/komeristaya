package HOME1;

import java.util.Scanner;

public class HomeWork3 {
    public static void computingLengthV(int x, int y, int z) {
        double a = Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2);
        double Length = Math.sqrt(a);
            System.out.println("Длина вектора " + "(" + x + "," + y + "," + z + ") = " + Length);
        }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter x:" );
        int x = console.nextInt();
        System.out.println("Enter y:" );
        int y = console.nextInt();
        System.out.println("Enter z:" );
        int z = console.nextInt();
        computingLengthV(x, y, z);
    }
}

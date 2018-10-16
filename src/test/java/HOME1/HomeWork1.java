package HOME1;

import java.util.Scanner;

public class HomeWork1 {

        public static void calculate1(long x, long y, long z, long n){
            long a = (x + (y - 100) * z / n);
            System.out.println("a = " + a);
        }

        public static void calculate2(int x, int y, int z, int n){
            long b = (x - (50 + y * z) * n) + x;
            System.out.println("b = " + b);
        }

        public static void calculate3(float x, float y, float z, float n){
            float c = x * (y / (z-1) + 555) - n;
            System.out.println("c = " + c);
    }

        public static void calculate4(double x, double y, double z, double n){
            double d = -x / y + z * (n+1);
            System.out.println("d = " + d);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter x ");
        int x = console.nextInt();
        System.out.println("Enter y ");
        console.hasNextDouble();
        int y = console.nextInt();
        System.out.println("Enter z ");
        console.hasNextDouble();
        int z = console.nextInt();
        System.out.println("Enter n ");
        console.hasNextDouble();
        int n = console.nextInt();
        calculate1(x, y, z, n);
        calculate2(x, y, z, n);
        calculate3(x, y, z, n);
        calculate4(x, y, z, n);
    }
}

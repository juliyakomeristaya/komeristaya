package Home2;

import java.util.Scanner;

public class Task2 {
//    Есть целое положительное число (long). Программа должна определить наименьшую и
//    наибольшую цифры, которые входят в состав данного числа.


    public static int getCountsOfDigits(long number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static void definitionMaxMinNumber(long number) {
        System.out.println("У числа "+ number + ":" + "\n");
        int length = getCountsOfDigits(number);
        int[] mas = new int[length];
        int numberMax = 0;
        int numberMin = 9;

        for(int i = 0; i < mas.length; i++) {
        mas[i] = (int) (number % 10);
        number = number / 10;
            //System.out.print(mas[i]);
        }
        for(int i = 0; i < mas.length; i++) {
        if(mas[i] > numberMax)
            numberMax = mas[i];

        if(mas[i] < numberMin)
            numberMin = mas[i];
        }

        System.out.println("Наибольшее число: "+ numberMax + "\n");
        System.out.println("Наименьшее число: "+ numberMin);

    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number");
        long number = console.nextLong();
        definitionMaxMinNumber(number);

    }
}

package HOME1;



import java.util.Scanner;

public class HomeWork2 {

    public static void decomposeN(int number) {
        String num = Integer.toString(number);
        int i = 4;
        int length = Integer.toString(number).length();
        while (i < length & i >=0) {
            char result = num.charAt(i--);
            System.out.println(result);
        }
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a 5-digit number:" );
        int number = console.nextInt();
        decomposeN(number);
    }
}

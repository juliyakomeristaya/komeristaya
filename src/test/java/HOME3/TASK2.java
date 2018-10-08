package HOME3;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;


/*Пользователь вводит строку. Подсчитать количество повторений символов, во введенной
        строке. Вводимая строка должна состоять из символов только латинского алфавита.
        Вывести на экран(построчно) кол-во повторений каждого символа входной строки.*/
public class TASK2 {
//    public static String countRepetitions(String str){
//        int count = 1;
//        for(int i = 0; i < str.length(); i++) {
//            for (int j = 1; j < str.length(); j++) {
//                if (str.charAt(i) == str.charAt(j)) {
//                    count = count + 1;
//                }
//            }
//            if (count > 1) {
//                System.out.println(str.charAt(i) + " " + count);
//                count = 0;
//            }
//        }
//        for(int i = 0; i < str.length(); i++) {
//            char x = str.charAt(i);
//            if (str.contains(CharSequence x){
//                count = count + 1;
//            }
//        }
//       return str;
    //}

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = console.nextLine();
//        countRepetitions(str);
    }
}

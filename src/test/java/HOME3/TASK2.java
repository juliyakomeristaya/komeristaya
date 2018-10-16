package HOME3;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;


/*Пользователь вводит строку. Подсчитать количество повторений символов, во введенной
        строке. Вводимая строка должна состоять из символов только латинского алфавита.
        Вывести на экран(построчно) кол-во повторений каждого символа входной строки.*/
public class TASK2 {
    public static String countRepetitions(String str){
        int count = 0;
        StringBuffer sb = new StringBuffer(str);
        for(int i = 0; i < sb.length(); i++) {
            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(i) == sb.charAt(j)) {
                    count = count + 1;
                    sb.delete(i,i+1);
                    sb.delete(j,j+1);
                    //str.substring(j);
                }
            }
            if (count > 1) {
                System.out.println(str.charAt(i) + " " + count);
                count = 0;
            }
        }
//        for(int i = 0; i < str.length(); i++) {
//            char x = str.charAt(i);
//            if (str.contains(CharSequence x){
//                count = count + 1;
//            }
//        }
       return str;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = console.nextLine();
        countRepetitions(str);
    }
}

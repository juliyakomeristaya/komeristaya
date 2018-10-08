package HOME3;

/*Программа запрашивает у пользователя ФИО, мобильный телефон и email, и проверяет
        данные на валидность с помощью регулярных выражений.
        ФИО - только буквы английского алфавита, дефис и пробел
        Мобильный телефон - +380 далее 2 цифры кода (украина) и 7 любых цифр
        email - любые латинские символы, цифры, дефис и нижний прочерк, обязательный символ @
        и .
                Проверить все вводимые данные и вывести неверно введенные.*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TASK3 {

    public static void verificationName(String name) {
        Pattern p = Pattern.compile("[a-zA-Z\\s-]+");
        Matcher m = p.matcher(name);
        if (m.matches())
        {
            System.out.println("Имя введено верно.");
        }
        else {
            System.out.println("Имя введено неверно.");
        }
    }

    public static void verificationPhone(String phone) {
        Pattern p = Pattern.compile("^[+380[99|50|66|63|93|96|97|98|73]][0-9]{12}$");
        Matcher m = p.matcher(phone);
        if (m.matches())
        {
            System.out.println("Телефон введен верно.");
        }
        else {
            System.out.println("Телефон введен неверно.");
        }
    }

    public static void verificationEmail(String email) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9_-]{1,}[@][a-zA-Z_-]{1,}[.][a-zA-Z]{2,}$");
        Matcher m = p.matcher(email);
        if (m.matches()) {
            System.out.println("Email введен верно.");
        } else {
            System.out.println("Email введен неверно.");
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите ФИО: ");
        String name = console.nextLine();
        System.out.println("Введите телефон: ");
        String phone = console.nextLine();
        System.out.println("Введите email: ");
        String email = console.nextLine();
        verificationName(name);
        verificationPhone(phone);
        verificationEmail(email);
    }
}
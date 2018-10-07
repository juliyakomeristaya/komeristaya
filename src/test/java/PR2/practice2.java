package PR2;

import java.util.Scanner;

public class practice2 {

        public static final String FIELD1 = "Курс: Java core";
        public static final String FIELD2 = "Студент";
        public static final char BORDER = '*';

        public static String getStudentName() {
            Scanner console = new Scanner(System.in);
            String studentName = console.nextLine();
            System.out.println("Введите имя студента:");
            return studentName;
        }

        public  static int getMaxLenght (String name) {
            if (FIELD1.length() > name.length()) {
                return FIELD1.length();
            } else {
                return name.length();
            }
        }
    public static void  drowLine(int size, char symbol) {
        for (int i = 0; i != size; i++) ;
        {
            System.out.print(symbol);
        }
    }
    public static void drawText (int maxSize, String text){
            System.out.print(BORDER + " ");
            int spaceLeft = maxSize - text.length()/2;
            int spaceRigth = maxSize - text.length() - spaceLeft;
            drowLine(spaceLeft,' ');
            System.out.print(text);
            drowLine(spaceRigth,' ');
        System.out.print(" " + BORDER);
    }

        public static void main(String[] args) {
           String name = getStudentName();
           int maxLength = getMaxLenght(name);
           drowLine(maxLength+4,BORDER);
            System.out.println();
            drawText(maxLength, FIELD1);
            drawText(maxLength, FIELD2);
            drawText(maxLength, name);
           drowLine(maxLength+4,BORDER);
        }
    }

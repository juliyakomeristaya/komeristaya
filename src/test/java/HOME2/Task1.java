package HOME2;

import java.util.Scanner;

public class Task1 {
    static String str1 = "Курс: Java core";
    static String str2 = "Студент";
    static int max;

    public static int countingMaxL(String str3) {
        int lengthStr3 = str3.length()+4;
        int minLength = str1.length()+4;
        if (lengthStr3 < minLength) {
            max = minLength;
        }
        else {
            max = lengthStr3;
        }
        return max;
    }

    public static void conclusionFrame(String str3) {
        for (int i = 0; i < countingMaxL(str3); i++) {
            System.out.print("*");
        }
    }
        public static String conclusionSpace(int num, String strSpace) {
        for (int i = 0; i < num; i++) {
            strSpace+=" ";
        }
            return strSpace;
    }
        public static String printStr(String str) {
        String outStr = "* ";
        int l = str.length();
        int s = (max - 4 - l);
        int h = s / 2;
        String strSpace = "";
        outStr+= conclusionSpace(h, strSpace);
        outStr+=str;
        outStr+=conclusionSpace(s - h, strSpace);
        outStr+=" *";
        return outStr;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your ALL name");
        String str3 = console.nextLine();
        conclusionFrame(str3);
        System.out.print ("\n" + printStr(str1));
        System.out.print ("\n" + printStr(str2));
        System.out.print ("\n" + printStr(str3) + "\n");
        conclusionFrame(str3);

    }
}

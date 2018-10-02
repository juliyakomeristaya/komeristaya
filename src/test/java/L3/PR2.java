package L3;
import java.util.Random;

public class PR2 {

    static Random rd = new Random();
    static String validDigits = "1234567890"; //1-3
    static String validSpecCrars = "!@#$%^&*"; //1
    static String validChars = "ABCDabcd"; // < pass.length(), не более двух символов подряд
    static final int DigitsGroups = 0;
    static final int SpecCharsGroups = 1;
    static final int CharsGroups = 2;


    public static char generateRandomChar(String array) {
        int randomIndex = rd.nextInt(array.length());
        return array.charAt(randomIndex);

    }
    public static void checkUserInput(){

    }

    public static String generatePassword(int size) {
        boolean specCharFlag = false;
        int diginsCounter = 0;
        StringBuilder pass = new StringBuilder();
        char rendomChar = '0';
        while (size != pass.length()) {

            int randomGroup = rd.nextInt(3);

           switch (randomGroup){
               case DigitsGroups:
                   if(diginsCounter <= 3) {
                       rendomChar = generateRandomChar(validDigits);
                       diginsCounter++;
                       break;
                   }
               case SpecCharsGroups:
                   if (!specCharFlag) {
                       rendomChar = (generateRandomChar(validSpecCrars));
                       specCharFlag = true;
                   }
                   break;
               case CharsGroups:
                   rendomChar = generateRandomChar(validChars);
                   break;

           }
           if ((pass.length() == 0) || (pass.charAt(pass.length() - 1) != rendomChar)){
               pass.append(rendomChar);
           }
        }
        return pass.toString();
    }

    public static void main(String[] args) {
        System.out.println(generatePassword(20));

    }
}

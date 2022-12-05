package TaskString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MyStringProcessor {

    public static boolean edAtTheEndChecker(String text) {
        String[] myArray = text.split("");
        return Objects.equals(myArray[myArray.length - 1], "d") && Objects.equals(myArray[myArray.length - 2], "e");
    }

    public static int sumOfNumInString(String text) {
        int sum = 0;
        char[] arrayOfSymbols = text.toCharArray();
        for (char arrayOfSymbol : arrayOfSymbols) {
            if (Character.isDigit(arrayOfSymbol)) {
                sum += Integer.parseInt(String.valueOf(arrayOfSymbol));
            }
        }
        return sum;
    }

    public static int maxLengthOfSameSymbols(String text) {
        char myCharArray[] = text.toCharArray();
        int max = 0, counter = 0;
        char c = myCharArray[0];
        for (char s : myCharArray) {
            if (s == c) {
                counter++;
            } else {
                if (max < counter) {
                    max = counter;
                }
                counter = 0;
                c = s;
            }
        }
        return max+1;
    }

    public static void wordsInString(String text) {
        String myArray[] = text.split(" ");
        for (String s : myArray) {
            System.out.println(s);
        }
    }

    public static String concatStringsByIndex(String first, String second) {
        StringBuilder result = new StringBuilder();
        String maxString = first.length() > second.length() ? first : second ;
        int lengthFor = Math.min(first.length(), second.length());
        for (int i = 0; i < lengthFor; i++) {
            result.append(first.charAt(i));
            result.append(second.charAt(i));
        }
        for (int i = lengthFor; i < Math.max(first.length(), second.length()); i++) {
            result.append(maxString.charAt(i));
        }
        return result.toString();
    }
}


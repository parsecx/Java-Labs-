package Algo;

import java.io.IOException;
import java.util.Objects;

public class Ceaser {

    public static final String aplha = "abcdefghijklmnopqrstuvwxyz";
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String message, int shiftKey) {
        message = message.toLowerCase();
        String cipherText = "";
        for (int ii = 0; ii < message.length(); ii++) {
            if(message.charAt(ii) != ' ') {
                int charPosition = aplha.indexOf(message.charAt(ii));
                int keyVal = (shiftKey + charPosition) % 26;
                char replaceVal = aplha.charAt(keyVal);
                cipherText += replaceVal;
            } else {
                cipherText += ' ';
            }
        }
        return cipherText;
    }

    public static String decrypt(String cipherText, int shiftKey) {
        cipherText = cipherText.toLowerCase();
        String message = "";
        for (int ii = 0; ii < cipherText.length(); ii++) {
            if(cipherText.charAt(ii) != ' ') {
                int charPosition = ALPHABET.indexOf(cipherText.charAt(ii));
                int keyVal = (charPosition - shiftKey) % 26;
                if (keyVal < 0) {
                    keyVal = ALPHABET.length() + keyVal;
                }
                char replaceVal = ALPHABET.charAt(keyVal);
                message += replaceVal;
            } else {
                message += ' ';
            }
        }
        return message;
    }
}




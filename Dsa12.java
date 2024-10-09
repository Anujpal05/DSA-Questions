//Encodin And Decoding pending

import java.util.Scanner;

public class Dsa12 {

    public static int getSecretNum(String sKey) {
        char ch;
        int as, secNum = sKey.length(), sum = 0;
        for (int i = 0; i < sKey.length(); i++) {
            ch = sKey.charAt(i);
            as = ch;
            if (as >= 48 && as <= 57) {
                sum += as % 48;
                continue;
            } else if (as >= 65 && as <= 90) {
                sum += as % 65;
                continue;
            } else if (as >= 97 && as <= 122) {
                sum += as % 97;
                continue;
            } else {
                sum += sKey.length();
            }
        }
        secNum = sum % sKey.length();
        if (secNum == 0) {
            secNum = sKey.length();
        }
        return secNum;
    }

    public static String encoding(String str, String sKey) {
        int secNum = getSecretNum(sKey);
        int num;

        StringBuilder encStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < secNum; j++) {
                num = (int) str.charAt(i) + (secNum * (j + 1));
                num = 97 + num % 26;
                encStr.append((char) num);
            }
        }
        String enstr = encStr.toString();
        return enstr;
    }

    // public static String decoding(String encodedStr, String sKey) {
    // int secNum = getSecretNum(sKey);
    // int num;

    // StringBuilder decStr = new StringBuilder();
    // int strLength = encodedStr.length();

    // for (int i = 0; i < strLength; i++) {
    // char encChar = encodedStr.charAt(i);

    // for (int j = secNum; j > 0; j--) {
    // num = encChar - (secNum * j);
    // num = (num - 97 + 26) % 26 + 97;
    // encChar = (char) num;
    // }

    // decStr.append(encChar);
    // }

    // return decStr.toString();
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data:");
        String str = sc.nextLine();
        System.out.println("Enter the secret key:");
        String secretKey = sc.nextLine();
        String encStr = encoding(str, secretKey);
        System.out.println(encStr);
        // System.out.println("Decoding.....");
        // String decSecKey = sc.nextLine();
        // String decStr = decoding(encStr, secretKey);
        // System.out.println(decStr);

        sc.close();
    }
}

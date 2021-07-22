package prj06StringExperiments;

import java.util.Scanner;

public class StringConfidential {
    public static void main(String[] args) {
        String stringForDefend = "";
        String placeholder = "*%*&*#";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Text between <...> will be replace by placeholder");
        System.out.print("Input string to confidential with <...>: ");
        stringForDefend = scanner.nextLine().trim();
        System.out.println("String with confidential: " + searchAndReplaceDiamonds(stringForDefend, placeholder));
      }

    public static String searchAndReplaceDiamonds(String text, String placeholder){
        int indexFirstDiamond = text.indexOf("<");
        int indexLastDiamond = text.lastIndexOf(">");
        return text.substring(0,indexFirstDiamond) + placeholder + text.substring(indexLastDiamond + 1);
    }
}

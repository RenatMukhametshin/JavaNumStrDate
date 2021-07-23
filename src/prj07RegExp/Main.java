package prj07RegExp;

public class Main {
    public static void main(String[] args) {
        String phone = "+7 (987)-654-32-10";

        System.out.println("===RegExp example for phone number===");
        System.out.println(phone);
        System.out.println(phone.replaceAll("[^0-9]",""));

        String someText = "You are very good man.          She is waiting you now.    Come'on go there.";
        String[] sentences = someText.split("\\.\\s+");
        for (String sentence: sentences) {
            sentence += "*";
            System.out.println(sentence);
        }
    }
}

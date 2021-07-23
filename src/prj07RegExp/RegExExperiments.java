package prj07RegExp;

import java.util.Scanner;

public class RegExExperiments {
    public static void main(String[] args) {
        System.out.println("====count sum salaries in String=====");
        String textWithSalaries = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String[] salaries = textWithSalaries.split("[^0-9]+");
        int sum = 0;
        for (String salary : salaries) {
            if (salary.length() < 1) {
                continue;
            }
            sum += Integer.parseInt(salary);
            System.out.println(salary + ", sum = " + sum);
        }

        System.out.println("\n\n\n===Engtext to word===");
        String englishText = "Even though Israel is a small country it is always in the news.  The news continues to report on Jews moving to Israel, on the technology invented there, but also on conflict, wars and tensions with surrounding people.  Why? A look at Israel’s history in the book of Genesis in the Bible reveals that 4000 years ago a man, who is now very well known, went on a camping trip in that part of the world.  The Bible says that his story affects our future.\n" +
                "\n" +
                "This ancient man is Abraham (also known as Abram). We can take his story seriously because the places and cities he visited are mentioned in other old writings.";
        System.out.println(englishText);
        String[] words = englishText.split("[^A-Za-z]+");
        int count = 1;
        for (String word : words) {
            System.out.println("word " + count++ + " " + word);
        }

        System.out.println("\n\n\n======Parsing fio======");
        System.out.print("Input fio : ");
        String fio = new Scanner(System.in).nextLine().trim();
        String[] fioParts = fio.split("[^A-Za-z]+");
        System.out.println(fioParts);
        int fioPartIndex = 0;
        for (String fioPart : fioParts){
            if(fioPart.length() == 0) { continue; }
            if(fioPartIndex == 0) {
                System.out.print(" Family - ");
            } else if (fioPartIndex == 1){
                System.out.print(" Name - ");
            } else if (fioPartIndex == 2) {
                System.out.print(" Otchestvo - ");
            } else {
                System.out.print(" Unknown part of FIO - ");
            }
            System.out.println(fioPart);
            fioPartIndex++;
        }

        System.out.println("\n\n\n===Upgrade string confidential===");
        String textToCode = "fdsfsdf fdfdfdf <fdf<fd>sfd> fdffdfddfdf";
        String placeHolder = "***+++---";
        System.out.println("input string : " + textToCode);
        textToCode = textToCode.replaceAll("<.*>", placeHolder);
        System.out.println("output string : " + textToCode);
    }
}

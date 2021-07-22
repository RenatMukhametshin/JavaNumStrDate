package prj06StringExperiments;

import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        int sum = 0;
        int indexAfterNumber = 0;
        int indexFromSearch = 0;

        System.out.println(text);

        while (true) {
            indexAfterNumber = text.indexOf(" руб", indexFromSearch);
            if (indexAfterNumber < 0) {
                break;
            }
            String subText = text.substring(indexFromSearch, indexAfterNumber);
            int number = Integer.parseInt(subText.substring(subText.lastIndexOf(" ") + 1));
            sum += number;
            System.out.println(subText + ", found number : " + number);
            indexFromSearch = indexAfterNumber + 1;
        }

        System.out.println("Sum all salaries : " + sum);

        System.out.println("\n\n\n===parsing FIO====");
        System.out.print("input FIO: ");
        String fio = (new Scanner(System.in).nextLine()).trim();
        int indexCurrentSpace = 0;
        int indexNextSpace = 0;
        String family = "";
        String name = "";
        String secondName = "";
        while (true) {
            indexNextSpace = fio.indexOf(" ", indexCurrentSpace + 1);
            if (indexNextSpace < 0) {
                if (family.length() == 0) {
                    family = fio;
                } else if (name.length() == 0) {
                    name = fio.substring(indexCurrentSpace);
                } else {
                    secondName = fio.substring(indexCurrentSpace);
                }
                break;
            } else {
                String currentFioPart = fio.substring(indexCurrentSpace, indexNextSpace);
                if (family.length() == 0) {
                    family = currentFioPart;
                } else if (name.length() == 0) {
                    name = currentFioPart;
                } else {
                    secondName = currentFioPart;
                    break;
                }
                indexCurrentSpace = indexNextSpace + 1;
            }
        }
        System.out.println("Family: " + family);
        System.out.println("Name: " + name);
        System.out.println("Otchestvo: " + secondName);

    }
}
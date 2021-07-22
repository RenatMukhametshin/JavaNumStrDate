package prj06StringExperiments;

public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        int sum = 0;
        int indexAfterNumber = 0;
        int indexFromSearch = 0;

        System.out.println(text);

        while (true) {
            indexAfterNumber = text.indexOf(" руб", indexFromSearch);
            if(indexAfterNumber < 0) { break; }
            String subText = text.substring(indexFromSearch, indexAfterNumber);
            int number = Integer.parseInt(subText.substring(subText.lastIndexOf(" ") + 1));
            sum += number;
            System.out.println(subText + ", found number : " + number);
            indexFromSearch = indexAfterNumber + 1;
         }

        System.out.println("Sum all salaries : " + sum);
    }
}
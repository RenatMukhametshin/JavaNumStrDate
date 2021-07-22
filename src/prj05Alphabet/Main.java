package prj05Alphabet;

public class Main {
    public static void main(String[] args) {
        //====== en alphabet
        printCharAndCode('A','Z');
        printCharAndCode('a','z');

        //====== ru alphabet
        printCharAndCode('А','Я');
        printCharAndCode('а','я');
    }

    public static void printCharAndCode(char first, char last){
        while(first <= last){ System.out.println(first + " : " + (int)first++); }
    }
}

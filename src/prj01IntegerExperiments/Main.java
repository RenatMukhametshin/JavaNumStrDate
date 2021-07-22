package prj01IntegerExperiments;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        System.out.println(container.count);
        container.count += 7843;
        System.out.println(container.count);

        System.out.println("===check count a sum of digits of number===");
        Integer int1 = 23;
        Integer int2 = 156;
        Integer int3 = 3456789;
        System.out.println("sum of digits " + int1 + " : " + sumDigits(int1));
        System.out.println("sum of digits " + int2 + " : " + sumDigits(int2));
        System.out.println("sum of digits " + int3 + " : " + sumDigits(int3));
    }

    public static Integer sumDigits(Integer number) {
        //this code count a sum of digits of integer number
        Integer sum = 0;
        int length = number.toString().length(); //count of digits
        for (int i = 0; i < length; i++) {
            char currentDigit = number.toString().charAt(i);
            sum += Character.getNumericValue(currentDigit);
        }
        return sum;
    }
}

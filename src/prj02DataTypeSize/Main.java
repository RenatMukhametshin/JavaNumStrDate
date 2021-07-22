package prj02DataTypeSize;

public class Main {
    public static void main(String[] args) {
        System.out.print("Byte min_value = " + (byte)0B1000_0000);
        System.out.println(" / Byte max_value = " + (byte)0B0111_1111);

        System.out.print("Short min_value = " + Short.MIN_VALUE);
        System.out.println(" / Short max_value = " + Short.MAX_VALUE);

        System.out.print("Integer(int) min_value = " + (int)0B1000_0000_0000_0000_0000_0000_0000_0000);
        System.out.println(" / Integer(int) max_value = " + (int)0B0111_1111_1111_1111_1111_1111_1111_1111);

        System.out.print("Long min_value = " + Long.MIN_VALUE);
        System.out.println(" / Long max_value = " + Long.MAX_VALUE);

        System.out.print("Float min_value = " + Float.MIN_VALUE);
        System.out.println(" / Float max_value = " + Float.MAX_VALUE);

        System.out.print("Double min_value = " + Double.MIN_VALUE);
        System.out.println(" / Double max_value = " + Double.MAX_VALUE);

        System.out.print("Character (char) min_value = " + (int)(Character.MIN_VALUE));
        System.out.println(" / Character (char) max_value = " + (int)(Character.MAX_VALUE));
    }
}

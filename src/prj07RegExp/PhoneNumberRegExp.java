package prj07RegExp;

import java.util.Scanner;

public class PhoneNumberRegExp {
    public static void main(String[] args) {
        System.out.print("Input the phone number : ");
        String inputPhone = new Scanner(System.in).nextLine().trim();
        System.out.println(processingPhoneNumber(inputPhone));
    }
    public static String processingPhoneNumber(String phone){
        String outputPhone = phone.replaceAll("[^0-9]+","");
        if(outputPhone.length() < 10 || outputPhone.length() > 11 ||
                outputPhone.length() == 11 && outputPhone.charAt(0) != '7' && outputPhone.charAt(0) != '8' ){
            System.out.print(" wrong format number ");
        } else {
            System.out.print(" good format number ");
            if(outputPhone.length() == 10){
                outputPhone = "7" + outputPhone;
            }
            outputPhone = "+7(" + outputPhone.substring(1,4) + ")-" + outputPhone.substring(4,7) + "-"
                    + outputPhone.substring(7,9) + "-" + outputPhone.substring(9);
        }
        return outputPhone;
    }
}

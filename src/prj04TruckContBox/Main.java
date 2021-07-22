package prj04TruckContBox;

import java.util.Scanner;

public class Main {
    public static int boxesInContainer = 2;
    public static int containersInTruck = 3;

    public static void main(String[] args) {
        System.out.print("Input count boxes for distribution: ");
        int boxes = new Scanner(System.in).nextInt();

        int currentTruck = 1;
        int currentContainer = 1;
        int currentBox = 1;
        boolean flagStop = false;
        boolean needNextContainer = false;
        boolean needNextTruck = false;

        if(boxes > 0){
            while(true){
                System.out.println("Truck [" + currentTruck + "]");
                while(!needNextTruck){
                    System.out.println("\t Contrainer [" + currentContainer + "]");
                    while(!needNextContainer){
                        System.out.println("\t\t Box [" + currentBox + "]");
                        if(currentBox % boxesInContainer == 0) { needNextContainer = true; }
                        currentBox++;
                        if(currentBox > boxes) { flagStop = true; break; }
                    }
                    if(flagStop) break;
                    if(currentContainer % containersInTruck == 0) { needNextTruck = true; }
                    currentContainer++; needNextContainer = false;
                }
                if(flagStop) break;
                currentTruck++; needNextTruck = false;
            }
            System.out.println(currentTruck + " trucks needed, " + currentContainer + " contrainers needed.");
        } else {
            System.out.println("No trucks, no containers needed.");
        }
    }
}

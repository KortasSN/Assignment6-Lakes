package com.josh;
import sun.awt.image.ImageWatched;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner amountScanner = new Scanner(System.in);
        System.out.println("How Many Lakes run?");   //ask how many training runs they want to enter
        int getcounter = amountScanner.nextInt();
        for (int x = 0; x < getcounter; x++) {

            String lakeName = GetLakeName();

            int counter = GetLakeRuns();

            System.out.println(counter);
            double lowestRun = 8675309;
            for (int y = 0; y < counter; y++) {

                ArrayList runTimes = GetRunTimes();

                for (Object ob : runTimes) {
                    double run = (double) ob;
                    if (run < lowestRun) {
                        lowestRun = run;
                    }
                }

            }
            System.out.println("The Lowest run for " + lakeName + " is " + lowestRun + ".");  //output of the lake name and lowest run

        }
    }

    //Run Times

    private static ArrayList GetRunTimes() {
        ArrayList runTimes = new ArrayList();
        System.out.println("Enter your run time:");
        Scanner runTimesScanner = new Scanner(System.in);
        double runTimesInt = runTimesScanner.nextInt();
        runTimes.add(runTimesInt);
        return runTimes;
    }

    // How many runs for particular lake

    private static int GetLakeRuns() {
        System.out.println("How many runs for this lake?");
        Scanner lakeRunsScanner = new Scanner(System.in);
        int lakeRunsCounter = lakeRunsScanner.nextInt();
        return lakeRunsCounter;

    }

    //Get the Lake Name

    private static String GetLakeName() {                   //Getting the name of the lake
        Scanner lakeScanner = new Scanner(System.in);
        System.out.println("Enter the lake name:");
        String lakeName = lakeScanner.nextLine();
        return lakeName;
    }

}









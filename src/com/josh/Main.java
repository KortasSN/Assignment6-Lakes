package com.josh;
import sun.awt.image.ImageWatched;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner amountScanner = new Scanner(System.in);
        System.out.println("How Many Lakes run?");   //ask how many training runs they want to enter
        int getcounter = amountScanner.nextInt();
        HashMap<String, Double> endResults = new HashMap<String, Double>();
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
            GetEndResults(endResults,lakeName, lowestRun);

        }
        for (Object ob: endResults.keySet()) {
            System.out.print("Lake " + ob);
            System.out.println(" with a run of " + endResults.get(ob));
        }
    }

    private static HashMap<String, Double> GetEndResults(HashMap endResults, String lakeName, double lowestRun) {
        //HashMap<String, Double> endResults = new HashMap<String, Double>();
        //HashMap<String, Double> endResults = new HashMap<String, Double>();
        endResults.put(lakeName, lowestRun);
        return endResults;
    }

    //Run Times

    private static ArrayList GetRunTimes() {
        ArrayList runTimes = new ArrayList();
        System.out.println("Enter your run time:");
        Scanner runTimesScanner = new Scanner(System.in);
        double runTimesDouble = 0;
        //data verification with try/catch

        while (true) {
            try {
                runTimesDouble = runTimesScanner.nextDouble();
            } catch (InputMismatchException ime) {
                System.out.println("Please try and enter your run time again:");
                runTimesScanner.next();
                continue;
            }

            break;

        }
        runTimes.add(runTimesDouble);
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









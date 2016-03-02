package com.josh;
import sun.awt.image.ImageWatched;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //ask how many training times to enter
        //double lowestRun = 8675309;

        Scanner amountScanner = new Scanner(System.in);
        System.out.println("How Many Lakes run?");   //ask how many training runs they want to enter
        int getcounter = amountScanner.nextInt();
        for (int x = 0; x < getcounter; x++) {

            // GetInfo(getcounter);

            String lakeName = GetLakeName();

            int counter = GetLakeRuns();

            System.out.println(counter);
            double lowestRun = 8675309;
            for (int y = 0; y < counter; y++) {

                ArrayList runTimes = GetRunTimes();
                System.out.println(runTimes);
                System.out.println(lakeName);

                for (Object ob : runTimes) {
                    double run = (double) ob;
                    if (run < lowestRun) {
                        lowestRun = run;
                    }
                }


                //int lowestRun = GetLowestRun(runTimes);
                /*for (int a = 0; a < runTimes.size(); a++) {
                        //if (runTimes.set(a). < runTimes.set(b)) {
                        //if ((runTimes.get(a)  runTimes.get(b))) {
                                            }
                    // compare list.get(i) and list.get(j)
                  */
            }
            System.out.println("The Lowest run for " + lakeName + " is " + lowestRun + ".");

        }
    }







            //int lowestRun = GetLowestRun(runTimes);

            //ArrayList returnLakeInfo = GetInfo(getcounter);  //call function getInfo

            //Lowestrunran(returnLakeInfo);

            //double lowestRun = 8675309;

            //for (Object ob: returnLakeInfo.keySet()) {
            //System.out.println(ob);
            //System.out.println(lowestRun);
            //System.out.println("finished");    //testing to let me know when code is finished


    //private static int GetLowestRun() {


    //}

    private static ArrayList GetRunTimes() {
        ArrayList runTimes = new ArrayList();
        System.out.println("Enter your run time:");
        Scanner runTimesScanner = new Scanner(System.in);
        double runTimesInt = runTimesScanner.nextInt();
        runTimes.add(runTimesInt);
        return runTimes;
    }

    private static int GetLakeRuns() {
        System.out.println("How many runs for this lake?");
        Scanner lakeRunsScanner = new Scanner(System.in);
        int lakeRunsCounter = lakeRunsScanner.nextInt();
        return lakeRunsCounter;

    }

    private static String GetLakeName() {                   //Getting the name of the lake
        Scanner lakeScanner = new Scanner(System.in);
        System.out.println("Enter the lake name:");
        String lakeName = lakeScanner.nextLine();
        return lakeName;
    }

}




    /*static int Lowestrunran(LinkedList<>) {
        for (int a = 0; a < list.size(); a++) {
            for (int b = a+1; b < list.size(); b++) {
                // compare list.get(i) and list.get(j)
            }
        }
*/





   /* static ArrayList GetInfo(int counter) {    //getInfo function

        ArrayList<Integer> lakeInfo = new ArrayList<>();    //create ArrayList to store lake name and run time
        double lowestRun = 8675309;
        for (int x = 0; x< counter; x++) {



            LinkedList runTime = new LinkedList();
            for (int y = 0; y < lakeRunsCounter; y++) {

                Scanner runScanner = new Scanner(System.in);
                System.out.println("Please enter time:");
                double runTimeEntered = runScanner.nextDouble();
                runTime.add(runTimeEntered);
                //if (runTimeEntered < lowestRun) {
                //    lowestRun = runTimeEntered;
                }
            }
            lakeInfo.put(lakeName, runTime);
            //double lowestRun = 8675309;
            // for (int z = 0; z < runTime.size(); z++) {
            //for (Object i : runTime) {
            //Object b = runTime;
            //if (lowestRun < runTime.get(i)){
            //  if (runTime.)
        }
        return lakeInfo;
    }

}
*/
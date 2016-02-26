package com.josh;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //ask how many training times to enter
       //double lowestRun = 8675309;
        Scanner amountScanner = new Scanner(System.in);
        System.out.println("How Many Lakes run?");   //ask how many training runs they want to enter
        int getcounter = amountScanner.nextInt();
        //getInfo(getcounter);
        HashMap returnLakeInfo = GetInfo(getcounter);  //call function getInfo

        //double lowestRun = 8675309;

      for (Object ob: returnLakeInfo.keySet()) {
          System.out.println(ob);
          System.out.println(lowestRun);
          System.out.println("finished");    //testing to let me know when code is finished
      }
    }





    static HashMap GetInfo(int counter) {    //getInfo function

        HashMap<String, LinkedList> lakeInfo = new HashMap();    //create HashMap to store lake name and run time
        double lowestRun = 8675309;
        for (int x = 0; x< counter; x++) {

            Scanner lakeScanner = new Scanner(System.in);
            System.out.println("Enter the lake name:");
            String lakeName = lakeScanner.nextLine();
            System.out.println("How many runs for this lake?");
            Scanner lakeRunsScanner = new Scanner(System.in);
            int lakeRunsCounter = lakeRunsScanner.nextInt();
            LinkedList runTime = new LinkedList();
            for (int y = 0; y < lakeRunsCounter; y++) {

                Scanner runScanner = new Scanner(System.in);
                System.out.println("Please enter time:");
                double runTimeEntered = runScanner.nextDouble();
                runTime.add(runTimeEntered);
                if (runTimeEntered < lowestRun) {
                    lowestRun = runTimeEntered;
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

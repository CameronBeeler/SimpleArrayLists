package com.cambeeler;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner (System.in);

    public static void main(String[] args) {
        String stringAnswer = "N";
        int idxCount = 0;
        int[] InitialArray;
        System.out.println("main:Entry");
        do{
           System.out.println("How many integers would you like to sort?");
            do {
                idxCount = (int) scan.nextInt();

                if (idxCount <= 0) {
                    System.out.println(idxCount + " - is an unacceptable value, please enter an Integer amount greater than 0");
                }
            } while (idxCount < 1);

            InitialArray = getIntegers(idxCount);
            sortIntegers(InitialArray);
            System.out.println("Would you like another Array Sequence? (Y to continue or any key to finish");
            stringAnswer = scan.next();
            System.out.println(stringAnswer + " is your Answer");
        }while (stringAnswer.contentEquals("Y"));
        System.out.println("main:Exit");
    }

    public static int[] getIntegers(int count){
        int[] intArray = new int[count];
        System.out.println("getIntegers:Entry");

        System.out.println("Please input " + intArray.length + " Integers");

        for(int i=0; i< intArray.length; i++){
            System.out.println("Please input integer " + (i+1) );
            intArray[i] = scan.nextInt();
        }
        System.out.println("getIntegers:Exit");
        return intArray;
    }
    public static void sortIntegers(int[] intArray){
        int processCount = 0;
        System.out.println("sortIntegers2:Entry" + processCount);


        int[] sortedArray = new int[intArray.length];
        for (int i=0; i < intArray.length; i++){
            sortedArray[i] = intArray[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;

            for( int i=0; i<sortedArray.length-1;i++){
                if (sortedArray[i] < sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                    processCount++;

                }
            }
        }
        printArray(sortedArray);
        System.out.println("sortIntegers2:Exit - Process count:  " + processCount);

    }

/*    public static void sortIntegers(int[] intArray){
        System.out.println("sortIntegers:Entry");


        // Find largest integer value
        // add it to the next position in the sortArray
        // remap the values to an array, excluding the largest integer value
        // repeat until all values accounted for.
        // if last value, no sort required.
        // For every value acquired, compare it with the next value in the sequence
        // through the remaining elements & replace with larger values until end of sequence
        // begin with a do-while loop.
        // increment until a value is set (Boolean on/off)
        //


//        int[] intArray = intArray;
        int processCount = 0;
        int arrayLength = intArray.length;
        int indexCountDown = arrayLength;
        int tempIndexValue = 0;
        int tempArrayValue;
        int largerValueCount = 0;
        int isEqualCount = 0;
        int[] sortArray = new int[intArray.length];

        for(int a=0; a < arrayLength; a++) {
// set initial value.
// Compare with remaining values.
// Count the number of values higher.  resulting index for new sortArray
// tempIndexValue = intArray[a];
            tempIndexValue=0;
            tempArrayValue = intArray[a];
            largerValueCount = 0;
            isEqualCount = 0;

// How many elements are Smaller?
            for (int b = 0; b < arrayLength; b++) {
                if (b == a) {
                    processCount++;
                    continue;
                }

                if (tempArrayValue < intArray[b]) {
                    largerValueCount++;
                    processCount++;
                }
                processCount++;
            }

// How many elements of the same value?
            for (int c = 0; c < arrayLength; c++) {
                if (c == a) {
                    processCount++;
                    continue;
                }

                if (tempArrayValue == intArray[c]) {
                    processCount++;
                    isEqualCount++;
                }
            }
// total index count - largervaluecount - equalvaluecount.
// This resolves assignment and the possibility of duplicate values to be assigned.
// Duplicates will be redundantly assigned with this process.

//            tempIndexValue = (arrayLength- 1 - (largerValueCount + isEqualCount));
            int z = 0;
            while( z<= isEqualCount)
            {
                processCount++;
                sortArray[(largerValueCount + z)] = tempArrayValue;
                z++;
            }
         }

        printArray(sortArray);
        System.out.println("sortIntegers:Exit - Process count:  " + processCount);
    }
*/

    public static void printArray(int[] intArray){
        System.out.println("printArray:Entry");
        System.out.println("Array elements printed in Descending order");
        for(int i=0; i<intArray.length; i++){
            System.out.println("Array element " + (i+1) + " = " + intArray[i]);
        }
        System.out.println("printArray:Exit");

    }


}

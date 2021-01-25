package com.santiago;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 10;
	    int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue); // 10
        System.out.println("anotherIntValue = " + anotherIntValue); // 10

        anotherIntValue++;
        System.out.println("anotherValue++");

        System.out.println("myIntValue = " + myIntValue); // 10
        System.out.println("anotherIntValue = " + anotherIntValue); // 11

        //prmitive types ismply copy the value of the variables, however reference types copy the reference

        int[] myIntArray = new int[5]; // the reference holds the reference/address to an object, not the object itself;
        int[] anotherArray = myIntArray;  // we're declaring a new reference to the same address (same array in memory);

        System.out.println("myIntArray = " + Arrays.toString(myIntArray)); // [0,0,0,0,0]
        System.out.println("anotherArray = " + Arrays.toString(anotherArray)); // [0,0,0,0,0]

        anotherArray[0] = 1;
        System.out.println("Changing anotherArray[0] = 1");

        System.out.println("After change myIntArray = " + Arrays.toString(myIntArray)); // [1,0,0,0,0]
        System.out.println("After change anotherArray = " + Arrays.toString(anotherArray)); // [1,0,0,0,0]
        // this time, by changing 1 reference, the OBJECT is changed, so both addresses are showing this change this time

        modifyArray(myIntArray);

        System.out.println("After modifyArray myIntArray = " + Arrays.toString(myIntArray)); // [2,0,0,0,0]
        System.out.println("After modifyArray anotherArray = " + Arrays.toString(anotherArray)); // [2,0,0,0,0]

        anotherArray = new int[] {4,5,6,7,8}; // we're assigning this reference to a brand new Array object

        System.out.println("One more time After modifyArray myIntArray = " + Arrays.toString(myIntArray)); // [1,0,0,0,0]
        System.out.println("One more time After modifyArray anotherArray = " + Arrays.toString(anotherArray)); // [4,5,6,7,8]

    }


        private static void modifyArray(int[] array){
            array[0] = 2;
            array = new int[] {1,2,3,4,5}; // myIntArray still referencces to the original array, while this one is a brand new reference to a brand new object, not related to myIntArray

        }

}

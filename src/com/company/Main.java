package com.company;

import com.company.Inheritancestuff.*;
import com.company.Inheritancestuff.house.*;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        Dimensions dimensions= new Dimensions(20,20,5);
        Case theCase= new Case("2200","dell","240",dimensions);
        Monitor monitor= new Monitor("27 inch beast","acer",27,new Resolution(2540,1400));
        MotherBoard motherBoard= new MotherBoard("83-200","asus",4,6,"v2,44");
        PC thePc= new PC(theCase,monitor,motherBoard);
        thePc.powerUp();
        Wall wall= new Wall("west");
        Wall wall2= new Wall("east");
        Wall wall3= new Wall("north");
        Wall wall4= new Wall("south");

        Ceiling ceiling= new Ceiling(12,55);

        Bed bed= new Bed("modern",4,3,2,1);
        Lamp lamp= new Lamp("classic",false,75);
        Bedroom bedroom= new Bedroom("me",wall,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.makeBed();
//        thePc.getMotherBoard().loadProgram("window 1.0");
//        thePc.getTheCase().pressPowerButton();


//        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
//            int largest = 0;
//            for (int i = 0; i < lastUnsortedIndex; i++) {
//                if (intArray[i] > intArray[largest]) {
//                    largest = i;
//
//                }
//            }
//            swap(intArray, largest, lastUnsortedIndex);
//        }
        //insertion sort

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElements = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElements; i--) {
                intArray[i] = intArray[i - 1];//this is where the shifting is happening
            }

            intArray[i] = newElements;

        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[j] = array[i];
        array[j] = temp;
    }

}

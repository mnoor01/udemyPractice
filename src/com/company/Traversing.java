package com.company;

import java.util.Arrays;

public class Traversing {
    public static void main(String[] args) {
        int[] intArray={20,35,-15,7,55,1,-22};
        for (int gap=intArray.length/2;gap>0;gap/=2){
            for (int i = gap; i <intArray.length ; i++) {
                int newElement=intArray[i];

                int j=i;

                while (j>=gap && intArray[j- gap]>newElement){
                    intArray[j]=intArray[j-gap];
                    j-=gap;
                }
                intArray[j]=newElement;

            }
        }
        System.out.println(Arrays.toString(intArray));

    }

    //one method for rescursion
    //another method for merging
    public static void mergeSort(int[] input,int start,int end){
        if (end-start<2){
            return;//this will break the recursion
        }
        //partition the array we can pass
        int mid= (start+ end)/2;
        //doing a mergeSort on the left
        mergeSort(input,start,mid);
        //now handle the right part of the array
        mergeSort(input,mid,end);
        //final part is to merge them all into a single array
        merge(input,start,mid,end);
    }

    private static void merge(int[] input, int start, int mid, int end) {
        if (input[mid-1]<= input[mid]){
            return;
        }

    }
    public static void printCategory(String str){
        //search for the categories.
        int i= 0;
        while(true){
            int found= str.indexOf("category:",i);
            if (found ==-1)break;
            int start=found+9;//start of the actual strength
            int end=str.indexOf(" ",start);
            System.out.println(str.substring(start,end));
            i=end+1;
        }

    }
}

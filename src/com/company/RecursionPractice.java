package com.company;

public class RecursionPractice {
    public static void main(String[] args) {
        String name="Muhaimen";
        System.out.println(allDollars(name));

    }

    public static String allDollars(String str){
        if (str.length()<= 1){
            return str;
        }
        return str.charAt(0)+"$"+ allDollars(str.substring(1));
    }
}

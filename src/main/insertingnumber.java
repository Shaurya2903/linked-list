package main;


import java.util.ArrayList;
import java.util.Scanner;

class JavaArrayList{
    public static void main(String[] args){
        int[] marks = new int[47];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int)(Math.random()*10);
        }
        for (int mark : marks){
            System.out.println(mark);
        }
        int value = 0;
        for (int i=0;i<marks.length;i++){
            if(marks[i] == value){
                System.out.println(value + "found at index" +i);
                break;
            }
        }
    }
}
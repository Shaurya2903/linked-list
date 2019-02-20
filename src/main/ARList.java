package main;

public class ARList {
    public static void main(String[] args){
        System.out.println("commit");
        int[] numbers = new int[9];
        fillValues(numbers);
        print(numbers);
        int index = linearSearch(numbers, 9);
        if (index == -1){
            System.out.println("ELEMENT NOT FOUND");
        }
        else{
            System.out.println("Elemnt found at index:" + index);
        }
    }

    public static void fillValues(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random()*10) +1);
        }
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("i : " +i+ ", value :" +array[i]);
        }
    }
    //search for linear array
    public static int linearSearch(int[] array,int value) {
        int pos = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                pos = i;
            }
        }
        return pos;
    }
}




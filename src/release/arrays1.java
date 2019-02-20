package release;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
class ArrayTry {
    public static void main(String[] args) {
        int[][] numbers = new int[20][20];
        int rowsum = 0 , colsum = 0 , index=0,indexc=0;
        int max = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                numbers[i][j] = (int) (Math.random() * 100);
                rowsum = rowsum + numbers[i][j];
                if(rowsum > max) {
                    max = rowsum;
                    index = i;
                }

                System.out.println("rowsum for " + i + "" + rowsum);
            }

            System.out.println("highest value" + max );
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));

        }

    }
}



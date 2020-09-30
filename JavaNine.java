import java.util.ArrayList;
import java.util.Arrays;

public class JavaNine {

    public static void main(String[] args) {

        int[] randomArray;

        int [] numberArray = new int[10];

        randomArray = new int[20];
        randomArray[1] = 2;

        String[] stringArray = {"just", "random", "words"};

        for(int i = 0; i < numberArray.length; i++){
            numberArray[i] = i;
        }

        int k = 1;
        int l = 1;
        while (k <= 41) { System.out.print("-"); k++;} System.out.println();

        for (int j = 0; j < numberArray.length; j++){
            System.out.print("| " + j + " ");
        }

        while (l <= 41) { System.out.print("-"); l++;} System.out.println();

        for (int row: numberArray) {
            System.out.print(row);
        }

        while (l <= 41) { System.out.print("-"); l++;} System.out.println();
        int[] numberCopy = Arrays.copyOf(numberArray, 5);
        for (int row: numberCopy) {
            System.out.print(row);
        }

        int[] moreNumbers = new int[100];
        Arrays.fill(moreNumbers,2);

        char[][] boardGame = new char[10][10];
        for (char[] row : boardGame){
            Arrays.fill(row, '*');
        }

        int[] numToSort = new int[10];
        for(int i = 0; i < 10; i++){
            numToSort[i] = (int) (Math.random() * 100);
        }

        Arrays.sort(numToSort);
        System.out.println(Arrays.toString(numToSort));

        int whereIs50 = Arrays.binarySearch(numToSort, 50);
        System.out.println(whereIs50);

    }


}

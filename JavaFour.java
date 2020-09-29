import java.util.Scanner;

public class JavaFour {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        pi();

        forloop();

        String contYorN = "Y";

        int h = 1;
        while (contYorN.equalsIgnoreCase("y")){
            System.out.println(h);
            System.out.println("Continue y or n? ");
            contYorN = userInput.nextLine();
            h+=1;
        }
    }

    private static void forloop() {
        for (int i = 10; i >= 1; i --){
            System.out.println(i);
        }
    }

    public static void pi(){
        double myPi = 4.0;

        double j = 3.0;
        // 4 - 4/3 + 4/5 - 4/7 ... next odd n

        while (j < 80000){
            myPi = myPi - (4/j) + (4/(j+2));
            j+=4;
            System.out.println(myPi);
        }

        System.out.println("Actual value is: " + Math.PI);
    }

}

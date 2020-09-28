import java.util.Scanner;

public class JavaTwo {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Your favorite number: ");

        if(userInput.hasNextInt()){
            int numberEntered = userInput.nextInt();
            System.out.println("You entered " + numberEntered);

            int numEnteredTimes2 = numberEntered * 2;
            System.out.println("Your number times two is " + numEnteredTimes2);

            int numEnteredMinus2 = numberEntered - 2;
            System.out.println("Your number minus two is " + numEnteredMinus2);

            numberEntered += 2;
            System.out.println(numberEntered);
        }
        else {
            System.out.println("Enter an integer next time");
        }
    }
}

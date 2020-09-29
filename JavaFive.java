import java.util.Scanner;

public class JavaFive {


    static double myPi = 3.14159; // class variable

    static int randomNumber;
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        int d = 5;
        tryToChange(d); // pass by value
        System.out.println(d);


        int guessResult = 1;
        int randomGuess = 0;

        while(guessResult != -1){
            System.out.println("guess a number between 0 and 50");
            randomGuess = userInput.nextInt();
            guessResult = checkGuess(randomGuess);
        }
        System.out.println("Yes the random is " + randomGuess);

    }

    private static int getRandomNum() {
        randomNumber = (int) (Math.random() * 51);
        return randomNumber;
    }

    public static int addThem(int a, int b){
        return a+b;
    }

    public static void tryToChange(int d){
        d = d + 1;
        System.out.println("try to change version: " + d);
    }

    public static int checkGuess(int guess){
        if (guess == getRandomNum()){
            return -1;
        }else {
            return guess;
        }
    }

}

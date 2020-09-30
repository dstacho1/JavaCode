import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaSix {
    // run time exception: have to catch myself
    // lang.exception caught by compiler


    static Scanner userInput = new Scanner(System.in);


    public static void main(String[] args) {

        // input mismatch exception
        System.out.print("How old are you? ");
        int age = checkValidAge();
        if (age != 0){
            System.out.println("you are " + age);
        }

        // arithmetic exception
        divideByZero(2);

        // file not found exception
        try{
            getAFile("./somestuff.txt");
        }catch ( FileNotFoundException e){
            System.out.println("File Not found");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static int checkValidAge() {
        try{
            return userInput.nextInt();
        } catch (InputMismatchException e) {
            userInput.next();
            System.out.println("That isnt a whole number");
            return  0;
        }
    }

    public static void divideByZero(int a){
        try{
            System.out.println(a/0);
        } catch (ArithmeticException e) {
            System.out.println("You can't do that");
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }
    }

    // calling class needs to handle it the throws
    public static void getAFile(String filename) throws IOException, FileNotFoundException{
        try{
            FileInputStream file = new FileInputStream(filename);
        }
        finally {
            System.out.println("i always execute");
        }

    }



}

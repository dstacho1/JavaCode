import java.util.Scanner;

public class JavaThree {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 50);

        if (randomNumber < 25){
            System.out.println(randomNumber);
        }
        else{
            System.out.println("number wasnt less than 25");
        }
        System.out.println("The random number is " + randomNumber);


        int v1 = 1;
        int v2 = 2;
        // ternary operator
        int biggestValue = (v1 > v2) ? v1 : v2;
        System.out.println(biggestValue);


        Scanner grade = new Scanner(System.in);
        String theGrade = grade.nextLine();

        switch (theGrade)
        {
            case "A":
                System.out.println("Great job");
                break;
            case "b":
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Do better");
                break;
            default:
                System.out.println("You failed");
                break;
        }
    }
}

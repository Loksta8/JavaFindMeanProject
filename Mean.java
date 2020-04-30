import java.util.*;

public class Mean {

    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int mean;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five numbers and I will compute the mean. ");

        try {
            num1 = input.nextInt();
            num2 = input.nextInt();
            num3 = input.nextInt();
            num4 = input.nextInt();
            num5 = input.nextInt();

            mean = getMean(num1, num2, num3, num4, num5);
            System.out.println("The mean is: " + mean);
        }
        catch (Exception e) {
            System.out.println("The user entered a value that was not an Integer. \n");
            System.out.println("Please re-run the program and enter an Integer next time.\n");
        }
    }

    private static int getMean(int num1, int num2, int num3, int num4, int num5) {
        int mean = (num1 + num2 + num3 + num4 + num5)/5;
        return mean;

    }
}

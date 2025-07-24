import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int age = input.nextInt();

        if (age > 0) {
            System.out.println("The age entered is incorrect.");
        } else if ( age < 18 ) {
            System.out.println("Uner 18");
        } else {
            System.out.println("Over 18");
        }
        
        input.close();
    }        
}


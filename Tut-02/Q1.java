import java.util.Scanner;

public class Q1 {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        Double number = input.nextDouble();
        
        System.out.println("Enter a number:");
        Double number2 = input.nextDouble();

        double sum = number + number2;
        System.out.println("The sum is: " + sum);
        
        input.close();
    }    
}

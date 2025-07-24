import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 1st number:");
        double number1 = input.nextDouble();

        System.out.println("Enter 2nd number:");
        double number2 = input.nextDouble();

        double product = number1 * number2;
        System.out.println("The product is: " + product);
        double difference = number1 - number2;
        System.out.println("The difference is: " + difference);
        double quotient = number1 / number2;
        System.out.println("The quotient is: " + quotient);
        double sum = number1 + number2;
        System.out.println("The sum is: " + sum);
      
    input.close();
    }
}

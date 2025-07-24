import java.util.Scanner;
public class Q3 {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a ICT marks: ");
        double ictmarks = input.nextDouble();

        System.out.println("Enter a CW marks:");
        double cwmarks = input.nextDouble();


        if (ictmarks >=30 && cwmarks >= 30) {
            Double overroll = (ictmarks + cwmarks) / 2;
            
            System.out.println("Your Final marks Is:"+ overroll);

            if (overroll >=40) {
                System.out.println("You have passed this module.");
            } else {
                System.out.println("You have failed this module.");
            }
        } else {
            System.out.println("You failed on or both components.");
        }
        input.close();
    }
}
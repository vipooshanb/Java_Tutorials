import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Overall marks:");
        double overallMarks = input.nextDouble();

        if (overallMarks > 100) {
            System.out.println("Invaild value");
        
        } else if (overallMarks >= 70) {
            System.out.println("1st Class Honours(1)");
        } else if (overallMarks >= 60) {
            System.out.println("2nd class Honours Upper Division(2)");
        } else if (overallMarks >=50) {
            System.out.println("2nd Class Honours Lower Division(2)");
        } else if (overallMarks >= 40) {
            System.out.println("3rd Class Honours(3)");
        }
        else if (overallMarks < 40) {
            System.out.println("Invaild");
        } else {
            System.out.println("Invalid value");

        }
        input.close();
    }
}



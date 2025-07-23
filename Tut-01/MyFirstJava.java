import java.util.Scanner;

public class MyFirstJava {
    public static void main (String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter Your NameL:- ");
        String name = input.nextLine();
        System.out.println("Hello," + name);

        input.close();

    }
}
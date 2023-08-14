import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("You entered: " + name);
        System.out.println("Enter the second number");
        String name2 = scanner.nextLine();
        System.out.println("You entered: " + name2);
        try {
            int number = Integer.parseInt(name);
            int number2 = Integer.parseInt(name2);
            int sum = number + number2;
            System.out.println("Sum is: " + sum);
        }
        catch (NumberFormatException ex){
            System.out.println("Error! Your number is not correct");
        }


    }
}

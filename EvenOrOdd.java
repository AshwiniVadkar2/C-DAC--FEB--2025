import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("The number " + num + " is Even.");
        } else {
            System.out.println("The number " + num + " is Odd.");
        }
        
        scanner.close();
    }
}

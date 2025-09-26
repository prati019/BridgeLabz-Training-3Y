import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Enter a positive number less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100:");
            int counter = 100;
            while (counter > 0) {
                if (counter % number == 0) {
                    System.out.print(counter + " ");
                }
                counter--;
            }
        }
        sc.close();
    }
}

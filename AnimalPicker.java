import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to see a dog or a cat?");
        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("dog")) {
            System.out.println("DOG ASCII ART HERE");
        } else if (choice.equalsIgnoreCase("cat")) {
            System.out.println("CAT ASCII ART HERE");
        }
        else {
    System.out.println("Error: Invalid option.");
}
    }
}

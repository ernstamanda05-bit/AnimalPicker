import java.util.Scanner;

public class AnimalPicker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String choice = "";

        while (!(choice.equalsIgnoreCase("dog") || choice.equalsIgnoreCase("cat"))) {

            System.out.println("Would you like to see a dog or a cat?");
            choice = input.nextLine();

            if (!(choice.equalsIgnoreCase("dog") || choice.equalsIgnoreCase("cat"))) {
                System.out.println("Error: Please enter dog or cat.");
            }
        }

        if (choice.equalsIgnoreCase("dog")) {
            System.out.println("Here is a dog picture!");
            System.out.println(" _   _");
            System.out.println("/(. .)\\    )");
            System.out.println("  (*)____/|");
            System.out.println("  /       |");
            System.out.println(" /   |--\\ |");
            System.out.println("(_)(_)  (_)");
        }

        else if (choice.equalsIgnoreCase("cat")) {
            System.out.println("Here is a cat picture!");
            System.out.println(" /\\_/\\");
            System.out.println("( o.o )");
            System.out.println(" > ^ <");
        }

        input.close();
    }
}
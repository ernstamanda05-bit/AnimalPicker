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
}
    }



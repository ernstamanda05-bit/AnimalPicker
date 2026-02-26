import java.util.Scanner;

public class AnimalPicker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String choice = "";

        // Keep asking until valid input
        while (!(choice.equalsIgnoreCase("dog") ||
                 choice.equalsIgnoreCase("cat") ||
                 choice.equalsIgnoreCase("fish") ||
                 choice.equalsIgnoreCase("bird"))) {

            System.out.println("Which animal would you like to see? (dog, cat, fish, bird)");
            choice = input.nextLine();

            if (!(choice.equalsIgnoreCase("dog") ||
                  choice.equalsIgnoreCase("cat") ||
                  choice.equalsIgnoreCase("fish") ||
                  choice.equalsIgnoreCase("bird"))) {

                System.out.println("Error: Please enter dog, cat, fish, or bird.");
                System.out.println();
            }
        }

        // Dog
    if (choice.equalsIgnoreCase("dog")) {
           System.out.println("Here is a dog picture!");
           System.out.println(" _   _");
           System.out.println("/(. .)\\    )");
           System.out.println("  (*)____/|");
           System.out.println("  /       |");
           System.out.println(" /   |--\\ |");
           System.out.println("(_)(_)  (_)");
       }


        // Cat
        else if (choice.equalsIgnoreCase("cat")) {

            System.out.println("Here is your cat:\n");

            System.out.println(" /\\_/\\");
            System.out.println("( o.o )");
            System.out.println(" > ^ <");
        }

        // Fish
        else if (choice.equalsIgnoreCase("fish")) {

            System.out.println("Here is your fish:\n");

            System.out.println("      /`·.¸");
            System.out.println("     /¸...¸`:·");
            System.out.println(" ¸.·´  ¸   `·.¸.·´)");
            System.out.println(": © ):´;      ¸  {");
            System.out.println(" `·.¸ `·  ¸.·´\\`·¸)");
            System.out.println("     `\\\\´´\\¸.·´");
        }

        else if (choice.equalsIgnoreCase("bird")) {
            System.out.println("Here is your bird:\n");
            System.out.println("                           .\n" + //
                                "                          | \\/|\n" + //
                                "  (\\   _                  ) )|/|\n" + //
                                "      (/            _----. /.'.'\n" + //
                                ".-._________..      .' @ _\\  .'\n" + //
                                "'.._______.   '.   /    (_| .')\n" + //
                                "  '._____.  /   '-/      | _.'\n" + //
                                "   '.______ (         ) ) \\\n" + //
                                "     '..____ '._       )  )\n" + //
                                "        .' __.--\\  , ,  // ((\n" + //
                                "        '.'  mrf|  \\/   (_.'(\n" + //
                                "                '   \\ .'\n" + //
                                "                 \\   (\n" + //
                                "                  \\   '.\n" + //
                                "                   \\ \\ '.)\n" + //
                                "                    '-'-'");
        }

        input.close();
    }
}

        
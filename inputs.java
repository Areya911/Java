import java.util.Scanner;

 class inp{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Integer
        System.out.print("Enter an integer: ");
        int myInt = in.nextInt();

        // Float
        System.out.print("Enter a float: ");
        float myFloat = in.nextFloat();

        // Double
        System.out.print("Enter a double: ");
        double myDouble = in.nextDouble();

        // Boolean
        System.out.print("Enter true or false: ");
        boolean myBool = in.nextBoolean();

        // Consume the leftover newline before reading strings
        in.nextLine();

        // Single word (no spaces)
        System.out.print("Enter a single word: ");
        String myWord = in.next();

        // Consume the leftover newline again
        in.nextLine();

        // Full line of text
        System.out.print("Enter a full sentence: ");
        String mySentence = in.nextLine();

        // Character (only first character from input)
        System.out.print("Enter a character: ");
        char myChar = in.next().charAt(0);

        // Display all inputs
        System.out.println("\n--- Your Inputs ---");
        System.out.println("Integer: " + myInt);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Boolean: " + myBool);
        System.out.println("Single word: " + myWord);
        System.out.println("Full sentence: " + mySentence);
        System.out.println("Character: " + myChar);

        in.close(); // good habit to close Scanner
    }
}
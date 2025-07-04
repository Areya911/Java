 import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input steps and direction
        int steps = in.nextInt();
        String direction = in.next().toUpperCase(); // ensure input is case-insensitive

        int x = 0, y = 0;

        if (direction.equals("R")) {
            x += steps;
        } else if (direction.equals("L")) {
            x -= steps;
        } else {
            System.out.println("Invalid direction. Use 'R' or 'L' only.");
            return;
        }

        // Output the final position
        System.out.printf("(%d,%d)\n", x, y);
    }
}
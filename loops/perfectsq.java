import java.util.Scanner;
class inp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sqrt = (int) Math.sqrt(n);  // Get the integer part of square root

        if (sqrt * sqrt == n) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not a Perfect Square");
        }
    }
}

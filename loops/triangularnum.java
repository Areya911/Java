import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (sum < num) {
            sum = sum + i;
            i++;
        }

        if (sum == num) {
            System.out.println(num + " is a triangular number.");
        } else {
            System.out.println(num + " is NOT a triangular number.");
        }
    }
}
 

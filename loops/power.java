import java.util.Scanner;

class inp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long num = scanner.nextLong(); // Base, e.g., 5
        long exp = scanner.nextLong(); // Exponent, e.g., 3
        long ans = 1;

        for (int i = 1; i <= exp; i++) {
            ans = ans * num; // Multiply 'num' exactly 'exp' times
        }

        System.out.print(ans);
    }
}

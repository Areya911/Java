import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n1 = scanner.nextLong();
        long n2 = scanner.nextLong();
        long n3 = scanner.nextLong();
        long n4 = scanner.nextLong();
    long max = Math.max(Math.max(n1, n2), Math.max(n3, n4));
        System.out.printf("Largest is %d", max);
    }
}

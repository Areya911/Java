import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int divi = scanner.nextInt();
        int val = 1;
        while (divi<=num) 
        {
            num = num - divi;
            val++;
        }
        System.out.println(val-1);
    }
}
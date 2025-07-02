import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong(); //7
        long multiple = scanner.nextLong();//4
        long value;
        long sum = 0;
        for (value = 1; value <= multiple; value++) {
            sum = number + sum; //7+7+7+7
        }
        System.out.println(sum);
    }
}

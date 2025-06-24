import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        long num = num1+num2;
        System.out.println("Sum of "+num1+" and "+num2+" is "+num);
    }
}

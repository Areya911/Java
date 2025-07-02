import java.util.Scanner;
class inp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int cube = (int) Math.round(Math.cbrt(n));  
        //Math.cbrt(n) gives the cube root as a double, which may have decimals.so math.round() is used

        if (cube *cube*cube == n) {
            System.out.println("Perfect Cube");
        } else {
            System.out.println("Not a Perfect Cube");
        }
    }
}
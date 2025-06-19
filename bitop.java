package github.bitwise;

public class bitop {
    public static void main(String[] args) {
          int a = 5;  // 0101
        int b = 3;  // 0011

        System.out.println("a & b = " + (a & b));  // 1(0001) ,compares each bit of the numbers 1&1=1,else 0
        System.out.println("a | b = " + (a | b));  // 7(0111) compares each bit of the numbers 10|0=0,else 1
        System.out.println("a ^ b = " + (a ^ b));  // 6 , return 1 if both bits are same else 0,works like XOR
        System.out.println("~a = " + (~a));        // -6 (inverts every bit of the number)
        System.out.println("a << 1 = " + (a << 1)); // 10
        System.out.println("a >> 1 = " + (a >> 1)); // 2
    }
}

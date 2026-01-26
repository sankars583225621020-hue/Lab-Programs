import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num, originalNum, reversed = 0, remainder;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        originalNum = num;

        while (num != 0) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num = num / 10;
        }

        if (originalNum == reversed) {
            System.out.println(originalNum + " is a Palindrome number.");
        } else {
            System.out.println(originalNum + " is NOT a Palindrome number.");
        }

        sc.close();
    }
}

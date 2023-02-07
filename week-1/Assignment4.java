import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
               int originalNumber = n;
	int digits = 0;
    int sum = 0;

    // count the number of digits in the number
    while (originalNumber != 0) {
      originalNumber /= 10;
      digits++;
    }

    // restore the original number
    originalNumber = n;

    // sum the cubes of each digit
    while (originalNumber != 0) {
      int digit = originalNumber % 10;
      sum += Math.pow(digit, digits);
      originalNumber /= 10;
    }

    // check if the sum is equal to the original number
    if (sum == n) {
      result=1;
      System.out.println(result);
    } else {
      System.out.println(result);
    }
    }
}

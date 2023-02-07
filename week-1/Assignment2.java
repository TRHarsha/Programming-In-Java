// calculate sum of  all the numbers divisible by 3 from 0 to n. Print the sum.

import java.util.Scanner;
public class Exercise1_3 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	  int sum=0;
        int count = 1;
    int number = 2;
    while (count < n) {
      if (number / 3 == 0) {
        sum += number;
        count++;
      }
      number =number + 2;
    }

    System.out.println(sum);
       }
}

//to find the largest among three numbers x,y, and z. You should use if-then-else construct in Java.

import java.util.Scanner;  
public class Exercise1_2 {
       public static void main(String[] args) {
Scanner s = new Scanner(System.in); 
        int x = s.nextInt(); 
        int y = s.nextInt();
int z = s.nextInt();
int result = 0;
    if (x >= y && x >= z) {
      System.out.println(x);
    } else if (y >= x && y >= z) {
      System.out.println(y);
    } else {
      System.out.println(z);
    }
       }
}

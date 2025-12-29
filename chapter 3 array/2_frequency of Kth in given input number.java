import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int k = scn.nextInt();
      int count = 0;
      while(n%10 > 0){
        int rem = n%10;
        if(rem == k) count++;
        n /= 10;
      }
      System.out.println(count);
    }
}
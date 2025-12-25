import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int digit = 0;
      int temp = n;
      while(temp != 0){
        temp /= 10;
        digit++;
      }
      int div = (int)Math.pow(10, digit-1);
      while(div != 0){
        int remender = n / div;
        System.out.println(remender);
        n %= div;
        div /= 10;
      }
  }
}
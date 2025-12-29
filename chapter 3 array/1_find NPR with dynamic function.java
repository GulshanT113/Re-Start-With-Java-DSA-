import java.util.*;

public class Main {
    public static int fect(int x){
      int mul = 1;
      for(int i = 1; i <= x; i++) mul *= i;
      return mul;
    }
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int r = scn.nextInt();
      int fect1 = fect(n);
      int fect2 = fect(n-r);
      // To find NPR, the formula is like fectorial of 'N' and 'N-R'. and then "NPR = fect1/fect2".
      int NPR = fect1/fect2;
      System.out.println(NPR);
    }
}
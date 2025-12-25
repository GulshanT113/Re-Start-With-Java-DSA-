import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int star = 1;
      int space = n-1;
      for(int i = 1; i <= n; i++){
        for(int j = 1; j<= space; j++) System.out.print("  ");
        System.out.print("* ");
        space--;
        System.out.println();
      }
  }
}
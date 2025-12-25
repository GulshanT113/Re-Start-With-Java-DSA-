import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      for(int i = n; i > 0; i--){
        for(int j = 1; j <= n; j++){
          if((i+j) <= n) System.out.print("  ");
          else System.out.print("* ");
        } 
        System.out.println();
      }
  }
}
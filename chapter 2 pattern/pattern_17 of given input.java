import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int star = 1;
      int space = n/2;
      int count = 1;
      for(int i = 1; i <= n; i++){
        for(int j = 1; j<= space; j++){
          if(i == (n/2)+1) System.out.print("* ");
           else System.out.print("  ");
        } 
        for(int k = 1; k <= star; k++) System.out.print("* ");
        if(i <= n/2) star++;
        else star--;
        System.out.println();
      }
  }
}
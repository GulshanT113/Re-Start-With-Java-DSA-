import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int star = 1;
      int space = (n*2) - 3;
      for(int i = 1; i <= n; i++){
        for(int j = 1; j <= star; j++) System.out.print("* ");
        for(int j = 1; j <= space; j++) System.out.print("  ");
        if(i == n) star--;
        for(int j = 1; j <= star; j++) System.out.print("* ");
        star++;
        space -= 2;
        System.out.println();
      }
  }
}
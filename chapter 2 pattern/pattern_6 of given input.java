import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int star = (n/2)+1;
      int space = 1;
      for(int i = 1; i <= n; i++){
        for(int k = 1; k <= star; k++) System.out.print("* ");
        for(int j = 1; j<= space; j++) System.out.print("  ");
        for(int l = 1; l <= star; l++) System.out.print("* ");
        if(i <= n/2) {
          star --;;
          space += 2;
        } else {
          star++;
          space -= 2;
        }
        System.out.println();
      }
  }
}
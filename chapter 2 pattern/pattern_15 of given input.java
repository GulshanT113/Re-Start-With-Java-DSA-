import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int star = 1;
      int space = n/2;
      int count = 1;
      for(int i = 1; i <= n; i++){
        for(int j = 1; j<= space; j++) System.out.print("  ");
        int countPro = count;
        for(int k = 1; k <= star; k++){
          System.out.print(countPro + " ");
          if(k <= star/2) countPro++;
          else countPro--;
        } 
        if(i <= n/2) {
          star += 2;
          space--;
          count++;
        } else {
          star -= 2;
          space++;
          count--;
        }
        System.out.println();
      }
  }
}
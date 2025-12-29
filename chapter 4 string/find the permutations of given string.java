import java.util.*;
import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);// this is global scanner this can be use globally.
    
    public static int fect(int n){
      int val = 1;
      for(int i = 2; i <= n; i++) val *= i;
      return val;
    }
    
    public static void permutations(String str){
      int n = str.length();
      int f = fect(n);
      for(int i = 0; i < f; i++){
        StringBuilder sb = new StringBuilder(str);
        int temp = i;
        for(int div = n; div >= 1; div--){
          int q = temp / div;
          int r = temp % div;
          System.out.print(sb.charAt(r));
          sb.deleteCharAt(r);
          temp = q;
        }
        System.out.println();
      }
    }
    
    public static void main(String[] args) {
      String str = scn.next();
      permutations(str);
    }
}
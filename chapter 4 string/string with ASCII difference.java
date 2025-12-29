import java.util.*;
import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);// this is global scanner this can be use globally.
    
    public static String toggle(String str){
      StringBuilder sb = new StringBuilder();
      sb.append(str.charAt(0));
      for(int i = 1; i < str.length(); i++){
        char curr = str.charAt(i);
        char prev = str.charAt(i-1);
        int gap = curr-prev;
        sb.append(gap);
        sb.append(curr);
      }
      return sb.toString();
    }
    
    public static void main(String[] args) {
      String str = scn.next();
      System.out.println(toggle(str));
    }
}
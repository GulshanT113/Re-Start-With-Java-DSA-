import java.util.*;
import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);// this is global scanner this can be use globally.
    
    public static String toggle(String str){
      StringBuilder sb = new StringBuilder(str);
      for(int i = 0; i < sb.length(); i++){
        char ch = sb.charAt(i);
        if(ch >= 'a' && ch <= 'z'){
          char uc = (char)('A' + ch - 'a');
          sb.setCharAt(i, uc);
        }
        else if(ch >= 'A' && ch <= 'Z'){
          char lc = (char)('a' + ch - 'A');
          sb.setCharAt(i, lc);
        }
      }
      return sb.toString();
    }
    
    public static void main(String[] args) {
      String str = scn.nextLine();
      
      System.out.println(toggle(str));
    }
}
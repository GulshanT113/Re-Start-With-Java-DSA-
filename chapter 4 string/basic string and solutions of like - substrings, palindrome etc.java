import java.util.*;
import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);// this is global scanner this can be use globally.
    
    public static void display(int[] arr){
      for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }
    
    public static void inputArray(int[] arr){
      for(int i = 0; i < arr.length; i++) arr[i] = scn.nextInt();
    }
    
    public static Boolean isPalindrome(String str){
      int i = 0;
      int j = str.length()-1;
      while(i <= j){
        char c1 = str.charAt(i);
        char c2 = str.charAt(j);
        if(c1 != c2) return false;
        else {
          i++;
          j--;
        }
      }
      return true;
    }
    
    public static void main(String[] args) {
      // String s = scn.next(); // this read only string before space.
      String str = scn.nextLine(); // this read full line of string.
      // System.out.println(str.length()); // this prints string all Character count.
      // System.out.println(str.charAt(0)); // this gets single Character from string.
      for(int i = 0; i < str.length(); i++){
        for(int j = i+1; j <= str.length(); j++){
          String s = str.substring(i, j);
          if(isPalindrome(s) == true) System.out.println(s);
        } 
      }
      // String[] arr = str.split(" ");
      // for(int i = 0; i < arr.length; i++) System.out.println(arr[i]);
    }
}
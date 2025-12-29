import java.util.*;
import java.util.Scanner;

public class Main {
    public static Scanner scn = new Scanner(System.in);// this is global scanner this can be use globally.
    
    public static void display(int[] arr){
      for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }
    
    public static void inputArray(int[] arr){
      // Scanner scn = new Scanner(System.in);
      for(int i = 0; i < arr.length; i++) arr[i] = scn.nextInt();
    }
    
    public static void subSets(int[] arr){
      
      int limit = (int)Math.pow(2, arr.length);
      for(int i = 0; i < limit; i++){
        String set = "";
        int temp = i;
        for(int j = arr.length-1; j >= 0; j--){
          int rem = temp % 2;
          temp /= 2;
          if(rem == 0) set = "-\t" + set;
          else set = arr[j] + "\t" + set;
        }
        System.out.println(set);
      }
    }
    
    public static void main(String[] args) {
      // Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];
      
      inputArray(arr);
      subSets(arr);
    }
}
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
    
    public static void subArray(int[] arr){
      
      for(int i = 0; i < arr.length; i++){
        for(int j = i; j < arr.length; j++){
          
          for(int k = i; k <= j; k++) System.out.print(arr[k] + " ");
            
          System.out.println();
        }
      }
    }
    
    public static void main(String[] args) {
      // Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];
      
      inputArray(arr);
      subArray(arr);
    }
}
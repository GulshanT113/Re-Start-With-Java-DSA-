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
    
    public static void reverseArray(int[] arr){
      int i = 0;
      int j = arr.length-1;
      while(i <= j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    }
    
    public static void main(String[] args) {
      // Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];
      
      inputArray(arr);
      reverseArray(arr);
      display(arr);
    }
}
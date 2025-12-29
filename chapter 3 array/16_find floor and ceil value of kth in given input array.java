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
    
    public static void binarySearch(int[] arr, int data){
      int l = 0;
      int h = arr.length-1;
      int floor = 0;
      int ceil = 0;
      while(l <= h){
        int m = (l + h) / 2;
        if(arr[m] < data){ 
          l = m + 1;
          floor = arr[m];
        }
        else if(arr[m] > data){ 
          h = m - 1;
          ceil = arr[m];
        }
        else {
          floor = arr[m];
          ceil = arr[m];
          break;
        }
      }
      System.out.println("floor value = " + floor);
      System.out.println("ceil value = " + ceil);
    }
    
    public static void main(String[] args) {
      // Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];
      inputArray(arr);
      int data = scn.nextInt();
      binarySearch(arr, data);
    }
}
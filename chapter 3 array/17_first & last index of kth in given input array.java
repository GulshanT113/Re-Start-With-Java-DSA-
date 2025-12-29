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
    
    public static void firstLastIndex(int[] arr, int data){
      int l = 0;
      int h = arr.length-1;
      int fi = -1;
      while(l <= h){
        int m = (l + h) / 2;
        if(arr[m] < data) l = m + 1;
        else if(arr[m] > data) h = m - 1;
        else {
          fi = m;
          h = m-1;
        }
      }
      System.out.println("first index of '"+ data + "' is = " + fi);
      
      l = 0;
      h = arr.length-1;
      int li = -1;
      while(l <= h){
        int m = (l + h) / 2;
        if(arr[m] < data) l = m + 1;
        else if(arr[m] > data) h = m - 1;
        else {
          li = m;
          l = m+1;
        }
      }
      System.out.println("last index of '"+ data + "' is = " + li);
    }
    
    public static void main(String[] args) {
      // Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] arr = new int[n];
      inputArray(arr);
      int data = scn.nextInt();
      firstLastIndex(arr, data);
    }
}
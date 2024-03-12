import java.util.*;

public class MaxElementArray{  
    static void sort(int[] a, int n){  
        int t = 0;  
        for(int i = 0; i < n; i++){  
            for(int j = 1; j < n - i; j++){  
                if(a[j - 1] > a[j]){  
                    t = a[j-1];  
                    a[j - 1] = a[j];  
                    a[j] = t;  
                }  
            }  
        }  
    }  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements :");
        int a[] = new int[n+1];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        sort(a, n);
        System.out.println("Maximum element in the array: " + a[n-1]);
    }
    
}
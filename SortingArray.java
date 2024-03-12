import java.util.*;

public class SortingArray{  
    static void sort(int[] a, int n){  
        int temp = 0;  
        for(int i = 0; i < n; i++){  
            for(int j = 1; j < n - i; j++){  
                if(a[j - 1] > a[j]){  
                    temp = a[j-1];  
                    a[j - 1] = a[j];  
                    a[j] = temp;  
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
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        sort(a, n);
        System.out.println("Sorted Array :");
        for(int i= 0;i < n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int c = 0;
        for(int i = 0;i < n;i++){
            if(a[i] > num)
            break;
            if(a[i] == num)
            c += 1;
        }
        System.out.println("No of occurrences : " + c);
    }
    
}
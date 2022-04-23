// sorting an array with taking input as well as defining input

import java.util.Scanner;

public class sorting {
    static void sort(int[] ar){
        System.out.println("Original array: ");    
        for (int i = 0; i <ar.length; i++) {     
           System.out.print(ar[i] + " ");    
        }    
        int temp=0;
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]>ar[j]){
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }

            }
        }
        System.out.println("\nArray sorted in ascending order: ");
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }

    }
    public static void main(String[] args) {
        // int[] arr = new int[] {18,7,6,99,22};
        // int[] arr={18,7,6,99,22};   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        } 
        sc.close();
        sort(arr);
    }
}
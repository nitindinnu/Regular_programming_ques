public class bubblesort  {
    public static void bubble_sort(int[] a) {
        int n = a.length;
        int temp=0;
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n-i-1;j++){
                if(a[i]>a[j]){
                    temp = a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
                }
            }  
        }
    

    public static void main(String[] args) {
          int arr[] =  {5,8,7,6,3} ; 
          bubble_sort(arr);
          for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
          }
    }
}


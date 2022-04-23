// finding fibonacci series

public class fibonacci {
    static void fib(int n){
        int n1=0,n2=1,total=0;
        // int n1=3,n2=5,total=3; //to start from 3
        if(n>0){
            for (int i = 0; i < n; i++) {
                System.out.print(total+" ");
                n1=n2;
                n2=total;
                total=n1+n2;
            }
        }

    }
    public static void main(String[] args) {
        fib(10);
    }
}

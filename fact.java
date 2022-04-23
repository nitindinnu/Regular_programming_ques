//factorial using recursion

public class fact {
    public static int fact_recursive(int n) {
        if(n==1)
            return 1;
        else
            return (n * fact_recursive(n-1));
    }
   public static void main(String[] args) {
    //    fact_recursive(10);
    System.out.println(fact_recursive(10));
} 
}

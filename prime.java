//printing prime nums in a range
public class prime {
    static void prim(int n){
        for(int i=2;i<n;i++){
            int count=0;
            for (int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        prim(200);
    }
}

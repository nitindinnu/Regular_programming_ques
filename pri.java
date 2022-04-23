//finding a number prime or not

public class pri {
    static void prim(int n){
        boolean flag=true;;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                flag=false;
                break;
            }    
        }
        if(flag){
            System.out.println("prim");
        }
        else{
            System.out.println("not prime");
        }   
    }
    public static void main(String[] args) {
        prim(5);
        prim(6);
    }
}

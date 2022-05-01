// import javax.lang.model.util.ElementScanner14;

public class leap_year {
    static void leap(int n){
        if((n%4==0 && n%100==0)||(n%100==0))
            System.out.println("leap year");
        else{
            System.out.println("not leap year");
        }    
    }
    public static void main(String[] args) {
        leap(2000 );
    }
    
}
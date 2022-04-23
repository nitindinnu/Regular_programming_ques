// import java.util.Scanner;
//numbers in a range divisble by both 2 & 9
public class ex {
    static void even(int s,int e){
        for(int i=1;i<=e;i++){
            if(i%2==0){
                if(i%9==0){
                    System.out.print(i+" ");
                }
            }

        }
    }
   public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
       even(0,100 );
       
   } 
}

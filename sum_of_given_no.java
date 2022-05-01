import java.util.Scanner;
//
public class sum_of_given_no
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
	    int d,sum=0,n = sc.nextInt();
        int temp=n;
	    
	    while(n>0){
	        d=n%10;
	        sum=sum+d;
	        n=n/10;
	    }

	    
		System.out.println("Sum of every digit in "+temp+" is "+sum);
	}
}
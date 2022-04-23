import java.util.Scanner;
//153 = 1^3+5^3+3^3 =153 its armstrong
class arm{
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int d,sum=0,n = sc.nextInt();
			sc.close();
			int temp = n;
			while(n>0){
				d =n%10;
				n=n/10;
                sum= sum+d*d*d;
			}
			if(temp==sum)
				System.out.println("yes armstrong");
			else
				System.out.println("not armstrong");
	}
}
// 121 = 121 such revesing nums represent same numbers is palindrome
public class palindrome {
    static void pal(int n){
        int d,r=0,temp=n;
        while(n>0){
            d=n%10;
            r =r*10+d;
            n=n/10;
        }
        if(temp==r)
            System.out.println("yes armstrong");
        else
            System.out.println("not armstrong");    

    }
    public static void main(String[] args) {
        pal(121);
        pal(105);
    }
}

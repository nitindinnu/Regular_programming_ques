//swap two numbers without using third variable

public class swapTwo {
    void swap(int a,int b){
        // int temp;
        System.out.println("before swapping "+a+" "+b);
        // temp=a;
        // a=b;
        // b=temp;

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping "+a+" "+b);
    }
    public static void main(String[] args) {
        swapTwo s1= new swapTwo();
        s1.swap(10,20);
        s1.swap(30,40);

    }
}

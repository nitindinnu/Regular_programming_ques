//constructor

class A{
    int a;String name;
    A(){ 
        a=20;name="Nitin";
        /*constructor is a special type of method whose method
        name is same as class name
        default constructor a=0;name=null;*/
    }
    void show(){
        System.out.println(a+" "+name);
    }       
}

class B
{
    public static void main(String[] args) {
        A s1 = new A();
        s1.show();
    }
}
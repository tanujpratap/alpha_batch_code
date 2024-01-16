class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth1(){
        System.out.println("i am method 1 of class a");
    }
}
    class B extends A{
        public void meth1(){
            System.out.println("i am method 1 of class b");
        }
        public void meth3(){
            System.out.println("i am method three of class b");
        }

    }
public class methodoverridingoops {
    public static void main(String[] args) {
         A a=new A();
        a.meth1();
        B b=new B();
        b.meth1();
        
    }
    
}

class base1{
base1(){
    System.out.println("im a constructor of class base1");
}
base1(int a){
    System.out.println("i am a overloaded constructor with value of 0"+a);

}
}
class derived1 extends base1{
    
     derived1(){
      //  super(0);
        System.out.println("i am a constructor of class derived");
    }
    derived1(int a,int b){
        super(a);
        System.out.println("i am a overloaded constructor with value b as"+b);
    }
}
    class childofderived extends derived1{
        childofderived(){
            System.out.println("i am a child of derived constructor");
        }
        childofderived(int x,int y,int z){
            super(x,y);
            System.out.println("i am a derived class constructor with value"+z);
        }

    }

public class constructorininheritence{
    public static void main(String[] args){
       // base1 b=new base1();
       // derived1 d=new derived1(14,9);
        childofderived cd =new childofderived(12,13,14 );

    }
}
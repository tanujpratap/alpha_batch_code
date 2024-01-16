abstract class parents{
    parents(){
        System.out.println("i am a constructor of abstract class");
    }
    public void sayhello(){
        System.out.println("hello");
    }
    abstract public  void greet();
    abstract public  void greet2();

}
class child extends parents{
    public void greet(){
        System.out.println("good morning");
    }
        public void greet2(){
            System.out.println("good after noon");
        }
    }
abstract class child3 extends parents{
    public void th(){
        System.out.println(" iam good");
    }
}
public class abstractclassoops {
    public static void main(String[] args) {
        child c=new child();
        c.greet();
        c.greet2();
        
            
        
        
    }
    
}

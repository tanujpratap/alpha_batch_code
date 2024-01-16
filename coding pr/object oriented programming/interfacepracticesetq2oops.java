class monkey{
    void jump(){
        System.out.println("jumping.....");
    }
    void bite(){
        System.out.println("biting...");
    }


}
interface basicanimalinterface{
    void eat();
    void sleep();
}
class human extends monkey implements basicanimalinterface {
    void speak(){
        System.out.println("hello sir");
    }
   public void eat(){
    System.out.println("eating..");

    }
    public void sleep(){

    }
}
public class interfacepracticesetq2oops {
    public static void main(String[] args) {
        human harrry=new human();
        harrry.eat();
        monkey m1=new human();
        m1.jump();
        m1.bite(); 
    }
    
}

abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen{
    void write(){
        System.out.println("refill.......");
    }
    void refill(){
        System.out.println("changing the nib.....");
    }
    void changenib(){
        System.out.println("changing the nib");
    }

}
public class interfacepracticeset {
    public static void main(String[] args) {
        fountainpen pen=new fountainpen();
        pen.changenib();
        
    }
    
}

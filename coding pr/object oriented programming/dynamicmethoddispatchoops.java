 class phone{
    public void on(){
        System.out.println("the phone is ringing");

    }
    public  void greet(){
        System.out.println("good morning");
    }

 }
 class smartphone extends phone{
    public void welcome(){
        System.out.println("apka swagat h");
    }
    public void on(){
        System.out.println("the phone is on running mode");
    }
 }
 public class dynamicmethoddispatchoops {
    public static void main(String[] args) {
        phone obj=new smartphone();
        obj.on();
           
        
    }
    
}

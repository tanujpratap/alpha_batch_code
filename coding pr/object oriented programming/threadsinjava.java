class mythread1 extends Thread{
    public void run(){
        while(){
        System.out.println("my threadd is runnning");
        System.out.println("i am happy");
        }
    }

}
class mythread2 extends Thread{
    public void run(){
        while(){
            System.out.println("thread 2 is running");
            System.out.println("i am sad");
        }
    }
}
public class threadsinjava {
    public static void main(String[] args) {
        mythread1 t1=new mythread1();
        mythread2 t2=new mythread2();
        t1.run();
        
    }
    
}

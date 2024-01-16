class mythr extends Thread{
    public mythr(String name){
        super(name);
    }
    public void run(){
      int i=30;
            System.out.println("thank u");
        
      //  while(true){
      //      System.out.println("i am thread");
      //  }
    }

}
public class constructorinthreads {
    public static void main(String[] args) {
        mythr t=new mythr("harry");
        mythr t1=new mythr("tanuj");
    

        t.start();
        t1.start();
        System.out.println("the id of thread is"+t.getId());
        System.out.println("the id of thread is"+t1.getId());
        System.out.println("the name of the thread "+t.getName());
        System.out.println("the name of the thread "+t1.getName());
        
    }
    
}

class mythr extends Thread{
    public mythr(String name){
        super(name);
    }
    public void run(){
      int i=30;
            System.out.println("thank u   "+this.getName());
    }
}
public class priorityinthreads {
    public static void main(String[] args) {
        mythr t1=new mythr("harry");
        mythr t2=new mythr("tanuj");
        mythr t3=new mythr("harry2");
        mythr t4=new mythr("tanuj2");
        mythr t5=new mythr("harry3");
        mythr t6=new mythr("tanuj3");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    
    
         
    }
    
}

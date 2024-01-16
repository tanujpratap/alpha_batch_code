interface mycamera{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("good morning");
    }

    default void record4kvideo(){
        greet();
        System.out.println("recording in 4k");
    }
}
interface mywifi{
    String[] getnetwork();
    void connectnetwork(String network);


    
}
class mycellphone{
    void callnumber(int phonenumber){
        System.out.println("calling.........."+phonenumber);
    }
    void pickcall(){
        System.out.println("connecting....");
    }
  // void takesnap(){
  //     System.out.println("taking snap...");
  // }
}
class mysmartphone extends mycellphone implements mywifi,mycamera{
      public void takesnap(){
       System.out.println("taking snap...");
   }
   public void recordvideo(){
    System.out.println("taking snap");
   }
   
   public String[] getnetwork() {
       System.out.println("getting list of networks");
    String [] networklist={"jio","vodafone","idea"};
    return networklist;
   }
    public void connectnetwork(String network){
        System.out.println("connecting to"+network);
    }
       
   }

 
public class defaultmethodoops {
    public static void main(String[] args) {
        mysmartphone ms=new mysmartphone();
        ms.record4kvideo();
        ms.greet();//throws an error
        String [] ar=ms.getnetwork();
        for(String item:ar){
            System.out.println(item);
        }

        
    }
    
}

class myemployee{
    private int id;
    private String name;
    public myemployee(String myname,int myid){
         id=myid;
         name=myname;
    }
    public String getname(){
        return name;
    }
   /* public void setname(String n){
        name=n;
    }*/
    public int getid(){
        return id;
    }
   // public void setid(int i){
      //  id=i;

   // }
}public class constructor {
    public static void main(String[] args) {
        myemployee tanuj=new myemployee("tanuj   ",12);
       // tanuj.setname("harry");
        System.out.println(tanuj.getname());
        //tanuj.setid(12);
        System.out.println(tanuj.getid() );
        
    }
    
}

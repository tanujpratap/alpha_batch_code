class myemployee{
    private int id;
    private String name;
    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;
    }
    public int getid(){
        return id;
    }
    public void setid(int i){
        id=i;

    }
}public class gettersetteraccessmodifier {
    public static void main(String[] args) {
        myemployee tanuj=new myemployee();
        tanuj.setname("harry");
        System.out.println(tanuj.getname());
        tanuj.setid(12);
        System.out.println(tanuj.getid() );
        
    }
    
}

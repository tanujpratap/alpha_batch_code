class base{
    int x;
    
    public void printme(){
        System.out.println("inheritence topic");
    }
    public int getx(){
        return x;
    }
    public void setx(int x){
        this.x=x;
    }
}
    class derived extends base{
        int y;
        public void sety(int y){
            this.y=y;
        }
    
    public int gety(){
        return y;

    }

}
public class inheritence {
    public static void main(String[] args) {
        base b=new base();
        b.setx(4);
        System.out.println(b.getx());
        derived d=new derived();
        d.sety(7);
        System.out.println(d.gety());
        System.out.println(d.getx());
        System.out.println(b.gety());//not possible
        
    }
    
}

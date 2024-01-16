interface  bycycle{
    int a=45;
    void applybreak(int decrement);

    
    void speedup(int increment);

    

}
interface hornbycycle{
    void blowhornk3g();
    void blowhornbullet();
}
class avoncycle implements bycycle,hornbycycle{
   // int speed=12;
    void blowhorn(){
        System.out.println(" pee  pee po po");
    }
     public void applybreak(int decrement){
        System.out.println("applying break");

    }
    public void speedup(int increment){
        System.out.println("speeding up");
    }
    public void blowhornk3g(){
        System.out.println("sometime happy sometime sad");
    }
    public void blowhornbullet(){
System.out.println("po po");
    }


}
public class interfaceoops {
    public static void main(String[] args) {
        avoncycle harrycyccle=new avoncycle();
        harrycyccle.applybreak(12);
        System.out.println(harrycyccle.a);
        harrycyccle.blowhornbullet();
        
    }
    
}

class circle{
    public int radius;
    circle(int r){
        System.out.println("i am circle parameterized constructor");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;

    }


}
class cylinder extends circle{
    public int height;
    cylinder(int  r,int h){
        
        super(r);
        this.height=h;
        System.out.println("i am cylinder 1 parameterized constructor");


    }
    
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class inheritencepracticeoops {
    public static void main(String[] args) {
       // circle c=new circle(12);
        cylinder obj=new cylinder(12,55);
        System.out.println(obj.area());
        System.out.println(obj.volume());
    }
    
}

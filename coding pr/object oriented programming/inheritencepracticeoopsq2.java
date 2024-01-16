class rectangle{
   public int length;
   public int width;
   rectangle(int l,int w){
    this.length=l;
    this.width=w;

   }
   public int area(){
    return this.length*this.width;
   }

}
class cuboid extends rectangle{
    public int height;
    cuboid(int h,int l,int w){
       
        super( l, w);
        this.height=h;

    }
    public int volume(){
        return this.length*this.width*this.height;
    }
}

public class inheritencepracticeoopsq2 {
    public static void main(String[] args) {
        rectangle t=new rectangle(12,14);
        System.out.println(t.area());
        cuboid cv=new cuboid(12,13,14);
        System.out.println(cv.volume());
        
    }
    
}

class circle{
    int radius;
    public void setradius(int r){
        radius=r;
    }
    public float getarea(){
        return 3.14F*radius*radius;
    }
    public float getperimeter(){
        return 2*3.14F*radius;
    }
    
}public class oopsquiz {
    public static void main(String[] args) {
        circle c=new circle();
        c.setradius(12);
        System.out.println(c.getarea());
        System.out.println(c.getperimeter());
        
    }
    
}

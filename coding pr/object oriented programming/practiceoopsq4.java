class rectangle{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length*breadth);
    }
}public class practiceoopsq4 {
    public static void main(String[] args) {
        rectangle rq=new rectangle();
        rq.length=12;
        rq.breadth=14;
        System.out.println(rq.area());
        System.out.println(rq.perimeter()); 
        
    }
    
}

class dog{
    public void barking(){
        System.out.println("the dog bark at the stranger");

    }
    public void sleeping(){
        System.out.println("the dog sleep with attention");
    }
}
class cat extends dog{
    public void colour(){
        System.out.println("the colour of the cat is also black");
    }
    public void cute(){
        System.out.println("so everryone want to love her");
    }
}
    public class inheritencequizoops {
    public static void main(String[] args) {
        cat c=new cat();
        c.barking();
        dog d=new dog();
        d.cute();
        
        
    }
    
}

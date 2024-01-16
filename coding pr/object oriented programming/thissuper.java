class ekclass{
    int a;
    ekclass(int v){
        this.a=v;
    }
    public int getA(){
        return a;
    }
    public int return1(){
        return 1;
    }
} 
 class doclass extends ekclass{
    doclass(int c){
        super(c);
        System.out.println("i am a constructor");
    }

}
    public class thissuper {
    public static void main(String[] args) {
        ekclass e=new ekclass(5);
        System.out.println(e.getA());
        doclass dc=new doclass(65);
        
    }
    
}

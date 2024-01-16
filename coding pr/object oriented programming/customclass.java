class employee{
    int id;
    String name;
    int sallery;
    public void printdetails(){
        System.out.println(" my id is"+id);
        System.out.println("my name is"+name);
    }
    public int getsallery(){
        return sallery;
    }
}
    public class customclass{
    public static void main(String[] args) {
        
    

        
        employee harry=new employee();//instantiating a new employee object
        employee john=new employee();
        //setting attributes
        harry.id=12;
        harry.name="tanuj pratap solanki";
        john.id=13;
        john.name="john cena";
        harry.sallery=34000;
        john.sallery=12000;
        int sallery=john.sallery;
           
      // System.out.println(harry.id);
      // System.out.println(harry.name);
      // harry.printdetails();
      // System.out.println(john.name);
      // System.out.println(john.id);
      // john.printdetails();
      System.out.println(harry.sallery);
      System.out.println(john.sallery);
System.out.println(john.sallery);
System.out.println();
    }
}
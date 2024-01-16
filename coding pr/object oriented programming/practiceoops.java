class empployee{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;

    }
}
    public class practiceoops {
    public static void main(String[] args) {
        empployee harry=new empployee();
        harry.setname("tanuj solanki");
        System.out.println(harry.getname());
        harry.salary=12000;
        System.out.println(harry.getsalary());
        
    }
    
}

import java.util.Scanner;
 public class conditional {
    public static void main(String[] args) {
        System.out.println("enter the age ");
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    if(age>=18){
        System.out.println("you are eligible");
    }
    else{
            System.out.println("you are not eligible for voting");
        }
    


        
    }
    
}

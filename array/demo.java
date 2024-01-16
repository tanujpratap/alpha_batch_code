import java.util.Scanner;
class lenear{
    void data(){
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int key;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("enter the key which you want to seach:");
        key=sc.nextInt();

    }
    void search(){
        int flag=0,pos;
        for(int i=0;i<10&&flag==0;i++){
            if (a[i]==key){
                flag=1; 
                pos=i+1;
            }

        }
        if(flag==1){
            System.out.println("number found atyv position"+pos);
        }
        else{
            System.out.println("number not found");
        }
    }
}
public class demo {
    public static void main(String[] args) {
        
        lenear aa=new lenear();
        aa.data();
        aa.search();
    }
    
}

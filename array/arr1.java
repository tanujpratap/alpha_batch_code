import java.util.Scanner;
class arr1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[5];
       // int[]arr={1,2,3,45,56};
        for(int i=0;i<arr.length;i++){
           
            arr[i]=sc.nextInt();
            System.out.println(Arrays.toString(arr));
        }
       // arr[0]=12;
       // arr[1]=13;
       // arr[2]=14;
       // arr[3]=18;
       // arr[4]=19;
     /*  for(int i=0;i<arr.length;i++){
       System.out.println(arr[i]);
        }*/
      // for(int num:arr){
      //     System.out.print(num+"  ");
      // }
    }
}
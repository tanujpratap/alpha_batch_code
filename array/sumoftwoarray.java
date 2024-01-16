public class sumoftwoarray {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5};
        int [] b={7,8,9,10};
        int k=0;
        int []c=new int[5];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                c[k]=a[i]+b[j];

            }
        }
        for(k=0;k<c.length;k++){
            System.out.println("the third array is"+c[k]);
        }
    }
    
}

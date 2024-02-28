import java.util.*;
class Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of digits: ");
        int n=sc.nextInt();
        int c[]=new int[5];
        System.out.print("Enter the array elements: \n");
        for(int i=0;i<n;i++){
            c[i]=sc.nextInt();
        }    
        System.out.print("Array elements are: \n" );
        for(int i=0;i<n;i++){
            System.out.println(c[i]);
        }
    }
}

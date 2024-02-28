import java.util.*;
class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int x=n;
        int temp=0;
        if(n<1000){
            System.exit(0);
        }
        while(n>=1){
            int a=n%10;
            temp=a+temp*10;
            n=n/10;
        }
        if(temp==x){
            System.out.print("Palindrome number");
        }
        else{
            System.out.print("Not a palindrome number");
        }
    }
}
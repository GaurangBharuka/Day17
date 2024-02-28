import java.util.*;
class Discount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Cost price: ");
        int n1=sc.nextInt();
        System.out.print("Discount: ");
        float n2=sc.nextInt();
        float res=(n2/100)*n1;
        if(n1<0 || n2<0){
            System.exit(0);
        }
        else if(res<0){
            System.exit(0);
        }
        System.out.print("Congrats you are getting a discount of " +n2+ "% i.e " +res+ "$ off");
    }
}

import java.util.*;

class MathOper2 {

    static Scanner ent=new Scanner(System.in);

    public static void main (String Owen[]){
        int N1=10, N2=4;


    System.out.print("enter 1st No. : ");
    N1=ent.nextInt();
    System.out.print("enter 1st No. : ");
    N2=ent.nextInt();


    System.out.println("Sum = " + Sum(N1,N2));

    System.out.println("Difference = " + Diff(N1,N2));

    System.out.println("Product = " + Prod(N1,N2));

    System.out.println("Quotient = " + Quot(N1,N2));

    System.out.println("Remainder = " + Rem(N1,N2));





}
    
    static int Sum (int x, int y){

    int ans;
    
    ans=x+y;

    return ans;
}

    static int Diff (int x, int y){

    int ans;
    
    ans=x-y;

    return ans;
}
    static int Prod (int x, int y){

    int ans;
    
    ans=x*y;

    return ans;
}
    static int Quot (int x, int y){

    int ans;
    
    ans=x/y;

    return ans;
}
    static int Rem (int x, int y){

    int ans;
    
    ans=x%y;

    return ans;
}
}

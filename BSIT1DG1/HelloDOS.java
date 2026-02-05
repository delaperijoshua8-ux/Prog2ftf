import java.util.*;

 class HelloDOS{

static Scanner ent= new Scanner (System.in);
static int jn1=0,jn2=0;


static int Sum(int x, int y){
return x + y;
}


public static void main (String Owen[]){

System.out.println("Hello");
System.out.print("Enter the First number: ");
jn1=ent.nextInt();
System.out.print("Enter the Second number: ");
jn2=ent.nextInt();
System.out.print("The sum of  " + jn1 + " and " + jn2 + " is " + Sum(jn1,jn2));




}

}
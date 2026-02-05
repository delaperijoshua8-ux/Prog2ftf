import java.util.*;

class SetA2{


static  Scanner ent=new Scanner(System.in);

static int jocount=0;
static int jecount=0;
public static void main (String Owen[]){

int jn=0;
int count=0;

System.out.print("how many numbers: " );
count=ent.nextInt();
	int[] jarray= new int [count];


for (int i =0 ; i < count ;++i)
	{
	System.out.print("Enter number "  + (i +1) +" : ");
	jn=ent.nextInt();
	jarray[i]=jn;
	System.out.println("The number is " +  CheckOorE(jn));
	}

System.out.println("There are " + jecount  + "  even Numbers");

for (int i =0 ; i < count ;++i)
	{
	if (jarray[i] % 2 ==0)
	{
System.out.println(jarray[i]);
	}
	else
	{
	continue;
	}
	}
System.out.println("There are " + jocount  + "  Odd Numbers");

for (int i =0 ; i < count ;++i)
	{
	if (jarray[i] % 2 ==1)
	{
System.out.println(jarray[i]);
	}
	else
	{
	continue;
	}
	}


}
	

	static String CheckOorE(int x){

	if (x  %2 == 0)
	{
	++jecount;
	return "Even";
	}
	else
	{
  	++jocount;
	return "Odd";
	}
}

}
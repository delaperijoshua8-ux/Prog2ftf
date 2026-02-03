/*
Joshua owen p. De La Peri
BSIT1DG1
This program will show which among the 3 number is the highest
*/

import java.util.*;

class PE04JD {

public static void main (String Owen[]){

	Scanner ent=new Scanner(System.in);

	int jn1=0, jn2=0,jn3=0;

	System.out.print("Enter the First Number:  ");
	jn1=ent.nextInt();
	System.out.print("Enter the Second  Number:  ");
	jn2=ent.nextInt();
	System.out.print("Enter the Third  Number:  ");
	jn3=ent.nextInt();
	
if (jn1 > jn2 && jn1>jn3)
	{ 
	System.out.print("The largest number is " + jn1);
	}
else if (jn2 > jn1 && jn2>jn3 )
	{
	System.out.print("The largest number is " + jn2);
	}
else 
	{
	System.out.print("The largest number is " + jn3);
	}


    }


}
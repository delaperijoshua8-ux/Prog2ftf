/*
Joshua Owen P. De La Peri
BSIT 1DG1
This program will display the relationship of 2 numbers
*/

import java.util.*;

class PE03JD {

public static void main (String Owen[]){

	Scanner ent=new Scanner(System.in);

	int jn1=0, jn2=0;

	System.out.print("Enter the First Number:  ");
	jn1=ent.nextInt();
	System.out.print("Enter the Second  Number:  ");
	jn2=ent.nextInt();
	
if (jn1 == jn2)
	{
	System.out.print("First Number: " + jn1 + " is equal to Second Number: " + jn2);
	}
else if (jn1 < jn2 )
	{
	System.out.print("First Number: " + jn1 + " is less than the Second Number: " + jn2);
	}
else 
	{
	System.out.print("First Number: " + jn1 + " is greater  than the Second Number: " + jn2);
	}


    }


}
/*
Joshua Owen P. De La Peri
BSIT1DG1
Determin if number is zero, positive, or negative
*/

import java.util.*;
class PE02JD {

public static void main (String Owen[]){

	Scanner ent=new Scanner (System.in);

	int jn=0;
	
	System.out.print("Enter a Number: ");
	jn=ent.nextInt();
	
	if (jn == 0 )
	{
	System.out.print("The number  is  Zero");	
	}
	else if (jn <0)
	{
	System.out.print("The number is Negative ");
	}
	else
	{
	System.out.print("The number is Positive ");
	}

   }
}
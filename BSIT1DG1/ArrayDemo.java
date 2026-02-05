class ArrayDemo{

public static void main (String Owen[]){

int  [] jarray = new int [5];

jarray[0] = 25;
jarray[1] = 12;
jarray[2] = 24;
jarray[3] = 80;
jarray[4] = 45;

System.out.println("Element at 1: " + jarray[0] );
System.out.println("Element at 2: " + jarray[1] );
System.out.println("Element at 3: " + jarray[2] );
System.out.println("Element at 4: " + jarray[3] );
System.out.println("Element at 5: " + jarray[4] );

for ( int ji=0; ji<jarray.length; ++ji)
	{
	System.out.println("Element at " + (ji+1) +": " + jarray[0] );
	}

	}
}
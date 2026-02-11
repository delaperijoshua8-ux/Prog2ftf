import java.util.*;


class GradeAnalyzer{

public static void main (String Owen[]){

Scanner ent=new Scanner (System.in);

int jsize=0,sum=0,highest=0;

System.out.print("Enter the number of Grades you want to input: ");
jsize=ent.nextInt();


int[]jarr=new int[jsize];

for (int i=0; i < jsize; ++i)
{
System.out.print("Grade " + (i + 1) + " : ");
jarr[i]=ent.nextInt();
}

highest= jarr[0];


for (int gr:jarr)
{
sum=sum+gr;
 if(gr>highest)
	{
	highest=gr;
	}
}


double ave = (double) sum/jarr.length;
System.out.println("Average Grade:  " + ave);
System.out.println("Highest Grade " +highest);


}


}
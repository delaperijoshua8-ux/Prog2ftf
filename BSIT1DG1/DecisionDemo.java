import java.util.*;

class DecisionDemo{

static Scanner ent=new Scanner(System.in);
static double jgrade=0;
static int jday=0;

public static void main (String Owen[]){

System.out.print("Enter your grade: ");
jgrade=ent.nextDouble();

System.out.println(gPassorFail(jgrade));
System.out.println(geval(jgrade));

System.out.print("Enter a number [1 to 7]: ");
jday=ent.nextInt();

System.out.print(day(jday));

	}
	


static String  gPassorFail(double jg){
if (jg> 74.4)
{
return "passed";
}
else
{
return "Failed";
}
}

static String geval (double jg){

if (jg > 89)
{
return"Excellent";
}
else if (jg > 79)
{
return "Very Good";
}
else if (jg >74)
{
return"Good";
}
else
{
return"Poor";
}
}

static String day(int d){

switch(d){

	case 1:  return "Monday"; 
	case 2:  return "Tuesday";
	case 3:  return "Wednesday";
	case 4:  return "Thursday";
	case 5:  return "Friday";
	case 6:  return "Saturday";
	case 7:  return "Sunday";
	default: return "Invalid";
}
}

}


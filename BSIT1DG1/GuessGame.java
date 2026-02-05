import java.util.*;

class GuessGame{

public static void main (String Owen[]){

Scanner ent= new Scanner(System.in);

Random JN= new Random();
int  Sec= JN.nextInt(101);
int guess = 0 ;
String inp= "";

do {
Sec= JN.nextInt(101);
guess  = 0;

do{

System.out.print("Guess a number from 1 to 100: ");
guess=ent.nextInt();

if (guess>Sec)
	{
System.out.println("Too high" );
	}
else if (guess<Sec)
	{
System.out.println("Too low");
	}
else 
	{
System.out.println("Congrats");
	}


}while (guess != Sec);

System.out.print("Do you want to play again? (Y/N): ");
inp=ent.next();

}while(!inp.equalsIgnoreCase("N"));
System.out.print("Thanks for Playing");

}

}
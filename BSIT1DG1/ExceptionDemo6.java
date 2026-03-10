import java.util.*;
class ExceptionDemo6{
    public static void main (String Owen[]){
         Scanner ent= new Scanner(System.in);

  try{
        System.out.println("Enter a number: ");
        int num = ent.nextInt();
        System.out.println("You entered: " + num);
     }
  catch (Exception e)
    {
    System.out.println(e.getMessage());    
    }

}
 




}     

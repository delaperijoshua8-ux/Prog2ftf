
// Name: Joshua Owen P. De La peri
import java.util.*;
class SGCalcEH{
    public static void main (String Owen[]){
         Scanner ent= new Scanner(System.in);

    double [] arrgrade = new double [2];
    double sumg=0 ;
  try{
        System.out.print("Enter student name: ");
        String sname= ent.nextLine();
      if (sname.isEmpty())
      {
           throw new Exception ("Please enter Student Name");
    
       }
        

    for  (int i=0; i<=arrgrade.length; i++){
        System.out.print("Enter grade "  + (i+1) + ": ");
        arrgrade[i] = ent.nextInt();
        if (arrgrade[i] > 100)
      {
           throw new Exception ("Invalid Grade input");

      }
        if (arrgrade[i] < 1)
      {
           throw new Exception ("Invalid Grade input");

      }
           sumg = sumg +  arrgrade[i];       
       }  
     double ave = sumg/ arrgrade.length;
    System.out.println("Average: " + ave);
     }
  catch (InputMismatchException e)
    {
    System.out.println("Invalid Grade");    
    }
  catch (Exception e)
    {
    System.out.println(e.getMessage());    
    }

 
   
}
 




}     

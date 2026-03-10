
class ExceptionDemo3{

public static void main (String Owen[]){

try {
    int o[] = new int[5];
    o[6]= 25;
    int num = 10/5;
    System.out.print(num);
}
catch (Exception e) {
  //  System.out.println("Error Occured");
    System.out.println(e.getMessage());    
}
finally {  
    System.out.println("This block always executes");
} 

 
}



}

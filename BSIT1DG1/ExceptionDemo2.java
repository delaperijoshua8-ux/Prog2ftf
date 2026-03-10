
class ExceptionDemo2{

public static void main (String Owen[]){

try {
    int arr[] = new int [3];
    arr[2] = 10/0;
}
catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array index error");
}
catch (Exception e){  
    System.out.println("general Exception");
} 

    System.out.println("No error");
}



}

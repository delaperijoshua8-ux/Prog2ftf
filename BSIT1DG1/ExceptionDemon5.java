import java.io.*;
class ExceptionDemo5{

    static void readFile() throws IOException {
    FileReader file = new FileReader("test.txt");
}
    public static void main (String Owen[]){
        try {
            readFile();
            System.out.println("Success");
        }
        catch(IOException e){
            System.out.println("File not found");
        } 

}
 




}     

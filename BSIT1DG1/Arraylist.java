import java.util.*;

class Arraylist {

public static void main (String Owen[]){

ArrayList<String> Name= new ArrayList <String>();

ArrayList<Integer> Age= new ArrayList <Integer>();

ArrayList<Double> Grade= new ArrayList <Double>();

ArrayList<String> Name2= new ArrayList <String>();

ArrayList<Integer> Age2= new ArrayList <Integer>();

ArrayList<Double> Grade2= new ArrayList <Double>();

Name.add("Lebron James");
Name.add("Giannis Antetokounmpo");
Name.add("Stephen Curry");
Name.add(0,"Kawhi");
//Name.set(2,"Derozan");
//Name2.addAll(Name);



Age.add(41);
Age.add(30);
Age.add(38);
Age.add(1,37);
//Age.remove(3);

Grade.add(90.5);
Grade.add(91.5);
Grade.add(94.5);
Grade.add(1,98.5);
//Grade.remove(Double.valueOf(91.5));
//Grade.clear();

System.out.println(Name);
System.out.println(Age);
System.out.println(Grade);
//System.out.println(Name2);

for (int i=0; i<Grade.size(); ++i)
{
System.out.println("Name: " + Name.get(i));
System.out.println("Age: " + Age.get(i));
System.out.println("Grade: " + Grade.get(i));
System.out.println();
}

}


}

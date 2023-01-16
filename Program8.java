
public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(111,"Karan");  
		 Student s2 = new Student(222,"Aryan");  
		 //we can change the college of all objects by the single line of code  
		 //Student.college="BBDIT";  
		 s1.display();  
		 s2.display();  
		 Counter c1=new Counter();  
		 Counter c2=new Counter();  
		 Counter c3=new Counter(); 
		 
	}

}
class Student{  
	   int rollno;//instance variable  
	   String name;  
	   static String college ="ITS";//static variable  
	   //constructor  
	   Student(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	   //method to display the values  
	   void display (){System.out.println(rollno+" "+name+" "+college);}  
	   
	   
	}  

class Counter{  
static int count=0;//will get memory each time when the instance is created  
  
Counter(){  
count++;//incrementing value  
System.out.println(count);  
}  
}
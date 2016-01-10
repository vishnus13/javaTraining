/*
 School class has static school name variable 
  It is same for all students 
 and can be used many times 
 */
class School{
	static String schoolname="TAMUC";
		
}
/*
 Student cls is child cls of school cls
 It has name and roll num 
 It also has constructor and super cls is also invoked
 this is used to assign values of student class variables to parameters
 */
class Student extends School{
	String Name;
	int rollnum;

	
	Student(String n,int r){
		super();
		this.Name=n;
		this.rollnum=r;
		
		System.out.println("Name of the student:"+Name+" "+"Rollnum:"+rollnum+" "+"School:"+schoolname);
	}
}
/*
 Sample cls is the child cls of student cls
 here  multi-level inheritance is implemented
 object is created to sample cls  in main and values are passed to constructor
 */
public class Sample extends Student {

	Sample(String n, int r) {
		super(n, r);	
	}

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("Students enrolled:");
		Sample s=new Sample("john",111);
		Sample s1=new Sample("sam",112);		
		
	}	
		
}

//NAME  :  PACKIYA REGINA
//BATCH  : CG2576



//print student details forward and backward direction using listiterator methods
import java.util.*;
class Student
{
	int sid;//data members
	String sname;
	int marks;
	Student(int sid,String sname,int marks)//parameter constructor
	{
		this.sid=sid;
		this.sname=sname;
		this.marks=marks;
	}
	public String toString()//print 
	{
		return sid+  ", " +sname+  ", " +marks;
	}
}
public class List1
{
	public static void main(String[] args)
	{
		Student s1=new Student(101,"Amit",100);//give input
		Student s2=new Student(102,"Bala",100);
		ArrayList<Student> al=new ArrayList<Student>();//create one arraylist
		al.add(s1);
		al.add(s2);
		ListIterator itr=al.listIterator();//create listiterator to traverse the elements
		System.out.println("Displaying the student detains in forward direction:");
		while(itr.hasNext())//using hasnext() details are printed in forward direction 
		{
			System.out.println(itr.next());
		}
		System.out.println("Displaying the student detains in backward direction:");
		while(itr.hasPrevious())//using hasPrevious() details are printed in backward direction 
		
		{
			System.out.println(itr.previous());
		}
	}
}

		
		
		
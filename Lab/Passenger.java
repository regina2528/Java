//create passenger detail using setter ,getter methods
package airline3;
import  airline1.*;
import airline2.*;
import java.lang.*;//import the packages
import java.util.*;
import java.util.Scanner.*;

class InvalidUserIdException extends Exception//crete invalid userid exception
{
	public void InvalidUserIdException()
	{
	}
}
 public class Passenger
{
	private int bookid;//all the datamembers are declare in private
	private int passengerid;
	private String pname;
	private int age;
	private String booking_status;
	void setBookid(int x)//set the bookid
	{
		bookid=x;
	}
	int getBookid()//get the bookid
	{
		return bookid;
	}
	
	void setPassengerid(int x)//set the passengerid
	{
		passengerid=x;
	}
	int getPassengerid()//get the passengeridger
	{
		return passengerid;
	}
	
	void setPname(String x)//set the passenger name 
	{
		pname=x;
	}
	String getPname()//get the passenger name
	{
		return pname;
	}
	
	void setAge(int x)//set the age
	{
		age=x;
	}
	int getAge()//get the age
	{
		return age;
	}
	
	void setBooking_status(String x)//set the booking status
	{
		booking_status=x;
	}
	String getBooking_status()//get the booking status
	{
		return booking_status;
	}
	public String toString()//print the details
	{
		return bookid+ " "+passengerid+ " " +pname+ " "+age+" " +booking_status;
	}
	
	
	 public void check(int id)throws InvalidUserIdException
	{
		
			
		if(id!=bookid)//check the condition
			throw new InvalidUserIdException();//throw exception
			
		else
			System.out.println("valid user id");//othherwise print valid user id
		
		
	}
	


	public static void main(String[] args)throws InvalidUserIdException
	{
		
		
		Passenger p=new Passenger();
		ArrayList<Passenger> a=new ArrayList<Passenger>();//store the details in arraylist
		p.setBookid(11);
		p.setPassengerid(12);
		p.setPname("regi");
		p.setAge(30);
		
		p.setBooking_status("conform");
		System.out.println("Bookid:"+p.getBookid());
		System.out.println("passengerid:"+p.getPassengerid());
		System.out.println("passenger name:"+p.getPname());
		System.out.println("Age:"+p.getAge());
		System.out.println("Booking status:"+p.getBooking_status());
		a.add(p);//add the details
		for(Passenger ob:a)
		{
			System.out.println(ob);
		}
		
		ArrayList<Passenger> al=new ArrayList<Passenger>();
		p.setBookid(13);
		p.setPassengerid(14);
		p.setPname("saki");
		p.setAge(45);
		p.setBooking_status("conform");
		al.add(p);
		al.addAll(a);//add all the details
		System.out.println("ADD THE PASSENGER DETAILSIN THE ARRAYLIST:");
		
		
		for(Passenger obj:al)
		{
			System.out.println(obj);//print the details using foreach loop
		}
		
		ArrayList<Passenger> al1=new ArrayList<Passenger>();
		p.setBookid(16);
		p.setPassengerid(18);
		p.setPname("sutha");
		p.setAge(47);
		p.setBooking_status("conform");
		al1.addAll(al);
		
		
		
		
		for(Passenger obj1:al1)
		{
			System.out.println(obj1);
		}
		System.out.println("add another details in arraylist");
		al.addAll(al1);
		for(Passenger obj:al)
		{
			System.out.println(obj);
		}
		
		al.remove(0);//remove the first index details
		
		
		System.out.println("DELETE THE PASSENGER DETAILS FROM  THE ARRAYLIST:");
		
		
		
		for(Passenger obj:al)
		{
			System.out.println(obj);//print the details
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the book id");
		int id=sc.nextInt();
		
		
		p.check(id);//call the method
		
		
		
	}
}



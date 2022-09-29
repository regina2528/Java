//NAME :PACKIYA REGINA
//BATCH: 2576


//write a program constructor chaining using "this" keyword
class Chain//class mame
{
	Chain()//no param constructor
	{
		this(10);//one param constructor link
		System.out.println("This is no param constructor");
	}
    Chain(int x)//param constructor
	{
        this(20,"regi");//two param constructor
		System.out.println("This is one param constructor");
    }
    Chain(int x,String y)//two param constructor
	{
        System.out.println("This is constructor chaining");
	}
public static void main(String[] args)
{
  Chain c=new Chain();//object creation
}
}
  
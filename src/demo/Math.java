package demo;

public class Math 
{
 

	public static void add(int a, int b)
	{
	    System.out.println("Sum is :" + (a+b));
	}
	
	public static void add(int a, int b, int c)
	{
	    System.out.println("Sum is :" + (a+b+c));
	}
	
	public static void multiply(int a, int b)
	{
	    System.out.println("Product is :" + a*b);
	}
	public static void subtract(int a, int b)
	{
	    System.out.println("sub is :" + (a-b));
	}
	
	public static void main(String[] args) {
		add(5,6);
		add(5,6,7);
		multiply(4,5);
	}

}
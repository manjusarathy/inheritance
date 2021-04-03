import java.util.*; 
import java.lang.*; 
import java.io.*; 
class first
{ 
	public void print_hi() 
	{ 
		System.out.println("Hi"); 
	} 
} 
class second extends first 
{ 
	public void print_hello() 
	{ 
		System.out.println("Hello"); 
	} 
} 

class third extends second 
{ 
	public void print_howdy() 
	{ 
		System.out.println("Howdy"); 
	} 
} 
public class MultilevelInheritance
{ 
	public static void main(String[] args) 
	{ 
		third g = new third(); 
		g.print_hi(); 
		g.print_hello(); 
		g.print_howdy(); 
	} 
} 

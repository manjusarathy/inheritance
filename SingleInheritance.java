import java.util.*; 
import java.lang.*; 
import java.io.*; 

class one 
{ 
	public void print_hello() 
	{ 
		System.out.print("Hello "); 
	} 
} 

class two extends one 
{ 
	public void print_world() 
	{ 
		System.out.println("World"); 
	} 
} 
public class SingleInheritance 
{ 
	public static void main(String[] args) 
	{ 
		two g = new two(); 
		g.print_hello(); 
		g.print_world();
	} 
} 
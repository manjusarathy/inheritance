import java.util.*; 
import java.lang.*; 
import java.io.*; 

interface oner
{ 
	public void print_geek(); 
} 

interface twor 
{ 
	public void print_for(); 
} 

interface three extends oner,twor 
{ 
	public void print_geek(); 
} 
class child implements three 
{ 
	@Override
	public void print_geek() { 
		System.out.println("Geeks"); 
	} 

	public void print_for() 
	{ 
		System.out.println("for"); 
	} 
} 
public class MultipleInheritance
{ 
	public static void main(String[] args) 
	{ 
		child c = new child(); 
		c.print_geek(); 
		c.print_for(); 
		c.print_geek(); 
	} 
} 

import java.util.*; 
import java.lang.*; 
import java.io.*; 
class ones 
{ 
	public void print_geek() 
	{ 
		System.out.println("Geeks"); 
	} 
} 
class twos extends ones 
{ 
	public void print_for() 
	{ 
		System.out.println("for"); 
	} 
} 
class threes extends ones 
{ 
	
} 
public class HierarchicalInheritance
{ 
	public static void main(String[] args) 
	{ 
		threes g = new threes(); 
		g.print_geek(); 
		twos t = new twos(); 
		t.print_for(); 
		g.print_geek(); 
	} 
} 

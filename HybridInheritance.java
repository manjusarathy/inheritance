import java.util.*; 
import java.lang.*; 
import java.io.*; 
class oned
{ 
	public void print_hello() 
	{ 
		System.out.print("Hello "); 
	} 
} 

class twod extends oned 
{ 
	public void print_world() 
	{ 
		System.out.print("World "); 
	} 
} 
class threed extends twod
{
	public void print_name()
	{
		System.out.print("Name");
	}
}
class fourd extends twod
{
	public void print_print()
	{
		System.out.print("!!!!");
	}
}
public class HybridInheritance 
{ 
	public static void main(String[] args) 
	{ 
		fourd r = new fourd();
		threed g = new threed(); 
		g.print_hello(); 
		g.print_world();
		g.print_name();
		r.print_print();
	} 
} 
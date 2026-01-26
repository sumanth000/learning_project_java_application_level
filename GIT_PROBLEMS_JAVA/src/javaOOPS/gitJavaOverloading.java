package javaOOPS;

public class gitJavaOverloading {
	
	
	public static void main(String []args)
	{
		System.out.println("polymorphism");
		  a var=new a();
		     System.out.println(var.function(15,5));//subtraction
		     // or a.function(5,5) because it is static for parent and child classes
		     b v=new b();
		     System.out.println(v.function(5,4));//addition
		     
		     
		     
		  
		
		
	}

}


class overriding
{
    static int function(int i,float j)
    {
     return i+(int)j;  
    }
  
}
class a extends overriding
{
    //executes the overriden method 
   static int function(int i,float j)
    {
     return i-(int)j;  
    } 
}
class b extends overriding
{
	
}



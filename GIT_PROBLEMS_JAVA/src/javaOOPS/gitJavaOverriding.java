package javaOOPS;

public class gitJavaOverriding {
	
	
	 public static void main(String args[])
	    {
	     overloading var=new overloading();
	     System.out.println(var.function(5,"55"));
	     System.out.println(var.function(5,5,5));
	    }

}


class overloading
{
    int  function(int i,String j)
    {
     return i+Integer.parseInt(j);  
     
    }
    int function(int i,int j,int k)
    {
       return i+j+k; 
    }
}






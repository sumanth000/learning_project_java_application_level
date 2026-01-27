package javaOOPS;

public class gitJavaInterface1{
	public static void main(String args[]){  
	 Bike obj= new Honda(); 
	 obj.run(); 
	 obj.speed();
	 obj.price();
	}  
}

interface  Bike{  // by default public & abstract
  abstract public void run(); 
   abstract  void speed();
   abstract  void price();
}  


////:::::::::::::::::::::::NORMAL CLASS :::::::::::::::::::::::;
// if used normal class interface implementation, we have to implement all the abstract methods of the interface
// to get rid of this, we have to use the abstract class and then the subclass
class Honda implements Bike  
// public is used in void because method is originating here
{  
 public void run(){System.out.println("running safely");} //must be implemented 
 public void speed(){System.out.println("100 kmph");}// must be implemented
 public void price(){System.out.println("2 crores");}//must be implemented
}



////:::::::::::::::::::::::ABSTRACT CLASS :::::::::::::::::::::::;

abstract class Pulsar implements Bike  
//public is used in void because method is originating here
{  
public void run(){System.out.println("running safely");} //must use the public
public void speed(){System.out.println("100 kmph");}
// public void price(){System.out.println("2 crores");}
}
class Hello extends Pulsar
{
 public void price(){System.out.println("2 croress");}
}

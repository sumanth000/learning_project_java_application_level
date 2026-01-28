package javaGenerics;

import java.util.ArrayList;
import java.util.List;

public class gitJavaGenericClasses {
	public static void main(String []args) {
		
		 Box<String> a=new Box<String>();
	      a.a="-2";
	      
	      String value=a.getValue();
	      
	          String lengthDescription = a.<String>getLengthInString();
	        System.out.println("Length description: " + lengthDescription);
	      
	      
	        String formattedString = a.getFormattedValue(String.class);
	        

	        System.out.println("Formatted String: " + formattedString); // Outputs: Formatted String: Hello
		
	
	}

}

//usually type parameters are declared at 
//1. at class Signature
//2. at method signature , before the return type only
//3. although declared at the class signature, have to redeclare again for the static methods
// before the return datatype

//signatures at class <T>
class Box<T>{
	
	
		public T a;
		
		public T getValue(){
		 return this.a;
		}
		//signatures at method <R>
		public <R> R getLengthInString() {
		     if (a instanceof String) {
		         String str = (String) a;
		         if (str.length() > 3) {
		             return (R) "more";  // Return type as String
		         } else {
		             return (R) "less";  // Return type as String
		         }
		     } else {
		         return (R) "Not supported";  // Return type as String
		     }
		 }
		
		
		 
		  public <R> R getFormattedValue(Class<R> clazz) {
		     if (clazz == String.class) {
		         return clazz.cast(a.toString()); // Cast value to String if the class type is String
		     } else if (clazz == Integer.class) {
		         return clazz.cast(Integer.parseInt(a.toString())); // Cast value to Integer
		     } else {
		         throw new IllegalArgumentException("Unsupported type");
		     }
		 }
}

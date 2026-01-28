package javaStreamsLambdaFunctions;

import java.util.function.*;

public class gitJavaFunctionalInterfacesTop4 {
	public static void main(String[] args) {
		   
		  // predicate 
		  // abstract method: boolean test( T t);
		         Predicate<String> predicate_interface_variable=(String a)->{
		                     return a.length()>3?true:false;

		           
		         };
		         
		              
		      System.out.println(predicate_interface_variable.test("ab"));//false
		      System.out.println(predicate_interface_variable.test("sumanth"));//true
		  //function<T,r>   
		  // abstract method: r apply(T t);   
		            Function <String,Boolean> function_interface_variable=(String a)->{
		                    return a.length()>3?true:false;
		                    // return "passed the String "+ a;
		                    // return 0;
		         };
		         
		     System.out.println(function_interface_variable.apply("abc"));//false
		      System.out.println(function_interface_variable.apply("sumanth"));//true
		      
		  //Consumer <T>  
		  // abstract method: void accept(T t)  
		            Consumer <String> consumer_interface_variable=(String a)->{
		                    System.out.println("given string is "+a);
		         };
		         
		     consumer_interface_variable.accept("ab");//false
		     consumer_interface_variable.accept("sumanth");//true
		     
		      //Supplier<T>   
		  // abstract method: T get()  
		            Supplier <String> supplier_interface_variable=()->{
		                    return "String push";
		         };
		         
		            System.out.println(supplier_interface_variable.get());//false

		  // BiPredicate<T, U>
		        // Abstract method: boolean test(T t, U u);
		        BiPredicate<String, String> biPredicate_interface_variable = (String a, String b) -> {
		            return a.startsWith(b);
		        };
		        
		        System.out.println(biPredicate_interface_variable.test("sumanth", "su")); // true
		        System.out.println(biPredicate_interface_variable.test("sumanth", "ma")); // false
		     
		         
	   
	  }
}




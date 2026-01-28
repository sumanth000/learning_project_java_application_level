package javaStreamsLambdaFunctions;

import java.util.*;
import java.util.function.*;

public class gitJavaFunctionalInterfacesConstructorRefMethods {
	   public static void main(String[] args) {
		      
		      System.out.println("_--------------------------------------------------------------------------");
		      //==============================================================================================================
		      
		         Function<String, Integer> functionVar = new Function<String, Integer>(){
		           @Override
		           public Integer apply(String i)
		           {
		             return Integer.parseInt(i);
		           }
		         };
		        System.out.println("from the functional interface implement override ++ Converted number: " + functionVar.apply("123")); // Output: Converted number: 123
		      
		      
		       String str = "Hello";
		        Function<Integer, Character> functionVar1 = new Function<Integer,Character>(){
		           @Override
		           public Character apply(Integer i)
		           {
		             return str.charAt(i);
		           }
		         };
		      
		      
		              System.out.println("from the functional interface implement override ++ character at the index number: " + functionVar1.apply(1)); // Output: Converted number: 123

		      
		      
		      
		        // Static Method Reference
		        Function<String, Integer> stringToInt = Integer::parseInt;
		        System.out.println("Converted number: " + stringToInt.apply("123")); // Output: Converted number: 123

		        // Instance Method Reference of an Object
		       
		        Function<Integer, Character> charAt = str::charAt;
		        System.out.println("Character at index 1: " + charAt.apply(1)); // Output: e



		      System.out.println("_--------------------------------------------------------------------------");

		      //==============================================================================================================

		        // Instance Method Reference of an Arbitrary Object
		        BiPredicate<String, String> startsWith = String::startsWith;
		        System.out.println("Starts with 'He': " + startsWith.test("Hello", "He")); // Output: Starts with 'He': true

		        // Constructor Reference
		        Supplier<List<String>> listSupplier = ArrayList::new;
		        List<String> list = listSupplier.get();
		        list.add("Java");
		        list.add("Python");
		        System.out.println("List contents: " + list); // Output: List contents: [Java, Python]

		        // Example with forEach and Method Reference
		        List<String> names = Arrays.asList("John", "Jane", "Adam");
		        names.forEach(System.out::println); // Output: John Jane Adam

		        // Method reference that returns void (static method)
		        Consumer<String> printConsumer = System.out::println;
		        printConsumer.accept("This is a static method reference"); // Output: This is a static method reference

		        // Method reference that returns void (instance method)
		        Consumer<List<String>> clearList = List::clear;
		        clearList.accept(list); // Clears the list
		        System.out.println("List after clear: " + list); // Output: List after clear: []

		        // Method reference to an instance method on an existing object (void return)
		        Consumer<String> stringPrinter = String::toUpperCase; // This reference would work with other methods, though upper case doesn't return void.
		        stringPrinter.accept("hello world"); // Calls the method, doesn't output anything though
		    }
		}

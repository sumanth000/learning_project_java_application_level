package javaStreamsLambdaFunctions;

import java.util.function.*;

public class gitJavaFunctionalInterfacesConstructorRef {
	 public static void main(String[] args) {
	        // Supplier: Creating a new Person instance
	        Supplier<Person> personSupplier = () -> new Person("Doe");
	        Person person = personSupplier.get();
	        
	        // Consumer: Printing the last name of the person
	        Consumer<Person> personConsumer = p -> System.out.println("Last name: " + p.getLastName());
	        personConsumer.accept(person);
	        
	        // Predicate: Checking if the last name is "Doe"
	        Predicate<Person> lastNameCheck = p -> p.getLastName().equals("Doe");
	        System.out.println("Is last name 'Doe'? " + lastNameCheck.test(person));
	        
	        // Function: Extracting the last name from the person
	        Function<Person, String> lastNameExtractor = Person::getLastName;
	        System.out.println("Extracted last name: " + lastNameExtractor.apply(person));
	    }
	}
	class Person {
	    private String lastName;

	    // Constructor
	    Person(String lastName) {
	        this.lastName = lastName;
	    }

	    // Getter for lastName
	    public String getLastName() {
	        return lastName;
	    }
	}


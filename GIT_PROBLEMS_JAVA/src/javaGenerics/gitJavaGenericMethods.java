package javaGenerics;

import java.util.ArrayList;
import java.util.List;

public class gitJavaGenericMethods {
	 // 1. Defining Generic Methods
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // 2. Type Parameters in Methods (Bounded Type Parameter)
    public <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    // 3. Overloading Generic Methods
    public <T> void show(T t) {
        System.out.println("Generic method with single parameter: " + t);
    }

    public <T, U> void show(T t, U u) {
        System.out.println("Overloaded generic method with two parameters: " + t + " and " + u);
    }

    public static void main(String[] args) {
        // 4. Generic Method Invocation
    	gitJavaGenericMethods demo = new gitJavaGenericMethods();

        // Invoking printArray (Generic Method)
        Integer[] intArray = {1, 2, 3, 4};
        String[] stringArray = {"Apple", "Banana", "Cherry"};
        
        demo.<Integer>printArray(intArray);  // Output: 1 2 3 4
        demo.printArray(stringArray);        // Output: Apple Banana Cherry

        // Invoking sum (Bounded Type Parameter in Method)
        System.out.println("Sum: " + demo.sum(5, 10));      // Output: Sum: 15.0
        System.out.println("Sum: " + demo.sum(5.5, 2.5));   // Output: Sum: 8.0

        // Invoking show (Overloading Generic Methods)
        demo.show("Hello");                  // Output: Generic method with single parameter: Hello
        demo.show(100, "Points");            // Output: Overloaded generic method with two parameters: 100 and Points
    }

}


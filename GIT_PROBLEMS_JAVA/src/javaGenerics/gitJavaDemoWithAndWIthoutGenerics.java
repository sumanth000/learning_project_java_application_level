package javaGenerics;

import java.util.ArrayList;
import java.util.List;

public class gitJavaDemoWithAndWIthoutGenerics {
	public static void main(String []args) {
		
		
		
		
	    //without generics, casting needed 
	      List list =new ArrayList();
	      list.add("hello");
	      
	      //String word=list.get(0); //returning Object,needs to be casted
	       String word1=(String)list.get(0);
	       
	       System.out.println(word1);
	       
	///---------------------------------------------------------------------------------       
	      // with generics , no need of casting
	      
	       List<String> list1 =new ArrayList();
	       list1.add("hello1");
	       String word3=list1.get(0);//returning String as genenic is used 
	       System.out.println(word3);
	}

}

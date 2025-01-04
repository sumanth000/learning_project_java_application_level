package LEVEL1_ARRAYS;

import java.util.*;

public class Leaders {
    public static void main(String[] args) {
    	leaderHelperClass obj = new leaderHelperClass();
		
		    ArrayList<Integer> res = obj.leaders(new int[]{1,5,3});
		    System.out.println(res);
		    
		    // 1 2 3
		    // 2 3 1 
		   
  }
}

class leaderHelperClass{
    
	 static  ArrayList<Integer> leaders(int arr[]) {
	        // code here
	       ArrayList<Integer>  result=new ArrayList<>();
	       
	       for(int i=0;i<arr.length;i++)
	       {
	           int element=arr[i];
	           int leader=1;
	          for(int j=i;j<arr.length;j++)
	          {
	              if(!(arr[j]<=element))
	              
	               leader=0;
	          }
	          
	          if(leader==1)result.add(element);
	       }
	        
	        
	       
	       return result;
	    }
    
}
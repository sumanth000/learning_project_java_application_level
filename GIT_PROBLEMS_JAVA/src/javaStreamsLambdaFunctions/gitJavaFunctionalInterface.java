package javaStreamsLambdaFunctions;

public class gitJavaFunctionalInterface {
	public static void main(String[] args) {
	      
	      // lambda expressions came into usaae

	      people a1=()->{
	        return "my caste is chakali";
	      };
	      System.out.println(a1.caste());
	      
	      
	      // regular interface implementation with overriding
	     person a2 = new person() {
	            @Override
	            public String name(String a) {
	                return "my name is " + a;
	            }
	            
	            @Override
	            public String gender(String a) {
	                return "my gender is " + a;
	            }
	        };

	            System.out.println(a2.name("sumathi"));
	            System.out.println(a2.gender("female"));


	  }
}



interface person{
  
    public abstract  String name(String a);
    public abstract  String gender(String a);

}




interface people{
  
  public abstract String caste();
  
}

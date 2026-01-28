package javaOOPS;

public class gitJavaUpcastingDowncasting {
	
	
	public static void main(String[] args) {


		// 1️⃣ Normal object creation
		Android1 obj1 = new Android1();
		obj1.ringtone();
		obj1.wala();


		System.out.println();


		// 2️⃣ Upcasting (Parent reference → Child object)
		Android1 obj2 = new Samsung1();
		obj2.ringtone(); // Child version (overridden method)
		obj2.wala(); // Parent method


		// obj2.method(); ❌ Not accessible (reference is Android)


		System.out.println();


		// 3️⃣ Child reference → Chi1ld object
		Samsung1 obj3 = new Samsung1();
		obj3.wala(); // Parent method
		obj3.ringtone(); // Child overridden method
		obj3.method(); // Child specific method


		System.out.println();


		// 4️⃣ Downcasting
		Android1 obj4 = new Samsung1(); // Upcasting first
		Samsung1 o = (Samsung1) obj4; // Downcasting


		o.ringtone();
		o.wala();
		o.method();
		}

}
//Parent class
class Android1 {
	
				void ringtone() {
				System.out.println("Android ringtone");
				}	
				void wala() {
					System.out.println("Android wala");
				}	
}


//Child class
class Samsung1 extends Android1 {

			
			@Override
			void ringtone() {
			System.out.println("Samsung ringtone");
			}
			
			
			void method() {
			System.out.println("Samsung method");
			}
}

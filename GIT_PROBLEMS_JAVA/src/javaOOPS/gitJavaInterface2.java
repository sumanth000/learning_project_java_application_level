package javaOOPS;

public class gitJavaInterface2 {
	
	
	public static void main(String[] args) {


		// 1️⃣ Normal object creation
		Android obj1 = new Android();
		obj1.ringtone();
		obj1.wala();


		System.out.println();


		// 2️⃣ Upcasting (Parent reference → Child object)
		Android obj2 = new Samsung();
		obj2.ringtone(); // Child version (overridden method)
		obj2.wala(); // Parent method


		// obj2.method(); ❌ Not accessible (reference is Android)


		System.out.println();


		// 3️⃣ Child reference → Child object
		Samsung obj3 = new Samsung();
		obj3.wala(); // Parent method
		obj3.ringtone(); // Child overridden method
		obj3.method(); // Child specific method


		System.out.println();


		// 4️⃣ Downcasting
		Android obj4 = new Samsung(); // Upcasting first
		Samsung o = (Samsung) obj4; // Downcasting


		o.ringtone();
		o.wala();
		o.method();
		}

}
//Parent class
class Android {
	
				void ringtone() {
				System.out.println("Android ringtone");
				}	
				void wala() {
					System.out.println("Android wala");
				}	
}


//Child class
class Samsung extends Android {

			
			@Override
			void ringtone() {
			System.out.println("Samsung ringtone");
			}
			
			
			void method() {
			System.out.println("Samsung method");
			}
}

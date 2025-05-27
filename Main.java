
final class FinalClass {
		    // This class cannot be extended
	public void display() {
		        
		System.out.println("This is a final class.");
	}
}

class Parent {
		    // Final variable
	final int finalVariable = 10;

		    // Final method
	public final void finalMethod() {
		 System.out.println("This is a final method.");
	}

		    // Attempt to change the final variable (uncomment to see the error)
		    // finalVariable = 20;

	public void display() {
		  System.out.println("Parent class display method.");
	}
}

class Child extends Parent {
	@Override
	public void display() {
		  System.out.println("Child class display method.");
	}
}

public class Main {
	public static void main(String[] args) {
		        // Create instance of FinalClass
	      FinalClass fc = new FinalClass();
		  fc.display();

		  Parent p = new Parent();
		  p.finalMethod();
		  p.display();

		  Child c = new Child();
		  c.finalMethod();
		  c.display();
	}
}


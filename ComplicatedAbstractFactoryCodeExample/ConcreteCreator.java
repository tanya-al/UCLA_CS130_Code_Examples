public class ConcreteCreator extends Creator {
	// ConcreteCreator must implement how to create concrete products. 
	Product createMethod (String item) {
		Product product = null; 
		if (item=="a") {
			System.out.println("creating Product a");
			product = new ConcreteProduct1(); 
		} 
		else if (item=="b") {
			System.out.println("creating Product b");
			product = new ConcreteProduct2(); 
		}
		return product;
	}
}
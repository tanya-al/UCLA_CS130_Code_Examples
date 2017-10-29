public class ConcreteCreator {
	// ConcreteCreator must implement how to create concrete products. 
	Product createMethod (String item) {
		// Product product = null; 
		if (item=="a") {
			System.out.println("creating Product a");
			return new ConcreteProduct1(); 
		} 
		else if (item=="b") {
			System.out.println("creating Product b");
			return new ConcreteProduct2(); 
		}
		return null;
	}

	public Product otherMethodsThatUseCreation(String type) { 
		System.out.println("creating product");
		Product product = createMethod(type); 
		product.doCommonOperation();
		return product;
	} 
}
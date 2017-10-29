public abstract class Creator {
	abstract Product createMethod (String item); 
	// This is a factory method.
	
	public Product otherMethodsThatUseCreation(String type) { 
		System.out.println("creating product");
		Product product = createMethod(type); 
		product.doCommonOperation();
		return product;
	} 
}
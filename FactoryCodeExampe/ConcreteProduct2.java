public class ConcreteProduct2 implements Product {
	@Override
	public void doCommonOperation() {
		System.out.println("This operation is common to all factory products");
	}
}
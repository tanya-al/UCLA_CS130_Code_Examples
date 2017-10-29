public class FactoryExample {
	public static void main(String[] args) {
		ConcreteCreator factory = new ConcreteCreator();
		Product productA = factory.otherMethodsThatUseCreation("a");
		Product productB = factory.otherMethodsThatUseCreation("b");
	}
}
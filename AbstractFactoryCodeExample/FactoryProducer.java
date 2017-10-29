public class FactoryProducer {
	
	public Factory createFactory(String factoryType) {
		if (factoryType=="clothingFactory") {
			return new ClothingFactory();
		}
		else if (factoryType=="cookwareFactory") {
			return new CookwareFactory();
		}
		return null;
	}
}
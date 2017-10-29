public class AbstractFactoryCreator {
	public AbstractFactory createFactory(String factoryType) {
		if (factoryType == "clothes") {
			return new ClothingFactory();
		}
		else if (factoryType == "cookware") {
			return new CookwareFactory();
		}
		return null;
	}
}
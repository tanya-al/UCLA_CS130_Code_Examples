public class AbstractFactoryExample {
	public static void main(String[] args) {
		AbstractFactoryCreator factoryMaker = new AbstractFactoryCreator();

		AbstractFactory clothesFactory = factoryMaker.createFactory("clothes");
		ClothingProduct shirt = clothesFactory.createAndShipClothes("shirt");
		ClothingProduct pants = clothesFactory.createAndShipClothes("pants");

		AbstractFactory cookwareFactory = factoryMaker.createFactory("cookware");
		CookwareProduct pot = cookwareFactory.createAndShipCookware("pot");
		CookwareProduct pan = cookwareFactory.createAndShipCookware("pan");
	}
}
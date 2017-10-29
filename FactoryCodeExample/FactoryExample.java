public class FactoryExample {
	public static void main(String[] args) {
		ClothingFactory factory = new ClothingFactory();
		ClothingProduct shirt = factory.createAndShipClothes("shirt");
		ClothingProduct pants = factory.createAndShipClothes("pants");
	}
}
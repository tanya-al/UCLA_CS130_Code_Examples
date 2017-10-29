public class ClothingFactory extends AbstractFactory{
	public ClothingProduct createClothing(String clothingType) {
		if (clothingType=="shirt") {
			System.out.println("clothing product is shirt!");
			return new Shirt();
		}
		else if (clothingType=="pants") {
			System.out.println("clothing product is pants!");
			return new Pants();
		}
		return null;
	}

	@Override
	public ClothingProduct createAndShipClothes(String clothingType) {
		System.out.println("creating clothing product");
		ClothingProduct product = createClothing(clothingType);
		product.shipClothes();
		return product;
	}

	@Override
	CookwareProduct createAndShipCookware(String cookwareType) {
		return null;
	}
}
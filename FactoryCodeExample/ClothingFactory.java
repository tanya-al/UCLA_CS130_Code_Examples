public class ClothingFactory {
	public ClothingProduct createClothing(String clothingType) {
		if (clothingType=="shirt") {
			return new Shirt();
		}
		else if (clothingType=="pants") {
			return new Pants();
		}
		return null;
	}

	public ClothingProduct createAndShipClothes(String clothingType) {
		System.out.println("creating product");
		ClothingProduct product = createClothing(clothingType);
		product.shipClothes();
		return product;
	}
}
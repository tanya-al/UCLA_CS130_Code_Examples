public class CookwareFactory extends AbstractFactory{
	public CookwareProduct createCookware(String cookwareType) {
		if (cookwareType=="pot") {
			System.out.println("cookware product is pot!");
			return new Pot();
		}
		else if (cookwareType=="pan") {
			System.out.println("cookware product is pan!");
			return new Pan();
		}
		return null;
	}

	@Override
	public CookwareProduct createAndShipCookware(String cookwareType) {
		System.out.println("creating cookware product");
		CookwareProduct product = createCookware(cookwareType);
		product.shipCookware();
		return product;
	}

	@Override
	ClothingProduct createAndShipClothes(String clothingType) {
		return null;
	}
}
public abstract class AbstractFactory {
	abstract ClothingProduct createAndShipClothes(String clothingType);
	abstract CookwareProduct createAndShipCookware(String cookwareType);
}
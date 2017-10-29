public class MallardDuck extends Duck {
	public MallardDuck() {
		System.out.println("MallardDuck");
		flyable = new RegularFlying();
		quackable = new RegularQuacking();
	}
}
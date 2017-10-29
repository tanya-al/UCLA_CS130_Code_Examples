public abstract class Duck {
	Flyable flyable;
	Quackable quackable;

	public void act() {
		flyable.fly();
		quackable.quack();
	}
}
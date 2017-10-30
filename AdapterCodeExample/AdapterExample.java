public class AdapterExample {
	public static void main(String[] args) {
		MallardDuck mallard = new MallardDuck();

		mallard.fly();
		mallard.quack();

		WildTurkey wild = new WildTurkey();
		//don't want a separate API for turkeys and ducks, the client will be confused!
		wild.fly();
		wild.gobble(); 

		// let's turn a turkey into a duck
		TurkeyAdapter adapter = new TurkeyAdapter(wild);

		adapter.fly(); // a turkey must fly 5 times to match a duck's one time
		adapter.quack(); // a turkey's quack is actually a gobble!
	}
}
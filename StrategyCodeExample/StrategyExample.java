public class StrategyExample {
	public static void main(String[] args) {
		MallardDuck mDuck = new MallardDuck();
		mDuck.act();
		// Now we can add many types of ducks and many types of flying/quacking (or a NoFlying/NoQuacking class!). 
		// All actions are decoupled and ducks can resuse similar code (real ducks can all quack and toy ducks can all not quack)
		// Actions can also change in one place and apply to all ducks using that action
			// Example: We can change regular flying to have a different speed and all ducks that fly normally have the new speed
		// Adding/removing ducks is easy. Adding/Removing flying/quacking actions is hard.
	}
}
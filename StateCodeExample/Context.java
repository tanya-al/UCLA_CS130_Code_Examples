public class Context {
	State concreteStateA = new ConcreteStateA(this);
	State concreteStateB = new ConcreteStateB(this);
	State currentState = concreteStateA;

	// public Context() {
	// 	concreteStateA = new ConcreteStateA(this);
	// 	concreteStateB = new ConcreteStateB(this);
	// }

	public State getConcreteStateA() {
		return concreteStateA;
	}

	public State getConcreteStateB() {
		return concreteStateB;
	}

	public void switchState() {
		currentState.transitionState();
	}

	public void setState(State newState) {
		currentState = newState;
	}
}
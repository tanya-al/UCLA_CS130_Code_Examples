public class Singleton {
	// always have the resource object declared as private volatile static
	private volatile static Singleton singletonObject;
	// make constructor private to avoid undesired creations of object
	private Singleton() {}
	public static Singleton getSingletonObject() {
		// only synchronize if the object is not already created
		if (singletonObject == null) {
			synchronized(Singleton.class) {
				// check again for race conditions
				if (singletonObject == null) {
					// create new object once
					System.out.println("You will only see this line once");
					singletonObject = new Singleton();
				}
			}
		}
		System.out.println("You will see this everytime the resource is requested");
		return singletonObject;
	}
}
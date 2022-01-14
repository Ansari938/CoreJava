package Java8;
@FunctionalInterface
public interface Additon {
public int add (int a , int b);
	public default void DefaultMethod() {
		System.out.println("Test deafult");
}
		public static void staticMethod() {
			System.out.println("Test static ");
		}
		
		
	}



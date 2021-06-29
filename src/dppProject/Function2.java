package dppProject;

@FunctionalInterface
public interface Function2<T, U, V> {
	public V apply(T t, U u);

	default void count(int count) {
		while(count<10) {
			System.out.print(" "+count++);
		}
	}
}

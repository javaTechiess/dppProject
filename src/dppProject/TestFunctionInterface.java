package dppProject;

public class TestFunctionInterface implements Function2<T, U, V> {

	@Override
	public V apply(T t, U u) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		TestFunctionInterface functionInterface = new TestFunctionInterface();
		functionInterface.count(0);

	}

}

class V {

}

class T {

}

class U {

}
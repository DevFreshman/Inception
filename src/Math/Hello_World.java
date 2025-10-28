package Math;

public class Hello_World {
	static void swap(Integer a, Integer b) {
		int c = a.intValue();
		a=b.intValue();
		b=c;
	}

	public static void main(String[] args) {
		Integer a=10,b=100;
		swap(a, b);
		System.out.println(a.intValue()+" "+b.intValue());
		
	}
}

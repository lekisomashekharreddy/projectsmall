package qedge.dec3;

public class demo7 {

	public static void main(String[] args) {
		// store different data types of multiple values
		Object x[] = new Object[6];
		x[0] = "Hello";
		x[1] = 100;
		x[2] = 23.45;
		x[3] = 'd';
		x[4] = true;
		x[5] = "selenium";
		System.out.println(x.length);
		for (Object each : x) {
			System.out.println(each);
		}

	}

}

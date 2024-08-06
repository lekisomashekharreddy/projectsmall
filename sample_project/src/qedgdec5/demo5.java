package qedgdec5;

public class demo5 {

	public static void main(String[] args) {
		// store integer type into single dimension
		int x[] = new int[5];
		x[0] = 100;
		x[1] = 200;
		x[2] = 300;
		x[3] = 400;
		x[4] = 500;
		// print array length
		System.out.println(x.length);
		// print Specific value from array collection
		System.out.println(x[3]);
		for (int each : x) {
			System.out.println(each);
		}

	}

}

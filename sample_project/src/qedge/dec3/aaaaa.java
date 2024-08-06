package qedge.dec3;

public class aaaaa {

	public static void main(String[] args) {
		// store string type data into array
		String str[][] = { { "admin1", "test1" }, { "admi2", "test2" }, { "admin3", "test3" }, { "admin4", "test4", } };
		// print row length
		System.out.println("no of rows::+str.length):");
		// print any row cell length
		System.out.println("any row cell length::" + str[0].length);
		// print any specific cell data
		System.out.println(str[3][0]);
		// iterate all rows
		for (int i = 0; i < str.length; i++) {
			// iterate each row cell
			for (int j = 0; j < str[i].length; j++) {
				System.out.println(str[i][j] + "\t");
				System.out.println();
			}

		}

	}

}

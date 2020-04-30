package Task1;

import java.util.Arrays;
import java.util.Collections;

public class Application {

	public static void main(String[] args) {
		Integer[] array = { (int) (Math.random() * 1000), (int) (Math.random() * 1000), (int) (Math.random() * 1000),
				(int) (Math.random() * 1000), (int) (Math.random() * 1000), (int) (Math.random() * 1000),
				(int) (Math.random() * 1000) };
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println(Arrays.toString(array));

	}

}

package Task2;

import java.util.Arrays;
import java.util.Random;

public class Application {

	public static void main(String[] args) {

		Auto[][] array = new Auto[getRandom(1, 10)][5];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < 5; j++) {
				array[i][j] = new Auto(getRandom(200, 350), getRandom(2000, 2020),
						new Kermo(getRandom(16, 24), "metal"), new Engine(getRandom(4, 16)));
			}
		}

		System.out.println(Arrays.deepToString(array));

		for (int i = 0; i < array.length; i++) {
			Arrays.fill(array[i], (new Auto(320, 2005, new Kermo(16, "metal"), new Engine(10))));
		}
		System.out.println(Arrays.deepToString(array));
	}

	public static int getRandom(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("Error");
		}
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
}

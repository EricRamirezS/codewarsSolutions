public class Kata {
	public static int TripleDouble(long num1, long num2) {
		for (int i = 0; i < 10; i++) {
			if (String.valueOf(num1).contains("" + i + i + i) &&
					String.valueOf(num2).contains("" + i + i)) return 1;
		}
		return 0;
	}
}
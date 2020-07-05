import java.util.Arrays;

public class Challenge {
	public static boolean isAvgWhole(int[] arr) {
		return (Arrays.stream(arr).sum()%arr.length == 0);
	}
}

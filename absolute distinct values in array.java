import java.util.HashSet;
import java.util.Set;

public class Main {

    public static int countDistinctAbsoluteValues(int[] arr) {
        Set<Integer> distinct = new HashSet<>();

        for (int num : arr) {
            distinct.add(Math.abs(num));
        }

        return distinct.size();
    }

    public static void main(String[] args) {
        int[] arr = {-5, 5, -3, 3, 0, 7, -7, 5};

        System.out.println(countDistinctAbsoluteValues(arr));
    }
}

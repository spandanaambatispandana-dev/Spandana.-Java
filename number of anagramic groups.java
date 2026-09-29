
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        HashSet<String> groups = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();

            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            groups.add(new String(chars));
        }

        System.out.println(groups.size());

        sc.close();
    }
}


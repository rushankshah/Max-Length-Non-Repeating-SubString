import java.util.HashSet;
import java.util.Set;

public class LengthOfSubStringWithoutRepeat {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        String s = "abcabcde";
        int i = 0, j = 0;
        int maxLength = 0;
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                maxLength = Math.max(set.size(), maxLength);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        System.out.println("Max length is: " + maxLength);
    }
}

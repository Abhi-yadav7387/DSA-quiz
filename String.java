import java.util.HashMap;

public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; // No non-repeating character found
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println("First unique character in \"" + s1 + "\": " + firstUniqChar(s1));

        String s2 = "loveleetcode";
        System.out.println("First unique character in \"" + s2 + "\": " + firstUniqChar(s2));

        String s3 = "aabb";
        System.out.println("First unique character in \"" + s3 + "\": " + firstUniqChar(s3));
    }
}

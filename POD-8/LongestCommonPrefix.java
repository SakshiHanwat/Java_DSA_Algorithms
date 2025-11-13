public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        // If array is empty, return empty string
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take first string as reference
        String prefix = strs[0];

        // Compare with remaining strings
        for (int i = 1; i < strs.length; i++) {
            // Keep trimming the prefix until it matches the beginning of current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                // If prefix becomes empty, no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    // Main function for testing
    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Output: " + longestCommonPrefix(strs1));  // Output: fl

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Output: " + longestCommonPrefix(strs2));  // Output: ""
    }
}

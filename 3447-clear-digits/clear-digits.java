class Solution {
    public static String clearDigits(String s) {
    StringBuilder sb = new StringBuilder();

    for (char ch : s.toCharArray()) {
        if (Character.isDigit(ch)) {
            // Remove last character (if exists)
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        } else {
            sb.append(ch);
        }
    }

    return sb.toString();
}

}

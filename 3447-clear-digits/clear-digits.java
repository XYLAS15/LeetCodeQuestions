class Solution {
      public static String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Remove the closest non-digit character from the stack (if exists)
                if (!stack.isEmpty() && !Character.isDigit(stack.peek())) {
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }

        // Convert stack to string
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }
        
        return result.toString();
    }
}
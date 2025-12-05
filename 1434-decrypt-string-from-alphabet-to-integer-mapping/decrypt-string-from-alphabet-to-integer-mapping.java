class Solution {
    public String freqAlphabets(String s) {
        Stack<Character> st = new Stack<>();
        for (char i : s.toCharArray()) st.push(i);
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            if (st.peek() == '#') {
                st.pop();
                if (st.size() >= 2) {
                    int ones = st.pop() - '0';
                    int tens = st.pop() - '0';
                    int num = tens * 10 + ones;
                    sb.append((char) ('a' + num - 1));
                } else {
                    break;
                }
            } else {
                int num = st.pop() - '0';
                sb.append((char) ('a' + num - 1));
            }
        }
        return sb.reverse().toString();
    }
}

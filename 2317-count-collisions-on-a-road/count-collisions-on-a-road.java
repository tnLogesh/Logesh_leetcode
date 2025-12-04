class Solution {
    public int countCollisions(String directions) {
        Stack<Character> st = new Stack<>();
        int collision = 0;
        for (char ch : directions.toCharArray()) {
            if (ch == 'L') {
                if (!st.isEmpty() && st.peek() == 'R') {
                    int cntR = 0;
                    while (!st.isEmpty() && st.peek() == 'R') {
                        st.pop();
                        cntR++;
                    }
                    collision += cntR + 1;
                    st.push('S');
                } else if (!st.isEmpty() && st.peek() == 'S') {
                    collision++;
                } else {
                    st.push('L');
                }
            } else if (ch == 'S') {
                if (!st.isEmpty() && st.peek() == 'R') {
                    int cntR = 0;
                    while (!st.isEmpty() && st.peek() == 'R') {
                        st.pop();
                        cntR++;
                    }
                    collision += cntR;
                    st.push('S');
                } else {
                    if (st.isEmpty() || st.peek() != 'S') st.push('S');
                }
            } else {
                st.push('R');
            }
        }
        return collision;
    }
}

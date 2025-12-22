import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> a=new Stack<>();
        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if (c=='(' || c=='{' || c=='[') {
                a.push(c);
            } else {
                if (a.isEmpty()) return false;
                char b=a.pop();
                if (c==')' && b!='(') return false;
                if (c=='}' && b!='{') return false;
                if (c==']' && b!='[') return false;
            }
        }
        return a.isEmpty();
    }
}


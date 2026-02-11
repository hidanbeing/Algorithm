import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<String> st = new Stack<>();
        
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='('){
                st.push("(");
            }else{
                if (!st.isEmpty())st.pop();
                else return false;
            }
        }
        if (!st.isEmpty()) return false;
        return true;
    }
}
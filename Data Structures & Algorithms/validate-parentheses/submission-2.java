class Solution {
    public boolean isValid(String s) {

        if(s.length() % 2 != 0) return false;

        Stack<Character> seen = new Stack<>();

        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');


        char[] arrs = s.toCharArray();

        for(char arr : arrs){
            if(arr == '[' || arr == '{' || arr == '('){
                seen.push(arr);
            } else {
            if (seen.isEmpty() || seen.peek() != pairs.get(arr)) return false;
            seen.pop();
        }
        } return seen.isEmpty();
    }  
}

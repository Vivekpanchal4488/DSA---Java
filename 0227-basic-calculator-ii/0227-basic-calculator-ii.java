class Solution {
    public int calculate(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        Stack<Integer>  st = new Stack<>();
        int curr = 0;
        char op = '+';
        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(Character.isDigit(ch[i])){
                    curr = curr*10 + ch[i] - '0';
            }
            if(!Character.isDigit(ch[i]) && ch[i] != ' ' || i == ch.length-1){
                if(op == '+'){
                        st.push(curr);
                }
                else if(op == '-'){
                        st.push(-curr);
                }
                else if(op == '*'){
                        st.push(st.pop() * curr);
                }
                else if(op == '/'){
                        st.push(st.pop() / curr);
                }
                op = ch[i];
                curr=0;
            }
        }
        int sum =0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}
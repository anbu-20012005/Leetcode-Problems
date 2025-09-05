class Solution {
    public int calculate(String s) {
        Stack<Integer> number = new Stack<>();
        Stack<Character> op = new Stack<>();
        int i=0, n = s.length();
        
        while(i<n){
            char c = s.charAt(i);
            if(c==' '){
                i++;
                continue;
            }
            if(Character.isDigit(c)){
                int num = 0;
                while(i<n && Character.isDigit(s.charAt(i))){
                    num = num * 10 + (s.charAt(i)-'0');
                    i++;
                }
                number.push(num);
                continue;
            }
            while(!op.isEmpty() && prec(op.peek())>=prec(c)){
                int n2 =  number.pop();
                int n1 = number.pop();
                number.push(calc(n1,n2,op.pop()));
            }
            op.push(c);
            i++;
        }
        while(!op.isEmpty()){
            int n2 = number.pop();
            int n1 = number.pop();
            number.push(calc(n1,n2,op.pop()));
        }
        return number.pop();
    }
    public int calc(int a, int b, char c){
            switch(c){
                case '+' : return a + b;
                case '-' : return a - b;
                case '*' : return a * b;
                case '/' : return a / b;
            }
            return 0;
    }
    public int prec(char c){
        switch(c){
            case '+' :
            case '-' : return 1;
            case '*' :
            case '/' : return 2;
        }
        return 0;
    }
}
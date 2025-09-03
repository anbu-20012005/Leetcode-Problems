class Solution {
 public static String thousandSeparator(int n) {
        
    	int count = 0;
    	StringBuilder sb =  new StringBuilder();
        String s = String.valueOf(n);

    	for (int i = s.length()-1; i >= 0; i--) {
            sb.append(s.charAt(i));

    		count++;
    		
    		if(count % 3 ==0 && i != 0) {
    			sb.append('.');
    		}
    		
		}
    
    	
        return sb.reverse().toString();

    }	
    
}
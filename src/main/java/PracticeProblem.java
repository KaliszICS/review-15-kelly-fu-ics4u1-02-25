public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int goodString(String s) {
        if (s.length() < 2) return -1;  
        
		int left = 0;           
        int right = s.length() - 1;     

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                return left + (s.length() - 1 - right); 
            } 
            
            if (s.charAt(left + 1) == s.charAt(right)) {
                left++;
            } else {
                right--; 
        }
	}
        return -1;
	}
}

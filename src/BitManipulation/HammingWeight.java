package BitManipulation;

public class HammingWeight {

	public static void main(String[] args) {
		System.out.println(hammingWeight(0));

	}
	
	 public static int hammingWeight(int n) {
	        int count = 0;
	        while(n > 0)
	        {
	            if(n%2 == 1)
	                count++;
	            n= n/2;
	        }
	    return count;
	    }
}

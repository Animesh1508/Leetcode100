package BitManipulation;

public class HammingWeight {

	public static void main(String[] args) {
		System.out.println(hammingWeight(413));

	}
	
//	//Approach with dividing number by 2
//	 public static int hammingWeight(int n) {
//	        int count = 0;
//	        while(n > 0)
//	        {
//	            if(n%2 == 1)
//	                count++;
//	            n= n/2;
//	        }
//	    return count;
//	    }
	 
//	//Approach with un set the rightmost set bit by doing and operation with number-1
//	 public static int hammingWeight(int n) {
//	 int count=0;
//	    while(n>0){
//	        n= n & (n-1);
//	        count++;
//	    }
//	    return count;
//	    }
	 
	 
	//Approach with right shift the set bits and increase the count
		 public static int hammingWeight(int n) {
		 int count=0;
		    for(int i=1; i<=32 ; i++) {
		    	if((n>>>i & 1) == 1){
		    		count++;
		    	}
		    }
		    return count;
		    }
	 
	 
}

package initial;

public class SumOfIntsInString {
	    public static void main(String[] args) {
	       String str = "India needs 124.6 runs in 15 balls";
	       
	       int total=0;
	       char[] charArr = str.toCharArray();
	       
	       for(char ch : charArr){
	           if(Character.isDigit(ch)){
	                total+=(ch - '0');
	               // System.out.println(ch + " " + total);
	           }
	       }
	       System.out.print(total);
	    }
	}


public class Solution {

	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
      return firstIndex(input, x, 0);
      }
	
  public static int firstIndex(int input[], int x, int n) {  
       if (n==input.length-1 && input[n]!=x){
         return -1;
       }
    
    
    
      if (input[n]==x)
        return n;
      else {
       return firstIndex(input, x, n+1);
        
      }
    
    
    
    
    
    
    
    
    
  }
}
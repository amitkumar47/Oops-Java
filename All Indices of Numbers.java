
public class Solution {

	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
           
		*/
      int arr[]=new int [0];
      return firstIndex(input, x, 0,arr);
      }
	
  public static int[] firstIndex(int input[], int x, int n, int arr[]) {  
       if (n==input.length-1 && input[n]!=x){
         return arr;
       }
    if (n==input.length-1 && input[n]==x){
         int ans []= new int [arr.length+1];
        for (int i=0 ; i<arr.length ; i++){
          ans[i]=arr[i];
        }
        ans[ans.length-1]=n;
      return ans;
       }
    
    
    
      if (input[n]==x){
       int ans []= new int [arr.length+1];
        for (int i=0 ; i<arr.length ; i++){
          ans[i]=arr[i];
        }
        ans[ans.length-1]=n;
        
        return firstIndex(input, x, n+1,ans);
        
      }
       
      else {
       return firstIndex(input, x, n+1,arr);
        
      }
    
		
	}
	
}
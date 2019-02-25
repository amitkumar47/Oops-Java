
/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/

// Main used internally is shown here just for your reference.
/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
  */


public class Polynomial {

	
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
	 private int data[];
  private int nextindex;
  
  
  
  
  
  public Polynomial(){
      data= new int[1500];
      nextindex=0;
      
    }
  
      
	public void setCoefficient(int degree, int coeff){
      if (degree>=this.data.length){
        reconstruct();
        
      }
      data[degree]=coeff;
      nextindex++;
		
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
      for (int i=0; i<this.data.length ;i++){
        if (data[i]!=0)
        System.out.print(data[i]+"x"+i+" ");
      }
		
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
         Polynomial fin = new Polynomial();
         for (int i=0 ; i<Math.max(this.data.length,p.data.length); i++){
           int sum=0;
         if (this.data.length>i && p.data.length>i)  
            sum=this.data[i]+p.data[i];
         else  if (this.data.length>i && p.data.length<=i)  
            sum=this.data[i];
           else if (this.data.length<=i && p.data.length>i)  
            sum=p.data[i];
           fin.setCoefficient(i,sum);
         }
      return fin;
		
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
			 Polynomial fin1 = new Polynomial();
         for (int i=0 ; i<Math.max(this.data.length,p.data.length); i++){
           int sum=0;
         if (this.data.length>i && p.data.length>i)  
            sum=this.data[i]-p.data[i];
         else  if (this.data.length>i && p.data.length<=i)  
            sum=this.data[i];
           else if (this.data.length<=i && p.data.length>i)  
            sum=0-p.data[i];
           fin1.setCoefficient(i,sum);
         }
      return fin1;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
        Polynomial fin2 = new Polynomial();
         for (int i=0 ; i<this.data.length; i++){
               if (this.data[i]==0)
                 continue;
          			 for(int j =0 ;j<p.data.length ; j++){
                         int sum=0;
                         if ( p.data[j]==0)
             				continue;
                        int k= i+j;
           					sum=(this.data[i]*p.data[j])+fin2.getCo(k);
                       fin2.setCoefficient(i+j,sum);}
         }
      return fin2;
		
	}
  
  
    private void reconstruct(){
      int temp []= data;
     
      data = new int [data.length*2];
      for (int i=0 ; i<temp.length ; i++){
        data[i]=temp[i];
      }
    }
  
  public int getCo(int k){
    if (k>=this.data.length)
      reconstruct();
    return this.data[k];
  }

  
  

}

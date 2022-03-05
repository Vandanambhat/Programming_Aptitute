public class LeftTrianglePattern     
{     
/*   	*
	  * *
	* * *
  * * * *
* * * * *
*/
/*								15
						24      25
				33      34      35
		42      43      44      45
51      52      53      54      55

*/
public static void main(String[] args) {
		String num1=args[0];
		int row=Integer.parseInt(num1);
		String num2=args[1];
		int col=Integer.parseInt(num2);
		LeftTrianglePattern   pd=new LeftTrianglePattern  ();
		pd.printLeftTriangle(row,col);
	}
	void printLeftTriangle(int r,int c){
	for(int row=1; row<=r; row++)   
		{   
			for(int col=1; col<=c; col++)   
			{   
		if(row+col){
				System.out.print("* ");   
			}   
			System.out.println(); 
		}   
	}
	}
		/*void printLeftTriangle(int r,int c){  
		for(int r=1; row<r; row++)   
		{   
			for(int col=1; col<=row; col++)   
			{   
				System.out.print("* ");   
			}   
			System.out.println(); 
		}   
	}  */
	
}  




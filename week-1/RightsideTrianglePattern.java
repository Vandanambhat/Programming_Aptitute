public class RightsideTrianglePattern   
{     
/*
		   *
         * *
       * * *
     * * * *
   * * * * *
*/

public static void main(String[] args) {
		String num1=args[0];
		int row=Integer.parseInt(num1);
		String num2=args[1];
		int col=Integer.parseInt(num2);
		RightsideTrianglePattern pd=new RightsideTrianglePattern();
		pd.printRightTriangle(row,col);
	}
		void printRightTriangle(int r,int c){  
		for (int row=0; row<r; row++) //0<5/  
		{  
			for (int col=2*(r-row); col>=0; col--) // col=10;10>=0/       
			{      
				System.out.print(" ");   
			}   
				for (int col=0; col<=row; col++ )   
				{       
					System.out.print("* ");   
				}   
			System.out.println(); 
		}   
	}   
}  
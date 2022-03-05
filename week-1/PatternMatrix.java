public class PatternMatrix {
	/*
11      12      13      14      15
21      22      23      24      25
31      32      33      34      35
41      42      43      44      45
51      52      53      54      55
*/
	
	public static void main(String[] args) {
		String num1=args[0];
		int row=Integer.parseInt(num1);
		String num2=args[1];
		int col=Integer.parseInt(num2);
		
		PatternMatrix pd=new PatternMatrix();
		pd.printMatrix(row,col);
	}	
		void printMatrix(int r,int c){
			
		for (int row = 1; row <= r; row++) 
		{
			System.out.print("\n");
			for (int col = 1; col <= c; col++) 
			{
				//System.out.print("\t");
				System.out.print(row + "" + col + "\t");
			}
		}
		}
	}



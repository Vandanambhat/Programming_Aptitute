public class PatternDiagonals {
	/*done
	
        11
                        22
                                        33
                                                        44
                                                                        55
	*/
	public static void main(String[] args) {
		String num1=args[0];
		int row=Integer.parseInt(num1);
		String num2=args[1];
		int col=Integer.parseInt(num2);
		PatternDiagonals pd=new PatternDiagonals();
		pd.printDiagonals(row,col);
	}	
		void printDiagonals(int r,int c){
			
		for (int row = 1; row <= r; row++) 
		{
			System.out.print("\n");
			for (int col = 1; col <= c; col++) 
			{
				System.out.print("\t");
				if(row==col)
				{
				System.out.print(row + "" + col + "\t");
				}
				else{
					System.out.print("\t");
				}

			}
		}
		}
	}


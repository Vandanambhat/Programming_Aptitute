class PatternL {
	
	public static void main(String[] args) {
		String num1=args[0];
		int row=Integer.parseInt(num1);
		String num2=args[1];
		int col=Integer.parseInt(num2);
		PatternL pd=new PatternL();
		pd.printSquare(row,col);
	}
		void printSquare(int r,int c){
			
		for (int row = 1; row <= r; row++) 
		{
			System.out.print("\n");
			for (int col = 1; col <= c; col++) 
			{
				System.out.print("\t");
				// 
				if(  row<=3 && col<=3 && row==3 || col==3 )
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
	
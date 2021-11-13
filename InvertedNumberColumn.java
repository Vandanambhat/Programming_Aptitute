public class InvertedNumberColumn  
{  
/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

public static void main(String[] args)     
{ 
		String num1=args[0];
		int row=Integer.parseInt(num1);
		String num2=args[1];
		int col=Integer.parseInt(num2);
		
		InvertedNumberColumn pd=new InvertedNumberColumn();
		pd.getdetails(row,col); 
		
}
void getdetails(int r,int c){
int rows=5;  
for (int row = rows; row >= 1; row--)   
{  
for (int col = 1; col <= row; col++) 
{
System.out.print(col+" ");  
}  
System.out.println();  
}    
}
}
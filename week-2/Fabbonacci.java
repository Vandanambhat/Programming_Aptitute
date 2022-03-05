class Fabbonacci{
//0   1   1   2   3   5   8   13   21   34 : System.out.print(num1 +"   "); 
//1   2   3   5   8   13   21   34   55   89 : System.out.print(sum +"   "); This will give you the correct series

public static void main(String[] args){

		//String in=args[0];
		//int input=Integer.parseInt(in);
	
		Fabbonacci fabbonacci=new Fabbonacci();
		//fabbonacci.printusingForLoop();
		//fabbonacci.printUsingWhileLoop();
		//fabbonacci.printUsingDoWhileLoop();
		fabbonacci.printUsingRecursion(0,1);
}

void printUsingRecursion(int num1,int num2){
	int sum;
	System.out.println(num1+" ");
	if(num1<=100)
	{
		sum=num1 + num2;
		printUsingRecursion(num2,sum);
	}
}
/*void printUsingDoWhileLoop(int input){
		int sum;
		int num1=0,num2=1;
		int index=0;
		do{
			System.out.print(num1 +"   ");
			
			sum=num1 + num2;
			num1=num2;
			num2=sum;
			index++;
		}while(index<=10);//or u can give give while(num1<100)i.e., it will print numbers below 100
		//output :0   1   1   2   3   5   8   13   21   34   55
}*/
/*void printUsingWhileLoop(){
		
		int sum;
		int num1=0,num2=1;
		int index=0;
		while(index<=10){
			
			System.out.print(num1 +"   ");
			
			sum=num1 + num2;
			num1=num2;
			num2=sum;
			index++;
			
		}
		//output 0   1   1   2   3   5   8   13   21   34   55
}*/
	/*void printusingForLoop(){

		int sum;
		int num1=0,num2=1;

		for(int index=1; index<=10;index++){
			System.out.print(num1 +"   ");
			
			sum=num1 + num2;
			num1=num2;
			num2=sum;
			//System.out.print(sum +"   ");
			
		}
	}*/
}
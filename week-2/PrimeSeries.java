import java.util.Scanner;

class PrimeSeries{

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num;
		System.out.print("Enter the n Value: ");
		num=input.nextInt();
			
		PrimeSeries prime=new PrimeSeries();
		prime.isPrime(num);
	    input.close();
	}

	void isPrime(int num)
	{
		int count=0;
		for(int i = 1 ; i <=num ; i++)	
		{	
			if(num % i == 0)
			count=count+1;
		}
		if(count == 2)	
		System.out.println("Prime Number");
		else
		System.out.println("Not a Prime Number");
	   /* 
	   static int isPrime(int i,int num)
		{
	   if(num==i)
	        return 0;
	    else
	        if(num%i==0)
	            return 1;
	    else{
	        return CheckPrime(i+1,num);
	    }
		}
		*/
	}
	
}
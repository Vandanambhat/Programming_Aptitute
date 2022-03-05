import java.util.Scanner;
public class Prime{          

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int num;
		System.out.print("Enter the n Value: ");
		num=input.nextInt();
			
		Prime prime=new Prime();
		prime.isPrimeUsingRecursion(num);
	    input.close();
	}

	void isPrimeUsingRecursion(int num)
	{
		int count=0;
		for(int i = 1 ; i <=num ; i++)	
		{	
			if(num % i == 0)
			count++;
		isPrimeUsingRecursion(num);
		}
		if(count == 2)	
		System.out.println("Prime Number");
		else
		System.out.println("Not a Prime Number");
                                       
        /*public static void main(String[] args)
	{	                                                //main method declaration
        Scanner sc=new Scanner(System.in);      //scanner class object creation

		System.out.println("Enter a number");
		int n = sc.nextInt();	//taking a number n as input
		int count=0;
		
		for(int i = 1 ; i <=n ; i++)	n=4 4%1==0; c=1 2 3
		{	
			if(n % i == 0)	{	//condition for getting the factors of number n
			count=count+1;
			} 
		}
		if(count == 2)	//if factors are two then, number is prime else not
		System.out.println("Prime Number");
		else
		System.out.println("Not a Prime Number");
		
		sc.close();		                   //closing scanner class(not mandatory but good practice)
	}    */           //end of main method
	}
}              //end of class
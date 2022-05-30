import java.util.Random;
import java.util.Scanner;

public class Numguess{

	public static void main(String[] args) {
		Random rd= new Random();		
		int n,f=0,l=100,count=0;
		int num=rd.nextInt(l+1);
		Scanner sc= new Scanner(System.in);
		while(count<=8)
		{
			System.out.println("Number is between "+f+" and "+l);
			n=sc.nextInt();
			if(n>l || n<f)
			{
				System.out.println("Invalid Input");
				continue;
			}
			
			count++;
		    if(n==num)
		    {
		        System.out.println("You guessed the Number");
		        break;
		    }
		    else if(num>=f && num<=((f+l)/2))
		    l=(f+l)/2;
		    else if(num<=l && num>((f+l)/2))
		    f=(f+l)/2;
		    
		}
		sc.close();
		System.out.println("Attempt "+count);
		System.out.println("\nYour Score is "+(11-count)*10);
	}

}

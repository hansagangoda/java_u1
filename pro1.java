import java.util.*; //pro1

public class pro1
{
	public static void main(String []args)
	{
		if(args.length!=5)
		{
			System.out.println("Eneter Minimum 5 value");
			System.exit(1);
		}
		
		int[] number=new int[5];
		
		for(int i=0;i<5;i++)
		{
			number[i]=Integer.parseInt(args[i]);
		}
		
	    Arrays.sort(number);
		
	    System.out.println("After sorted Value:");
		for(int i=0;i<5;i++)
		{
			System.out.print(number[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
		System.out.println("Minimum value:"+number[0]);
		System.out.println("Maximum value:"+number[4]);
		
	  
	}
}
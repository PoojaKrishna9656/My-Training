
public class NumPrime
{

	public static void main(String[] args) 
	{
		int limit=20,flag=0;
		for(int i=2;i<=limit;i++)
		{
			flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
				
		    }
			if(flag==0)
			System.out.println(i);
		}

	}

}
/*

public class NumPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		System.out.println("prime numbers within "+x+" are");
		for(int i=2;i<=x;i++)
		{
			int f=1;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					f=0;
					break;
				}

			}
			if(f==1)
				System.out.println(i);
		}
	}

}

*/
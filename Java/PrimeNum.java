
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,flag=0,m=5,n=0;
		
		if(m==1||m==0)
		{
			System.out.println(m+"is not a prime number...");
		}
		else
		{
			for(i=2;i<m;i++)
			{
				if(m%i==0)
				{
					 
					 flag=1;
					 break;
				}
			}
			if(flag==1)
				 System.out.println(m+"is not a prime number...");
			else
				System.out.println(m+"is a prime number...");
		}

	}

}

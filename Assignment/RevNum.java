public class RevNum {
	public static void main(String[] args) 
	{
		int n=123455,rev=0;
		int temp=n;
		
		System.out.println("Original num"+temp);
		while(n>0)
		{
			temp=n%10;
			rev=rev*10+temp;
			n=n/10;
		}
		System.out.println("Reveresed num"+rev);
		}
	}


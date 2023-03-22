public class Palindrome6 {
	public static void main(String[] args) 
	{
		int n=141,rev=0;
		int temp=n;
		
		System.out.println("Original num"+temp);
		while(n>0)
		{
			temp=n%10;
			rev=rev*10+temp;
			n=n/10;
		}
		System.out.println("Reveresed num"+rev);
		
		if(temp==rev)    
           System.out.println("palindrome number ");    
         else    
           System.out.println("not palindrome");    
		}
	}


//HAVE DOUBT
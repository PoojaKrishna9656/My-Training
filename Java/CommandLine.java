
public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=Integer.parseInt(args[0]);
		int y =Integer.parseInt(args[0]);
		if(x==10)
		{
			if(x!=y)
			{
				int a=x+y;
				System.out.println("sum"+a);
			}
			else
				System.out.println("not a sum");
		}
		else
		{
			System.out.println("end");
				
		}

	}

}

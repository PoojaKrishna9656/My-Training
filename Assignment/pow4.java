public class pow4 
{
   public static void main(String args[])
   {
		
        int base =50;
		int expo=2;
		int temp = base;
     for (int i=1; i<expo; i++)
	{
     temp = temp*temp;
    }
      System.out.println("Result of "+base+" power "+expo+" is "+temp);
   }
}
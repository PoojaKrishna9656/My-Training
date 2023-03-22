package test;

public class ProgramExample {
	public static void main(String args[])
	{
       int a=30,b=0,c=0;
       System.out.println("Before execution");
       try {
       c=a/b;
       }
       catch(Exception ae) {
    	   System.out.println("Arithemetic Exception handled "+ae);
       }
       
       System.out.println("After execution"+c);
	}
}

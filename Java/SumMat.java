
public class SumMat {
	public static void main(String[] args)
	{
		int rows=3,cols=3;	
		int array[][]= {{1,2,3},{5,6,7},{9,1,2}};
		int array1[][]= {{5,6,7},{9,1,2},{1,2,3}};
		for(int i[]:array)
		{
			for(int j:i) 
			{
				System.out.print( j +"    ");
			}
			System.out.println();
			
			
		}
		System.out.println();
		for(int n[]:array1)
		{
			for(int m:n) 
			{
				System.out.print( m +"    ");
			}
			System.out.println();
		}
		int sum[][]=new int[rows][cols];
		
		for(int p=0;p<rows;p++)
		{
			for(int q=0;q<cols;q++)
			{
				sum[p][q]=array[p][q]+array1[p][q];
				System.out.print( sum[p][q] +"    ");	
				
			}
			System.out.println();
			
		}
		
	}


}

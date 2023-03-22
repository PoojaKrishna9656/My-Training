package test;

public class StudentAddress extends Student {
	string address;
	public void setAddress(string address)
	{
		this.address=address;
		
	}
	public string getAddress()
	{
		return address;
	}
	public static void main(String args[]) 
	{
		Address s = new Address();
		s.setNAme("Pooja");
		s.setRollNum(8);
		s.setAddress("Kerala");
		System.println(s.getName());
		System.println(s.setRollNum());
		System.println(s.setAddress9+());
	}

}

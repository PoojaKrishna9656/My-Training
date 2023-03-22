package pkg;

public class Student {
	
	String name;
	int rollnum;
	String collname;
	
	Student(int rollnum,String name,String collname){
		
		this.rollnum=rollnum;
		this.collname=collname;
		this.name=name;
	}

	
	void Display() {
		
		System.out.println(rollnum+name+collname);
	}

	public static void main(String args[]) {
		
		Student s=new Student(8,"Pooja","LBS");
		Student s1=new Student(5,"Aswathy","Cet");
		s.Display();
		s1.Display();
	}

}

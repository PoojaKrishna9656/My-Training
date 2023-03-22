class Box{

	double w, h, d;

	Box(double width, double height, double depth){

      w=width;
	   h=height;
	   d=depth;
		//System.out.println("b1 volume= " + volume());
	}

	Box(){
	  w=1;
	  h=1;
	  d=1;
		//System.out.println("b2 volume= " + volume());
	}
	  
	  
	Box(double length){
	 w=h=d=length;
		//System.out.println("b3 volume= " + volume());
	}
	
	public void display(){
		System.out.println("Volume of Box");
	}
	 
	
	public double volume(){
		display();
	 return w*h*d;
	}
	
	
	
	public static void main(String ar[]){
		System.out.println(" execution starts ");
		
		
		Box b1=new Box(10,20,30);

		Box b2= new Box();
		
		Box b3= new Box(2);
		
		System.out.println("w =  " + b1.w + " h = " +b1.h + " d = " +b1.d);
		double v1 = b1.volume();
		System.out.println("b1 volume= " + v1);
		
		
		System.out.println("w =  " + b2.w + " h = " +b2.h + " d = " +b2.d);
		System.out.println("b2 volume= " +b2.volume());
		
		
		System.out.println("w =  " + b3.w + " h = " +b3.h + " d = " +b3.d);
		System.out.println("b3 volume= " +b3.volume());
		
		System.out.println("end of the code");
	}
	
}

	 
	 
	 
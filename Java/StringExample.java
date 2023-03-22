class StringExample{

//String objName;
//objName = new String();

String s = "java";

String s1 = new String("Welcome");

String s2 = "JAVA";


public String read(){
	
	
		return s;
	
}


public void stringMethods(){
	
	System.out.println(s.concat(" version 8"));
	System.out.println(s.charAt(3));
	System.out.println(s.isEmpty());
	System.out.println(s.equals(s2));
	System.out.println(s.equalsIgnoreCase(s2));
	System.out.println(s.replace('j' , 'J'));
	System.out.println(s.substring(2));
	System.out.println(s.substring(1,3));
	System.out.println(s.length());
}

public static void main(String ar[]){
	StringExample s1= new StringExample();
	System.out.println(s1.read());
	s1.stringMethods();

}
}








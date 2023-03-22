package pkg;

import java.util.*;

public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("pineapple");

		Iterator<String> it= fruits.iterator();
		System.out.println(it.next());
	}
}
package list;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>obj=new ArrayList<String>();
		obj.add("Meenu");  // add method
		obj.add("Aami");
		obj.add("Devu");
		obj.add("Aami"); 
		System.out.println(obj);
		obj.set(2, "Anamika"); // set method
		System.out.println(obj);
		int a=obj.indexOf("Aami");	// to find first occurrence of same string
		System.out.println(a);
		int b=obj.lastIndexOf("Aami");
		System.out.println(b); // to find last occurrence
		obj.remove(3);		// remove method // either give index value or value
		System.out.println(obj);
		String x=obj.get(0);	//to get a value from the list at index value
		System.out.println(x);
		boolean z=obj.contains("Anamika"); // to search an element
		System.out.println(z);
	}

}

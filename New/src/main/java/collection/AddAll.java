package collection;

import java.util.ArrayList;

public class AddAll { //ArrayList Methods

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>obj=new ArrayList<String>();
		obj.add("Meenu");
		obj.add("Anamika");
		obj.add("Adithya");
		obj.add("Namitha");
		System.out.println(obj);
		ArrayList<String>obj1=new ArrayList<String>();
		obj1.add("Devu");
		obj1.add("Aami");
		obj1.add("Nimmy");
		obj1.add("Briju");
		System.out.println(obj1);
		obj.addAll(obj1);		//addAll()
		System.out.println(obj);
		boolean x=obj.contains("Aami");		// contains()
		System.out.println(x);
		System.out.println(obj.get(6));	//get()
		boolean y=obj.isEmpty();	// isEmpty()
		System.out.println(y);
		obj.remove("Namitha");	//remove()
		System.out.println(obj);
		System.out.println(obj.size());  //size()
	}

}

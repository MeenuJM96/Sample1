package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListR {

	public static void main(String[] args) {	//Generic type
		// TODO Auto-generated method stub
		ArrayList<String>obj=new ArrayList<String>();
		obj.add("Meenu");
		obj.add("Anamika");
		obj.add("Adithya");
		Iterator<String> i=obj.iterator();			// iterator interface
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		i.remove();
		System.out.println(obj);
		
	}

}

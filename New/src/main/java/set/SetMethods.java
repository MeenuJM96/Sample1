package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> obj = new LinkedHashSet<String>();  
		obj.add("Meenu");   // add()
        obj.add("Aami");   
        obj.add("Devu");   
        obj.add("Abhirami");   
        System.out.println(obj);  
        boolean x=obj.contains("Aami"); // contains()
        System.out.println(x);
        obj.remove("Abhirami");	// remove()
        System.out.println(obj);
        boolean z=obj.isEmpty();	// isEmpty()
        System.out.println(z);
        int a=obj.size();	// size()
        System.out.println(a);
	}

}

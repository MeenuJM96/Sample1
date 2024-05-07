package linkedlist;

import java.util.LinkedList;

public class LinkedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> obj = new LinkedList<String>(); 
		  
		obj.add("Meenu"); 
        obj.add("Devu"); 
        obj.add(1, "Aami"); 
        obj.add("adithya");
        obj.add("Briju");
  
        System.out.println("Initial LinkedList : " + obj); 
  
        obj.set(2, "Nimmy"); 
  
        System.out.println("Updated LinkedList : " + obj); 
        
        System.out.println();  
        
        obj.remove(2); 
        
        System.out.println("After the Removal : " + obj); 
  
        System.out.println();  
        
        // to iterate the elements using for loop
        
        for (int i = 0; i < obj.size(); i++) {  	
            
            System.out.println(obj.get(i) + " ");  
        }  
    
        System.out.println();  
    
        // to iterate elements using the for each loop  
        for (String str : obj)  
            System.out.println(str); 
        
        System.out.println();  
        
        // Displaying the size of the list 
        System.out.println("The size of the linked list is: " + obj.size()); 
        
        System.out.println();  
        
        //removing the first element
        System.out.println("The  remove first element is: " + obj.removeFirst()); 
        // Displaying the final list 
        System.out.println("Final LinkedList:" + obj); 
        
        System.out.println();
        
        // Remove the last element using removeLast() 
        System.out.println("The last element is removed: " + obj.removeLast()); 
        // Displaying the final list 
        System.out.println("Final LinkedList:" + obj);
	}

}

package Example.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Student {

	public static void main(String[] args) {
		
		ArrayList<TestSort> object = new ArrayList<TestSort>();
		object.add(new TestSort(101,"Sachin",28));
		object.add(new TestSort(102,"Sachi",24));
		object.add(new TestSort(103,"Sach",12));
		object.add(new TestSort(103,"Sach",10));
		
		//We need to sort 
		Collections.sort(object);
		
		// we need to display the elements
		for(TestSort st:object) {
			System.out.println(st.rollNo + " " + st.name+ " " + st.age);
		}
	}
}
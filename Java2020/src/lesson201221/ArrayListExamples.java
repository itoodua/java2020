package lesson201221;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExamples {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(5);
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(15);
		list.add(15);
		list.add(5);
		list.add(15);
		list.add(15);
		
//		list.removeIf(t -> t < 12);
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}

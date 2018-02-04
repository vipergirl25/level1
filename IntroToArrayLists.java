package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> strings = new ArrayList<String>();
		//   Don't forget to import the ArrayList class
		
		//2. Add five Strings to your list
		strings.add("hi");
		strings.add("i am elena");
		strings.add("i am adding strings");
		strings.add("to this array");
		strings.add("because i feel like it");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < strings.size(); i++) {
			System.out.println(strings.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String s:strings) {
			System.out.println(s);
		}
		
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < strings.size(); i+=2) {
			System.out.println(strings.get(i));
		}
		
		//6. Print all the Strings in reverse order.
		for (int i = strings.size(); i > 0; i--) {
			int at = i - 1;
			System.out.println(strings.get(at));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < strings.size(); i++) {
			int length = strings.get(i).length();
			String hello = strings.get(i);
			for (int j = 0; j < length; j++) {
				char helloe = hello.charAt(j);
				String helloee = Character.toString(helloe);
				if(helloee.equals("e")) {
					System.out.println(strings.get(i));
					break;
				}
			}
		}
	}
}

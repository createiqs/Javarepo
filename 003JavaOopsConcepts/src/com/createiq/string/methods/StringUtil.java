package com.createiq.string.methods;

public class StringUtil {

	static int factory(int number) {
		if (number != 0)
			return number * factory(number - 1);
		else
			return 1;

	}

	static int recursion(String input, char search, int index) {
		int count = 0;
		if (search == input.charAt(index))
			count++;

		return count + recursion(input, search, index + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fruits = "mango, banana , apple ";
		String[] fruitsof = fruits.split(",");
		for (String fruit : fruitsof) {
			if (fruit.startsWith("m")) {
				System.out.println(fruit);
			}
		}

		String input = "hello";
//		char[] ch = input.toCharArray();
//		int count = 0;
		char search = 'l';
//		for (int i = 0; i < ch.length; i++) {
//			if (search == ch[i]) {
////			System.out.println(ch[i]);
//				count++;
//			}
//		}
//		System.out.println(count);

//		int result = factory(4);
//		System.out.println(result);

//		int cou = recursion(input, search, 0);
//		System.out.println(cou);
	}

}

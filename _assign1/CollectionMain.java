package ns222tv_assign1;

public class CollectionMain {

	public static void main(String[] args) {
		ArrayIntList list = new ArrayIntList(0);

		list.add(6);
		list.add(1);
		list.add(8);
		System.out.println("the index contains number 8 is : "+ list.indexOf(8));
		list.addAt(5, 2);
		list.addAt(9, 0);
		System.out.println("Our list contains the following numbers after adding 5 and 9 to the list: "+ list);
		list.remove(0);
		list.remove(2);
		System.out.println("The list contains following numbers after using remove method " +list.toString());

		ArrayIntStack stack = new ArrayIntStack();

		stack.push(7);
		System.out.println("The poped item is "+stack.pop());

	}
}


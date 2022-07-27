
public class main {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("1¹ø");
		shelfQueue.enQueue("2¹ø");
		shelfQueue.enQueue("3¹ø");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		Stack shelfStack = new BookShelf();
		shelfStack.push("1qjs");
		shelfStack.push("2qjs");
		shelfStack.push("3qjs");
		System.out.println(shelfStack.pop());
		System.out.println(shelfStack.pop());
		System.out.println(shelfStack.pop());		
		System.out.println(shelfStack.pop());
		
	}

}

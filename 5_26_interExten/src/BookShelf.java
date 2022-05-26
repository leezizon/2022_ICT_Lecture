
public class BookShelf extends Shelf implements Queue,Stack {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		if(getSize()<=0) {
			return "ť�� ������ϴ�";
		}
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

	
	
	
	
	
	@Override
	public void push(String title) {
		shelf.add(title);
	}

	@Override
	public String pop() {
		if(getSize()==0) {
			return "������ ������ϴ�";
		}
		return shelf.remove(getSize()-1);
	}

	@Override
	public int getStacjSize() {
		return getCount();
	}

}

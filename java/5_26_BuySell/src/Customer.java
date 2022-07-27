
public class Customer implements Buy,Sell {

	@Override
	public void sell() {
		System.out.println("주문");
	}

	@Override
	public void buy() {
		System.out.println("판매");
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void order() {
		System.out.println("고객판매주문");
	}

}


public class Customer implements Buy,Sell {

	@Override
	public void sell() {
		System.out.println("�ֹ�");
	}

	@Override
	public void buy() {
		System.out.println("�Ǹ�");
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void order() {
		System.out.println("���Ǹ��ֹ�");
	}

}

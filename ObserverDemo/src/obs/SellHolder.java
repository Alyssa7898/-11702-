package obs;

import java.util.ArrayList;
import java.util.List;

public class SellHolder implements IStockHolder {
	private List<AStockPrice>attentionList;
	private String name;
	public SellHolder(String name) {
		// TODO Auto-generated constructor stub
		attentionList=new ArrayList<AStockPrice>();
		this.name=name;
	}

	@Override
	public void update(AStockPrice asp) {
		// TODO Auto-generated method stub
		if(attentionList.contains(asp)) {
			System.out.println(name);
			if(asp.getPrice()-asp.getPrice2()>0) {
				System.out.println(asp.code+":");
				System.out.println("ԭ�ۣ�"+asp.price2+"�ּۣ�"+asp.price);
				System.out.println("���ˣ��ޣ�");
			}
			else {
				System.out.println(asp.code+":");
				System.out.println("ԭ�ۣ�"+asp.price2+"�ּۣ�"+asp.price);
				System.out.println("���ˣ�ˬ��");
			}
		}

	}

	@Override
	public void AddHolder(AStockPrice asp) {
		// TODO Auto-generated method stub
		attentionList.add(asp);
		asp.Add(this);
	}

}

package obs;

import java.util.ArrayList;
import java.util.List;

public abstract class AStockPrice {
	protected float price,price2;//现价，原价
	

	public float getPrice2() {
		return price2;
	}

	public void setPrice2(float price2) {
		this.price2 = price2;
	}

	protected String code;//区分对象,code相同则认为是同一种股票
	protected List<IStockHolder>stockHolderlist;//观察者种类
	
	public void Add(IStockHolder Ish) {
		stockHolderlist.add(Ish);
	}
	
	public void Remove(IStockHolder Ish) {
		stockHolderlist.remove(Ish);
	} 
	
	public AStockPrice(String code) {
		this.code=code;
		price=price2=0;
		stockHolderlist=new ArrayList<IStockHolder>();
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
		notifyHolder();
	}
	
	//不同的股票种类有不同类型的通知
	abstract protected void notifyHolder();
   //代码生成器自动生成，保留code,去掉price进行区分。
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AStockPrice other = (AStockPrice) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}

	
	
	
	
}

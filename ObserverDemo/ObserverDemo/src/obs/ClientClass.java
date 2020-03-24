package obs;

public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AStockPrice future1=new StockFutures("111");
		AStockPrice future2=new StockFutures("222");
		AStockPrice future3=new StockFutures("333");
		
		future1.setPrice(50);
		future1.setPrice2(80);
		future2.setPrice(70);
		future2.setPrice2(55);
		future3.setPrice(90);
		future3.setPrice2(80);
		
		
		AStockPrice common5=new StockCommon("555");
		AStockPrice common6=new StockCommon("666");
		AStockPrice common7=new StockCommon("777");
		
		common5.setPrice(77);
		common5.setPrice2(60);
		common6.setPrice(66);
		common6.setPrice2(90);
		common7.setPrice(78);
		common7.setPrice2(80);
		
		IStockHolder Buy1=new BuyHolder("Buy1");
		IStockHolder Buy2=new BuyHolder("Buy2");
		IStockHolder Buy3=new BuyHolder("Buy3");
		
		IStockHolder sell1=new SellHolder("sell1");
		IStockHolder sell2=new SellHolder("sell2");
		IStockHolder sell3=new SellHolder("sell3");
		
		Buy1.AddHolder(future1);
		Buy1.AddHolder(future2);
		Buy1.AddHolder(common5);
		
		Buy2.AddHolder(future1);
		Buy2.AddHolder(future3);
		Buy2.AddHolder(common6);
		
		Buy3.AddHolder(future3);
		Buy3.AddHolder(future2);
		Buy3.AddHolder(common7);
		
		sell1.AddHolder(future1);
		sell1.AddHolder(future3);
		sell1.AddHolder(common6);
		
		sell2.AddHolder(future1);
		sell2.AddHolder(future2);
		sell2.AddHolder(common5);
		
		sell3.AddHolder(future3);
		sell3.AddHolder(future2);
		sell3.AddHolder(common7);
		
		
	}

}

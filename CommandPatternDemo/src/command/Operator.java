package command;

public class Operator {

	public void MarkFruit(Order order) {
		// TODO Auto-generated method stub
		String str="";
		for(String key:order.getFruitmap().keySet()) {
			str+=key+order.getFruitmap().get(key);
		}
		System.out.println("ºÚ°µ»ìºÏ¹ûÖ­£º"+str);
		
	}

}

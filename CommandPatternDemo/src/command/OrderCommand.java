package command;

public class OrderCommand implements Command {
	private Operator receiver;
	private Order order;
	public OrderCommand(Operator receiver,Order order) {
		this.receiver=receiver;
		this.order=order;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
        System.out.println(order.getId()+"号顾客的成品");
        receiver.MarkFruit(order);
	}

}

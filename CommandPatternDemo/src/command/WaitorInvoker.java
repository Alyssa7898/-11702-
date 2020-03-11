package command;

import java.util.ArrayList;

public class WaitorInvoker {

	private ArrayList<Command>commands=null;
	public WaitorInvoker() {
		commands=new ArrayList<Command>();
	}
	public void setCommand(Command cmd) {
		commands.add(cmd);
	}
	public void OrderUp() {
		System.out.println("�µĶ�����");
		for(Command cmd:commands) {
			if(cmd!=null)
				cmd.execute();
		}
	}
}

package com.hh;

public class DeadState extends ThreadState {
	public DeadState() {
		state=StateSet.DEAD;
		System.out.println("����״̬");
	}

	public void stop(ThreadContext tc) {
		// TODO Auto-generated method stub
		System.out.println("����getCpu����");
		if(state==StateSet.DEAD)
			tc.setThreadState(new DeadState());
		else
			System.out.println("��ǰ״̬����");
	}
}

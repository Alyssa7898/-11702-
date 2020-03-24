package com.hh;

public class DeadState extends ThreadState {
	public DeadState() {
		state=StateSet.DEAD;
		System.out.println("就绪状态");
	}

	public void stop(ThreadContext tc) {
		// TODO Auto-generated method stub
		System.out.println("调用getCpu方法");
		if(state==StateSet.DEAD)
			tc.setThreadState(new DeadState());
		else
			System.out.println("当前状态死亡");
	}
}

package com.hh;

public class RunnableState extends ThreadState {
	public RunnableState() {
		state=StateSet.RUNNABLE;
		System.out.println("����״̬");
	}

	public void getCpu(ThreadContext tc) {
		// TODO Auto-generated method stub
		System.out.println("����getCpu����");
		if(state==StateSet.RUNNABLE)
			tc.setThreadState(new RunningState());
		else
			System.out.println("��ǰ״̬���Ǿ���״̬");
	}
}

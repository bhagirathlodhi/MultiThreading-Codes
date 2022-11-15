package com.thread;

public class MyThread01 extends Thread {

	public void run() {
		for(int i = 10;i>=1;i--)
		{
			System.out.println(i);
			 try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
	
	
}

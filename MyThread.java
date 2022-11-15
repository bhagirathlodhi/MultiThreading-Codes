package com.thread;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for(int i = 1;i<=10;i++)
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

	public static void main(String[] args)  {
		MyThread t1=new MyThread();
		
		Thread t2 =  new Thread(t1);
		Thread t=	Thread.currentThread();
		 String s= t.getName();
		 System.out.println(s);
	     MyThread01 mt = new MyThread01();
			mt.start();
			t2.start();
	    
	}
}

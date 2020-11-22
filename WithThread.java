package com.motivity;

public class WithThread implements Runnable {

	public static void main(String[] args) {
		WithThread wt=new WithThread();
		Thread t=new Thread(wt);
		t.start();
		for(int x=0;x<=20;x++) {
			System.out.println("x value is =" +x);
		}
	}
	public void run() {
		for(int i=0;i<=20;i++) {
			System.out.println("i value is =" +i);
		}
	}

}

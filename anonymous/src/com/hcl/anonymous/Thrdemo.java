package com.hcl.anonymous;

public class Thrdemo {
	
	public static void main(String[] args) {
		Thread t1=new Thread() {
		public void run() {
			for(int i=0;i<10;i+=2) {
				System.out.println("even "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
			
		};
		Thread t2=new Thread() {
			public void run() {
				for(int i=1;i<10;i+=2) {
					System.out.println("odd " +i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			};
			t1.start();
			t2.start();
		
	}

}

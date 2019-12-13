package com.hcl.anonymous;

class Demo{
	void dispMsg(String name) {
		System.out.println("hello "+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("how are u..");
	}
}

public class Syncdemo {
	public static void main(String[] args) {
		Demo obj=new Demo();
		Thread t1=new Thread() {
			public void run() {
				obj.dispMsg("pavani");
			}
			};
			Thread t2=new Thread() {
				public void run() {
					obj.dispMsg("suresh");
				}
					
				};
				t1.start();
				t2.start();
	}

}

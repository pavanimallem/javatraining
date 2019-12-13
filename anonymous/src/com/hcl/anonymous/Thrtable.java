package com.hcl.anonymous;

class Mtable {
	void show (int n) {
		int p;
		for(int i=1;i<=10;i++) {
			p=n*i;
			System.out.println(n +" * " +i+ " = " +p);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
}

public class Thrtable {
	public static void main(String[] args) {
		Mtable obj=new Mtable();
		Thread t1=new Thread() {
			public void run() {
				
			}
				
			};
	}

}

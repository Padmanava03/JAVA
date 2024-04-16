class A extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Thread #1 : "+i);
			try {
				A.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Thread #1 is DEAD!!!");
	}
	
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println("Thread #2 : "+i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Thread #2 is DEAD!!!");
	}
	
}

class C extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			if(i%2==0) {
				System.out.println("Thread #3 : "+i);
				try {
					C.sleep(1500);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
		System.out.println("Thread #3 is DEAD!!!");
	}
	
}

public class Exp19 {

	public static void main(String[] args) {
		A a = new A();
		MyRunnable myRunnable = new MyRunnable();
		Thread b = new Thread(myRunnable);
		C c = new C();
		a.start();
		b.start();
		c.start();
	}

}

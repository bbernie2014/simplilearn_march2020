package using_runnable_interface;

public class MyRunThread implements Runnable {

	@Override
	public void run() {
	
	for (int i = 0; i < 4; i++) {
		System.out.println("Printing from "+Thread.currentThread().getName()+" i = "+i);	
		try {
			Thread.currentThread().sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}

}

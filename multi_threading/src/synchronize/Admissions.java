package synchronize;

public class Admissions implements Runnable{
    int seats = 60;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		
		

	}
	public void run() {
		System.out.println("seats available :" + seats);
		if (seats>0) {
			System.out.println("seat allocated to :" +Thread.currentThread().getName());
		    seats=seats-1;
		}
		else {
			System.out.println("seat not available");
		}
	}

}

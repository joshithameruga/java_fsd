package multi_threading;

public class Demo extends Thread{
	
	public static void main(String args[]) { //min thread created by jvm
		 int x; //local variables also known as thread level variable
		System.out.println("child thread");
		Demo t1= new Demo();
		System.out.println(t1); //thread hashcode is overriden by tostring and we get thread details
	    t1.run();
	}
	
	@Override
	public void run() {
		
		
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}
	}

}

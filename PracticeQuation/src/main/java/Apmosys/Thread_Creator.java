package Apmosys;

public class Thread_Creator extends Thread {
	static int i = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		My_Thread MT=new My_Thread();
//		My_Thread MT1=new My_Thread();
//	    MT.start();
//		MT1.start();

		My_Thread1 MT2 = new My_Thread1();
		Thread t = new Thread(MT2);
		Thread t1 = new Thread(MT2);
		t.start();
		t1.start();
	}
}

class My_Thread extends Thread {

	int i = 50;

	public void run() {
		while (i > 1) {
			System.out.println(i);
			i--;
		}
	}
}


class My_Thread1 implements Runnable {

	int i = 50;

	public void run() {
		while (i > 0) {
			System.out.println(i);
			i--;
		}
	}
}

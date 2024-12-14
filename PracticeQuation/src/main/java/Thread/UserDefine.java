package Thread;
public class UserDefine  extends Thread{
	public void run() {
		System.out.println("Shikha");
	}

}
class User extends Thread{

	public void run() {
		System.out.println("Zombade");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDefine s=new UserDefine();
		User ss=new User();
		s.start();
		ss.start();
	}
}
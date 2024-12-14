package Assessment;

public class Write {

	public static void write(){
		System.out.println("Wtring");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p=new Programmer();
		p.write();
	}

}

class Author extends Write{
	public static void write(){
		System.out.println("Wtring Book");
	}
}
class Programmer extends Author{
	public static void write(){
		System.out.println("Wtring Code");
		Programmer p=new Programmer();
		p.write();}
	
}


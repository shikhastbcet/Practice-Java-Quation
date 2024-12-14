package String_Operation;

public class ExtractInt {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
//
//		String str = "10ad20nn30";
//		char ch[] = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
//		int num = 0 ;
//		int to = 0;
//		for (int i = 0; i < str.length(); i++) {
//			char cc = str.charAt(i);
//			for (int j = 0; j < ch.length; j++) {
//				if (ch[j] == str.charAt(i)) {
//
//					int n = Character.getNumericValue(cc);
//					num = num + n;
//
//				}
//
//			}
//
//		}
//				System.out.println(num);

		int b = 11100;

		boolean flag = true;
		while (b != 0) {
			
//			M strore reminder
			int m = b % 10;
//			System.out.println(m);
			
			if (m == 0 || m == 1) {

			} else {
				flag = false;
			}
			
//	Quatation		
			b=b/10;
			System.out.println(b);
		}
		
		
		if (flag == true) {
			System.out.println("It's binary number");
		}

	}
}

package String_Operation;

public class Duplicat_word_In_String {
	//INCOMPLITED
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str = "abcd ABCD abcd ABCD bb BB";
			int count;
			String[] words = str.split(" ");
			System.out.println("Duplicate words : "+words.length);
			for(int i=0; i<words.length;i++) {
		    count = 1;
				for (int j = 1; j < words.length; j++) {
					if (words[i].equalsIgnoreCase(words[j])) {
						count++;
						//avoiding  duplicate print string
						words[j] = "0";
					}
				}
				if (count > 1 && words[i] != "0")
					System.out.println(words[i] + " " + count);
			}
		
//			int number[] = { 1, 2, 3, 4, 1, 2, 3, 4 };
//			for (int i = 0; i < number.length; i++) {
//				count = 1;
//				for (int j = 1; j < number.length; j++) {
//					if (number[i] == number[j]) {
//						count++;
//						//avoiding  duplicate print number
//						number[j] = 0;
//					}
//				}
//				if (count > 1 ) {
//					System.out.println(number[i]+ " " + count);
//				}
//			}
	//
		}

	}

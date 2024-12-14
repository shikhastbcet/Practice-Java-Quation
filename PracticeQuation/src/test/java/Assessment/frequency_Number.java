package Assessment;

public class frequency_Number {
	public static void main(String[] args) {
		int Number[] = { 1, 2, 3, 4, 5, 2, 4, 4, 4, 1, 3, 8 };

		Number = sort(Number);//sorted 

		for (int i = 0; i < Number.length; i++) {
			int count = 0;
			for (int j = i; j < Number.length; j++) {
				if (Number[i] == Number[j]) {
					count++;
				}
			}
			if (count ==1) {
			occurance(Number, Number[i]);
			}
		}
	}

	// Sorting an array in asending order
	public static int[] sort(int Number[]) {
		int temp;
		for (int i = 0; i < Number.length; i++) {
			for (int j = 0; j < Number.length; j++) {
				if (Number[i] < Number[j]) {
					temp = Number[i];
					Number[i] = Number[j];
					Number[j] = temp;
					
				}
				if(Number[i]==Number[j]) {
					
				}
			}

		}

		return Number; // return the last greateest digit 5
	}

	// Finding an number of occurance in an array
	public static void occurance(int Number[], int no) {
		int count = 0;
		for (int i = 0; i < Number.length; i++) {
			if (Number[i] == no) {
				count++;
			}
		}
		System.out.println(no + " : " + count);

	}
}



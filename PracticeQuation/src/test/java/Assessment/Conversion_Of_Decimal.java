package Assessment;
public class Conversion_Of_Decimal {

	static void Binary(int num, int n) {
		String B = "";
		int temp = num;
		while (num > 0) {
			n = num % 2;
			num = num / 2;
			B = n + B;
		}
		System.out.println(B);

	}

	static void Octal(int num, int n) {
		String octal = "";
		while (num > 0) {
			n = num % 8;
			octal = n + octal;
			num = num / 8;
		}
		System.out.println(octal);

	}

	static void Hexa(int num, int n) {
		char Hexa[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		String HexaNum = "";
		while (num > 0) {
			n = num % 16;
			HexaNum = Hexa[n] + HexaNum;
			num = num / 16;

		}
		System.out.println(HexaNum);

	}

	public static void main(String[] args) {
		// Decimal To Binary
		int num = 9, n = 0;
		Binary(num, n);
		// Decimal to Octal
		Octal(num, n);
		// Decimal to Hexa
		Hexa(num, n);

	}
}

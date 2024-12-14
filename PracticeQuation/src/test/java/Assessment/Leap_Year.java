package Assessment;


import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter year :");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) { // If the year is centure then must be divisible by 400
				if (year % 400 == 0) {
					System.out.println(year + " is Leap year");
				} else {
					System.out.println(year + " is not Leap year");
				}
			}
			else {
				System.out.println(year + " is not Leap year");
			}
		}
		else {
			System.out.println(year + " is not Leap year");
		}
	}
}


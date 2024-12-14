package Assessment;

import java.util.Scanner;

public class Recurssion_Amstronge {

	static int ams = 0;

	public static int amstrong(int number) {
		// TODO Auto-generated method stub
		int n = number;
		while (number > 0) {
			int num = number % 10;
			ams += num * num * num;
			amstrong(n = n / 10);
			return ams;
		}
		return 0;

	}

	public static void main(String[] args) {
		System.out.println("Enter Number: ");

		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		int n = number;
		int ams = amstrong(number);
		if (ams == n) {
			System.out.println(n + " Amstrong Number " + ams);

		} else {
			System.out.println(n + " Not Amstrong Number " + ams);

		}

	}
}

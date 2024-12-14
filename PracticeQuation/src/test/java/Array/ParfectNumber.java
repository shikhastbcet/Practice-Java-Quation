package Array;

public class ParfectNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// We can Store All type of Data
		//Perfect number means that number wwhich sum of that numbet give reminder 0 of that parfect number mean 6 is divisible by 1+2+3=6; 
		int n= 6;
		int sum=0;
		int i= 1;
		while (i<n) {
			if(n%i==0) {
				sum=sum+i;				
			}
		i++;	
		}
		if(sum==n) {
			System.out.println("It's Perfect Number :"+n);			
		}
		else {
			System.out.println("It's not Perfect Number"+n);
		}
	}
}


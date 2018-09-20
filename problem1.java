public class problem1 extends commafy{
	public static void main(String[]args){
		int x = 1000;
		System.out.println("The sum of the multiples of 3 and 5 below 1000 is: ");
		commafy(getMultiples(x));
		System.out.println("");
	}
	public static int getMultiples(int max){
		int sum = 0;
		for(int i = 0; i < max; i++){
			if(i%3==0 || i%5==0){
				sum = sum + i;
			}
		}
		return sum;

	}

}
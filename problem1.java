public class problem1{
	public static void main(String[]args){
		int x = 1000;
		System.out.println("The sum of the multiples of 3 and 5 below 1000 is: " + getMultiples(x));
	}
	public static int getMultiples(int max){
		int sum = 0;
		for(int i = 0; i < max; i++){
			if(i%3==0 || i%5==0){
				sum = sum + i;
				System.out.println(i);
			}
		}
		return sum;

	}
}
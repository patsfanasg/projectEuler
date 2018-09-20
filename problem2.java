public class problem2 extends commafy{
	public static void main(String[]args){
		int x = 4000000;
		System.out.println("The sum of the even values in the Fibonacci sequence whose values don't exceed 4 million is: ");
		commafy(sumFib(x));
		System.out.println(" ");
	}
	public static int sumFib(int max){
		int sum = 0;
		int i = 0;
		int j = 1;
		int fib = 0;
		while(fib <= max){
			fib = i + j;
			if(fib%2==0){
			sum = sum + (fib);
			}
			i = j;
			j = fib;
}
return sum;
}
}
public class problem2{
	public static void main(String[]args){
		int x = 4000000;
		System.out.println(sumFib(x));
	}
	public static int sumFib(int max){
		int sum = 0;
		int i = 1;
		int j = 2;
		int fib = 0;
		while(fib< max){
			fib = i + j;
			System.out.println(fib);
			if(fib%2==0){

			sum = sum + (i + (i+1));
			}
			i = j;
			j = fib;


}
return sum;
}
}
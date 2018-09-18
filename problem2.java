public class problem2{
	public static void main(String[]args){

	}
	public static int sumFib(int max){
		int sum =0;
		int i = 1;
		int fib = 0;
		while(fib< max){
			fib = i + (i+1);
			if(fib%2==0){
			sum = sum + i + (i+1);
			}
			i++;
}
return sum;
}
public class problem2{
	public static void main(String[]args){

	}
	public static int sumFib(int max){
		int sum =0;
		while(sum< 4000000){
		for(int i = 1; i < max; i++){
			sum = sum + i + (i+1);
	}
}
return sum;
}
public class problem2{
	public static void main(String[]args){

	}
	public static int sumFib(int max){
		int sum =0;
		int i = 0;
		while(sum< max){
			if((i+(i+1))%2==0){
			sum = sum + i + (i+1);
			}
			i++;
}
return sum;
}
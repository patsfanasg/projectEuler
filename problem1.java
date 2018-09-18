public class problem1{
	public static void main(String[]args){

	}
	public int getMultiples(int max){
		int sum = 0;
		for(int i = 0; i <= max; i++){
			if(i%3==0 || i%5==0){
				sum = sum + i;
			}
		}
		return sum;

	}
}
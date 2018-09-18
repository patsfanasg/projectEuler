public class problem1{
	public static void main(String[]args){
		int x = 10;
		System.out.println(getMultiples(x));
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
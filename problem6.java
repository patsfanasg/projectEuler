public class problem6{
	public static void main(String[]args){
		System.out.println(findDiff(100));
	}
	public static int sumSquares(int x){
		int sum = 0;
		int j = 0;
		for(int i =1; i <= x; i++){
			j = i * i;
			sum = sum +j;
		}

		return sum;
	}
	public static int squareSum(int x){
		int sum = 0;
		for(int i = 1; i<=x; i++){
			sum = sum + i;
		}
		sum = sum * sum;
		return sum;
	}
	public static int findDiff(int max){
		int diff = 0;
		diff = Math.abs(squareSum(max) - sumSquares(max));
		return diff;
	}
}
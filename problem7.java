public class problem7{
	public static void main(String[]args){
		System.out.println(primeFac(10001));
	}
	public static double primeFac(double x){
		double count = 0;
		double ans =0;
		int j = 1;
		while(count!=x){
			if(isPrime(j)){
				ans = j;
				count++;
			}
			j++;
		}
		return ans;
}
public static boolean isPrime(int x){
    if(x%2==0){
		return false;
	}
    for(int i=3;i*i<=x;i+=2) {
        if(x%i==0){
            return false;
        }
    }
    return true;
}
}
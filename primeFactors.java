public class primeFactors extends commafy{
	public static void main(String[]args){
		System.out.println("The largest prime factor of " + "600851475143 is: " + primeFac(600851475143.0));
		System.out.println("");

	}
	public static double primeFac(double x){
		double big =0;
		for(int i = 0; i < Math.sqrt(x); i++){
			if(x%i==0){
				double fac = i;
				double count = 0;
		for(int j = 2; j < fac; j++){
			if(fac%j==0){
				count++;
				break;
			}
		}
			if(count==0&&fac>big){
				big = fac;
			}
			}
		}
		return big;
		}
}
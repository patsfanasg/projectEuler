public class commafy{
	public static void main(String[]args){
		commafy(2000);
	}
	public static void commafy(int x){
    if(x > 999) {
        commafy(x/1000);
        System.out.print(",");
        if(x % 1000 < 100){
        	System.out.print("0");
        } 
        if(x % 1000 < 10){
        	 System.out.print("0");
    	}
    	System.out.print(x%1000);
    }
    else {
        System.out.print(x);
    }

}

}

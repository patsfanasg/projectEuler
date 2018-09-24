public class problem4{
	public static void main(String[]args){
		System.out.println(checkPal(10001));
		System.out.println(findBiggest());
	}
	public static boolean checkPal(int x){
		String actual = "" + x;
		String pal = "";
		while(x>0){
			pal = pal + x%10;
			x = x/10;
		}
		if(pal.equals(actual)){
			return true;
		}
		else{
			return false;
		}
	}
	public static int findBiggest(){
		int pal = 0;
		for(int i = 100; i <= 999; i++){
			for(int j = 100; j <=999; j++){
				int x = i *j;
				if(checkPal(x)){
					if(pal<x){
						pal = x;
					}
				}
			}
		}
		return pal;
	}
}
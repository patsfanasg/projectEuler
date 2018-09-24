public class problem5{
	public static void main(String[]args){
		System.out.println(smallDiv());
	}
	public static int smallDiv(){
		boolean t = false;
		int i = 20;
		while(t!=true){
			t=true;
			i++;
			for(int j = 1; j <=20; j++){
				if(i%j!=0){
					t = false;
				}
			}
		}
		return i;
	}
}
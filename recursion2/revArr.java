package recursion2;

public class revArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {23,45,12,65,445,22,2};
		
		revarr(arr,0);
		

	}
	
	public static void revarr(int[] arr,int vi) {
		
		if(vi==arr.length) {
			return;
			
		}
		
		revarr(arr,vi+1);
		System.out.print(arr[vi]+" ");
		
	}

}

package intro;

public class ArraysForIfElse  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,25,32,61,90};
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				
				System.out.println(arr[i]+" "+"is even number");
			}
			else if(arr[i]%3==0){
				
				System.out.println(arr[i]+" "+"can divided by 3");
			}
			else {
				
				System.out.println("for"+" "+arr[i]+" "+"nothing to do");
			}
		}
	}

}

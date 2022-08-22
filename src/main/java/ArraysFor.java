

public class ArraysFor{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=4;
		arr[3]=5;
		arr[4]=6;
		
		int [] arr2 = {1,2,4,5,6,7,8,9,10,122};
		
		String[] name = {"semih","merve","burhan","asd","2","dsa"};
		
//		for(int i = 0; i < arr.length; i++) {
//	
//			System.out.println(arr[i]);
//			
//		}
//		
		for(int i = 0; i < arr2.length; i++) { 
			
			System.out.println(arr2[i]);
			
		}
		
		for(int i = 0; i < name.length; i++) {
			
			System.out.println(name[i]);
			
		}
		
		for ( String s : name) {
			
			System.out.println(s);
			
		}
		
	}

}

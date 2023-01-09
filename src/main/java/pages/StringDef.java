package pages;

public class StringDef {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String is an object
		String s = "semih";
		String s1 = "semih"; // one object already created as string in s so s1 is not created. this method is memory allocate
		
		String s2 = new String("burhan");
		String s3 = new String("burhan"); // two different object has created because new is define as new string and another memory has allocated
		
		String a = "jimmy floyd hesselbaink";
		String[] splittedString = a.split("floyd");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim()); // trim is removing blank space jimmy first " hesselbaink" second first.trim "hesselbaink" without blank
		
		// letter by letter as a new line
		for(int i=0;i<a.length();i++) {
			System.out.println(a.charAt(i));
		}
		
		// print a string reverse order "kniablesseh dyolf ymmij" line line
		for(int i=a.length()-1;i>=0;i--) {
			System.out.println(a.charAt(i));
		}

	}

}
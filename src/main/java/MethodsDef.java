package intro;

public class MethodsDef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDef m = new MethodsDef();
		String name = m.getData();
		System.out.println(name);
		
		MethodsDef2 m2 = new MethodsDef2();
		m2.getUserData();
	}

	public String getData() {
		
		System.out.println("Hello World!");
		return "semih burhan";
		
	}
}

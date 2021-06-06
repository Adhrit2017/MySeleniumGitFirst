package JavaConcepts;


public class GlobalLocalVariable {
	
	String Text = "Java veriable";
	int age = 25;

	public static void main(String[] args) {
		
		int a = 50;								//Local variable for main method
		System.out.println("Local variable=" +a);
		
		GlobalLocalVariable obj = new GlobalLocalVariable();
		 obj.add();
		 
		
		String text1 = obj.Text;
		// int i = text1.length();
		// System.out.println("length of text is=" +i);
		
		System.out.println("String text is =" +text1);
		System.out.println("Global Variable is =" +obj.age);
		
	}
	
	public void add() {
		
		int i =20;			//local variable for add method
		System.out.println(i);
	}

}

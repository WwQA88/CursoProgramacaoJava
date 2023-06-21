package application;

public class ProgramAula96 {

	public static void main(String[] args) {
		
		// laco for each
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for(int i = 0; i < vect.length; i++) {
			
			System.out.println(vect[i]);
		}
		
		System.out.println("-------------------------");
		for(String obj : vect) {
			
			System.out.println(obj);
		}

	}

}

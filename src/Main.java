import java.util.Scanner;

public class Main {

	static int  passLength=0;
	
	protected static int inSel=0;
	
	public static void main(String[] args) {
		
		
		
		
		while(inSel != 9) {
			
			Generator pg = new Generator();
			System.out.println("---Password Generator----");
			
			System.out.println("1. Hashed Password");
			System.out.println("2. Non-Hashed Password * Not yet available");
			System.out.println("3. Numeric * Not Yet Avaialable");
			System.out.println("4. Alpha-Numeric * Not Yet available");
			
			Scanner scan = new Scanner(System.in);
			inSel = scan.nextInt();
			
			
			
			
			
			
			switch(inSel) {
			
			case 1: getLength();
					System.out.println("Hashed Password: " + pg.generateHashedPassword(passLength) + "\n");
					break;
			
			}
			
			
			
			
		}
		
		
		
		

	}
	
	public static void getLength() {
		
		
		
		
		System.out.println("Specify password length:");
		Scanner scan = new Scanner(System.in);
		
		passLength = scan.nextInt();
		
		
		
		
	}

}



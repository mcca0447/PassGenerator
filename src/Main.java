import java.util.Scanner;

public class Main {

	static int  passLength=0;
	
	protected static int inSel=0;
	
	public static void main(String[] args) {
		
		menu();
	
		
		
		

	}
	
	
public static void menu() {
		
		while(inSel != 9) {
			
			Generator pg = new Generator();
			System.out.println("---Password Generator----");
			
			System.out.println("1. Hashed Password");
			System.out.println("2. Alpha-Numeric Password");
			System.out.println("3. Numeric Pin ");
			
			Scanner scan = new Scanner(System.in);
			inSel = scan.nextInt();			
			
			switch(inSel) {
			
			case 1: getLength();
					System.out.println("Hashed Password: " + pg.generateHashedPassword(passLength) + "\n");
					break;
					
			case 2: getLength();
					System.out.println("Alpha-Nunmeric Password: " + pg.generateAlphaNumericPassword(passLength) + "\n");
					break;
					
			case 3: getLength();
					System.out.println("Numeric Pin: " + pg.generateNumericPin(passLength) + "\n");
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



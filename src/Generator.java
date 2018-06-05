import java.security.SecureRandom;


public class Generator {
	
	static final String hashedCharOpt = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz(){}[]|!@#$%^&*-_";
	static final String alphaNumCharOpt = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	static final String numericCharOpt = "0123456789";
	
	static SecureRandom rnd = new SecureRandom();
	
	
	
	
	
	
	public static String pwGen(int pl , String lib) {
		
		int length= pl;
		
		
		StringBuilder sb = new StringBuilder(length);
		
		
		for (int i = 0; i < pl; i++ ) {
			sb.append( lib.charAt(rnd.nextInt(lib.length())));
		}
		return sb.toString();
	}
	
	public String generateHashedPassword(int pl) {
		
		return pwGen(pl, hashedCharOpt);

		
	}	
	
	public String generateAlphaNumericPassword(int pl) {
		
		return pwGen(pl, alphaNumCharOpt);
		
	}

	public String generateNumericPin(int pl) {
		
		return pwGen(pl, numericCharOpt);
		
	}

	
	

}
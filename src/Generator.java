import java.security.SecureRandom;


public class Generator {
	
	static final String hashedCharOpt = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz() {}[]|!@#$%^&*-_";
	static SecureRandom rnd = new SecureRandom();
	
	
	
	
	public String generateHashedPassword(int pl) {
		
		int length= pl;
		
	
		StringBuilder sb = new StringBuilder(length);
		
		
		for (int i = 0; i < pl; i++ ) {
			sb.append( hashedCharOpt.charAt(rnd.nextInt(hashedCharOpt.length())));
		}
		
		return sb.toString();
	}	
	
	

}
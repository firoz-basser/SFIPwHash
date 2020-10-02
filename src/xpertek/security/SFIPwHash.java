package xpertek.security;

import java.util.Base64;

public class SFIPwHash {

	private static String pw;
	private static String hash;
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			if(args.length>0)
				pw=(String)args[0];
			else
				pw="password444";
			hash = getHash(pw, "SHA");
			System.out.println("Hash of \""+pw +"\" is "+hash);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getHash(String data, String algorithm) throws SecurityException {
		try
		{
			if (data == null)
				return null;
			
			if (data.trim().length() == 0)
				return "";
			//MessageDigest md;
			//MessageDigest md = MessageDigest.getInstance(algorithm);
			//md.reset();
			
			//byte[] bin = md.digest(data.getBytes());

			return Base64.getEncoder().encodeToString(data.getBytes());			

		}
		catch (Exception e)
		{
			throw new SecurityException(e.getMessage());
		}
	}	
}
